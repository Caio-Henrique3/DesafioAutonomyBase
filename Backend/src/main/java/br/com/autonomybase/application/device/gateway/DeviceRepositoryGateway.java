package br.com.autonomybase.application.device.gateway;

import br.com.autonomybase.domain.device.model.DeviceModel;

import java.util.List;

public interface DeviceRepositoryGateway {

    List<DeviceModel> findAll();

}

