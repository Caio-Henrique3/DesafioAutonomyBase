package br.com.autonomybase.domain.device.model;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeviceModel {
    private UUID id;

    private String name;
    private String ip;

    private DeviceStatus status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public DeviceModel(UUID id, String name, String ip, DeviceStatus status) {
        this.id = id;
        this.name = name;
        this.ip = ip;
        this.status = status;
        this.createdAt = LocalDateTime.now();
    }

}
