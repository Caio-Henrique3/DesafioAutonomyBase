package br.com.autonomybase.adapter.device.web.dto;

import jakarta.validation.constraints.NotBlank;

public record DeviceRequest(
        @NotBlank String name,
        @NotBlank String ip
) {
}

