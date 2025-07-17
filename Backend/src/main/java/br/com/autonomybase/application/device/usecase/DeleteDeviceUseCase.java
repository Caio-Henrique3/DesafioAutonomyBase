package br.com.autonomybase.application.device.usecase;

import br.com.autonomybase.application.device.gateway.DeviceRepositoryGateway;
import br.com.autonomybase.exception.NotFoundException;

import java.util.UUID;

public class DeleteDeviceUseCase {

    private final DeviceRepositoryGateway repository;

    public DeleteDeviceUseCase(DeviceRepositoryGateway repository) {
        this.repository = repository;
    }

    public void execute(UUID id) {
        repository.findById(id)
                .orElseThrow(
                        () -> new NotFoundException("Device not found with id: " + id));

        repository.deleteById(id);
    }

}
