package br.com.autonomybase.infrastructure.device.gateway;

import br.com.autonomybase.application.device.gateway.DeviceRepositoryGateway;
import br.com.autonomybase.domain.device.model.DeviceModel;
import br.com.autonomybase.infrastructure.device.persistence.mapper.DeviceMapper;
import br.com.autonomybase.infrastructure.device.persistence.repository.DeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

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

}
