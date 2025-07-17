package br.com.autonomybase.infrastructure.device.persistence.mapper;

import br.com.autonomybase.adapter.device.web.dto.DeviceResponse;
import br.com.autonomybase.adapter.device.web.dto.DeviceRequest;
import br.com.autonomybase.domain.device.model.DeviceModel;
import br.com.autonomybase.domain.device.model.DeviceStatus;
import br.com.autonomybase.infrastructure.device.persistence.entity.DeviceEntity;

import java.util.UUID;

public class DeviceMapper {

    public static DeviceEntity toEntity(DeviceModel deviceModel) {
        return DeviceEntity.builder()
                .id(deviceModel.getId())
                .name(deviceModel.getName())
                .ip(deviceModel.getIp())
                .status(deviceModel.getStatus())
                .createdAt(deviceModel.getCreatedAt())
                .updatedAt(deviceModel.getUpdatedAt())
                .build();
    }

    public static DeviceModel toDomain(DeviceEntity entity) {
        return new DeviceModel(
                entity.getId(),
                entity.getName(),
                entity.getIp(),
                entity.getStatus()
        );
    }

    public static DeviceModel toDomain(DeviceRequest request) {
        return new DeviceModel(
                UUID.randomUUID(),
                request.name(),
                request.ip(),
                DeviceStatus.ACTIVE
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
