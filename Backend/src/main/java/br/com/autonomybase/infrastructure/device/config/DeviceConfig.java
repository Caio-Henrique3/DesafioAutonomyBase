package br.com.autonomybase.infrastructure.device.config;

import br.com.autonomybase.application.device.gateway.DeviceRepositoryGateway;
import br.com.autonomybase.application.device.usecase.ListDevicesUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeviceConfig {

    @Bean
    public ListDevicesUseCase listDevicesUseCase(DeviceRepositoryGateway deviceRepository) {
        return new ListDevicesUseCase(deviceRepository);
    }

}
