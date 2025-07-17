package br.com.autonomybase.infrastructure.device.persistence.mapper;

import br.com.autonomybase.adapter.device.web.dto.DeviceResponse;
import br.com.autonomybase.domain.device.model.DeviceModel;
import br.com.autonomybase.infrastructure.device.persistence.entity.DeviceEntity;

public class DeviceMapper {

    public static DeviceModel toDomain(DeviceEntity entity) {
        return new DeviceModel(
                entity.getId(),
                entity.getName(),
                entity.getIp(),
                entity.getStatus()
        );
    }

    public static DeviceResponse toResponse(DeviceModel model) {
        return new DeviceResponse(
                model.getId(),
                model.getName(),
                model.getIp(),
                model.getStatus()
        );
    }

}
