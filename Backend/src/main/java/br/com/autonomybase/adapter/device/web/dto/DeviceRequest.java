package br.com.autonomybase.adapter.device.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DeviceRequest(
        @NotBlank(message = "Device name is required")
        String name,
        @NotBlank(message = "IP address is required")
        @Pattern(regexp = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$",
                message = "Invalid IP address format")
        String ip
) {
}

