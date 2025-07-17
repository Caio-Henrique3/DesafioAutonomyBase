package br.com.autonomybase.adapter.device.web;

import br.com.autonomybase.adapter.device.web.dto.DeviceResponse;
import br.com.autonomybase.application.device.usecase.ListDevicesUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/devices")
public class DeviceController {

    private final ListDevicesUseCase listDevicesUseCase;

    @GetMapping
    public ResponseEntity<List<DeviceResponse>> findAll() {
        return ResponseEntity.ok(listDevicesUseCase.execute());
    }

}
