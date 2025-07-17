package br.com.autonomybase.infrastructure.device.persistence.repository;

import br.com.autonomybase.infrastructure.device.persistence.entity.DeviceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeviceRepository extends JpaRepository<DeviceEntity, UUID> {
}
