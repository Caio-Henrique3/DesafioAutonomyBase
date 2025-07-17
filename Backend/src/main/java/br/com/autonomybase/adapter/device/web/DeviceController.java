package br.com.autonomybase.adapter.device.web;

import br.com.autonomybase.adapter.device.web.dto.DeviceRequest;
import br.com.autonomybase.adapter.device.web.dto.DeviceResponse;
import br.com.autonomybase.application.device.usecase.GetDeviceUseCase;
import br.com.autonomybase.application.device.usecase.ListDevicesUseCase;
import br.com.autonomybase.application.device.usecase.RegisterDeviceUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/devices")
public class DeviceController {

    private final GetDeviceUseCase getDeviceUseCase;
    private final ListDevicesUseCase listDevicesUseCase;
    private final RegisterDeviceUseCase registerDeviceUseCase;

    @GetMapping
    public ResponseEntity<List<DeviceResponse>> findAll() {
        return ResponseEntity.ok(listDevicesUseCase.execute());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DeviceResponse> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(getDeviceUseCase.execute(id));
    }

    @PostMapping
    public ResponseEntity<Void> create(@Valid @RequestBody DeviceRequest request) {
        DeviceResponse response = registerDeviceUseCase.execute(request);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(response.id())
                .toUri();

        return ResponseEntity.created(uri).build();
    }

}
