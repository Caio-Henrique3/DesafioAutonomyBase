package br.com.autonomybase.application.device.usecase;

import br.com.autonomybase.adapter.device.web.dto.DeviceResponse;
import br.com.autonomybase.adapter.device.web.dto.DeviceRequest;
import br.com.autonomybase.application.device.gateway.DeviceRepositoryGateway;
import br.com.autonomybase.infrastructure.device.persistence.mapper.DeviceMapper;

public class RegisterDeviceUseCase {

    private final DeviceRepositoryGateway repository;

    public RegisterDeviceUseCase(DeviceRepositoryGateway deviceRepository) {
        this.repository = deviceRepository;
    }

    public DeviceResponse execute(DeviceRequest request) {
        return DeviceMapper.toResponse(
                repository.save(
                        DeviceMapper.toDomain(request)
                )
        );
    }

}
