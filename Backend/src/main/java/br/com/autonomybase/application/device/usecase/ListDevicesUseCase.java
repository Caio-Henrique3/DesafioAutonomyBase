package br.com.autonomybase.application.device.usecase;

import br.com.autonomybase.adapter.device.web.dto.DeviceResponse;
import br.com.autonomybase.application.device.gateway.DeviceRepositoryGateway;
import br.com.autonomybase.infrastructure.device.persistence.mapper.DeviceMapper;

import java.util.List;

public class ListDevicesUseCase {

    private final DeviceRepositoryGateway repository;

    public ListDevicesUseCase(DeviceRepositoryGateway repository) {
        this.repository = repository;
    }

    public List<DeviceResponse> execute() {
        return repository.findAll()
                .stream()
                .map(DeviceMapper::toResponse)
                .toList();
    }

}
