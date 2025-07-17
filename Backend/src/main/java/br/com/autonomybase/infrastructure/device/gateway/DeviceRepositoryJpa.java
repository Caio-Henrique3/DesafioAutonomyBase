package br.com.autonomybase.infrastructure.device.gateway;

import br.com.autonomybase.application.device.gateway.DeviceRepositoryGateway;
import br.com.autonomybase.domain.device.model.DeviceModel;
import br.com.autonomybase.infrastructure.device.persistence.mapper.DeviceMapper;
import br.com.autonomybase.infrastructure.device.persistence.repository.DeviceRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class DeviceRepositoryJpa implements DeviceRepositoryGateway {

    private final DeviceRepository repository;

    @Override
    public List<DeviceModel> findAll() {
        return repository.findAll()
                .stream()
                .map(DeviceMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<DeviceModel> findById(UUID id) {
        return repository.findById(id)
                .map(DeviceMapper::toDomain);
    }

    @Override
    @Transactional
    public DeviceModel save(DeviceModel deviceModel) {
        return DeviceMapper.toDomain(
                repository.save(
                        DeviceMapper.toEntity(deviceModel)
                )
        );
    }

    @Override
    @Transactional
    public void deleteById(UUID id) {
        repository.deleteById(id);
    }

}
