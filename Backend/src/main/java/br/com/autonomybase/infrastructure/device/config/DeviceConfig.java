package br.com.autonomybase.infrastructure.device.config;

import br.com.autonomybase.application.device.gateway.DeviceRepositoryGateway;
import br.com.autonomybase.application.device.usecase.GetDeviceUseCase;
import br.com.autonomybase.application.device.usecase.ListDevicesUseCase;
import br.com.autonomybase.application.device.usecase.RegisterDeviceUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeviceConfig {

    @Bean
    public ListDevicesUseCase listDevicesUseCase(DeviceRepositoryGateway deviceRepository) {
        return new ListDevicesUseCase(deviceRepository);
    }

    @Bean
    public GetDeviceUseCase getDeviceUseCase(DeviceRepositoryGateway deviceRepository) {
        return new GetDeviceUseCase(deviceRepository);
    }

    @Bean
    public RegisterDeviceUseCase registerDeviceUseCase(DeviceRepositoryGateway deviceRepository) {
        return new RegisterDeviceUseCase(deviceRepository);
    }

}
