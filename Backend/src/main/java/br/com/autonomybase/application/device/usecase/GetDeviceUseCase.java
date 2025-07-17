package br.com.autonomybase.application.device.usecase;

import br.com.autonomybase.adapter.device.web.dto.DeviceResponse;
import br.com.autonomybase.application.device.gateway.DeviceRepositoryGateway;
import br.com.autonomybase.exception.NotFoundException;
import br.com.autonomybase.infrastructure.device.persistence.mapper.DeviceMapper;

import java.util.UUID;

public class GetDeviceUseCase {

    private final DeviceRepositoryGateway repository;

    public GetDeviceUseCase(DeviceRepositoryGateway repository) {
        this.repository = repository;
    }

    public DeviceResponse execute(UUID id) {
        return DeviceMapper.toResponse(
                repository.findById(id)
                        .orElseThrow(
                                () -> new NotFoundException("Device not found with id: " + id))
        );
    }

}
