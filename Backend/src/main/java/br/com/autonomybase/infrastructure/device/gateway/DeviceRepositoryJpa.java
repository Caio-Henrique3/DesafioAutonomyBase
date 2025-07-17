package br.com.autonomybase.infrastructure.device.gateway;

import br.com.autonomybase.application.device.gateway.DeviceRepositoryGateway;
import br.com.autonomybase.domain.device.model.DeviceModel;
import br.com.autonomybase.infrastructure.device.persistence.mapper.DeviceMapper;
import br.com.autonomybase.infrastructure.device.persistence.repository.DeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class DeviceRepositoryJpa implements DeviceRepositoryGateway {

    private final DeviceRepository springRepo;

    @Override
    public List<DeviceModel> findAll() {
        return springRepo.findAll()
                .stream()
                .map(DeviceMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<DeviceModel> findById(UUID id) {
        return springRepo.findById(id)
                .map(DeviceMapper::toDomain);
    }

    @Override
    public DeviceModel save(DeviceModel deviceModel) {
        return DeviceMapper.toDomain(
                springRepo.save(
                        DeviceMapper.toEntity(deviceModel)
                )
        );
    }

    @Override
    public void deleteById(UUID id) {
        springRepo.deleteById(id);
    }

}
