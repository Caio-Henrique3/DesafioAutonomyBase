package br.com.autonomybase.application.device.usecase;

import br.com.autonomybase.adapter.device.web.dto.DeviceRequest;
import br.com.autonomybase.application.device.gateway.DeviceRepositoryGateway;
import br.com.autonomybase.domain.device.model.DeviceModel;
import br.com.autonomybase.domain.device.model.DeviceStatus;
import br.com.autonomybase.exception.NotFoundException;

import java.time.LocalDateTime;
import java.util.UUID;

public class UpdateDeviceUseCase {

    private final DeviceRepositoryGateway repository;

    public UpdateDeviceUseCase(DeviceRepositoryGateway repository) {
        this.repository = repository;
    }

    public void execute(UUID id, DeviceRequest request) {
        var device = getDeviceModel(id);

        device.setUpdatedAt(LocalDateTime.now());
        device.setName(request.name());
        device.setIp(request.ip());

        repository.save(device);
    }

    public void execute(UUID id) {
        var device = getDeviceModel(id);

        device.setUpdatedAt(LocalDateTime.now());
        device.setStatus(
                device.getStatus() == DeviceStatus.ACTIVE
                        ? DeviceStatus.INACTIVE
                        : DeviceStatus.ACTIVE
        );

        repository.save(device);
    }

    private DeviceModel getDeviceModel(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Device not found with id: " + id));
    }

}
