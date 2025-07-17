package br.com.autonomybase.adapter.device.web.dto;

import br.com.autonomybase.domain.device.model.DeviceStatus;

import java.util.UUID;

public record DeviceResponse(
        UUID id,
        String name,
        String ip,
        DeviceStatus status
) {
}
