package br.com.autonomybase.infrastructure.device.persistence.entity;


import br.com.autonomybase.domain.device.model.DeviceStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "devices")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeviceEntity {

    @Id
    private UUID id;

    private String name;
    private String ip;

    @Enumerated(EnumType.STRING)
    private DeviceStatus status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
