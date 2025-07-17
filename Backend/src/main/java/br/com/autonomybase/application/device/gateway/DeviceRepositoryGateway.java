package br.com.autonomybase.application.device.gateway;

import br.com.autonomybase.domain.device.model.DeviceModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DeviceRepositoryGateway {

    List<DeviceModel> findAll();

    Optional<DeviceModel> findById(UUID id);

    DeviceModel save(DeviceModel deviceModel);

    void deleteById(UUID id);

}

