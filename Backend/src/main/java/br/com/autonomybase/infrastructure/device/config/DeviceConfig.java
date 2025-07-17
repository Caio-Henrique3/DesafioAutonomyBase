package br.com.autonomybase.infrastructure.device.config;

import br.com.autonomybase.application.device.gateway.DeviceRepositoryGateway;
import br.com.autonomybase.application.device.usecase.*;
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

    @Bean
    public UpdateDeviceUseCase updateDeviceUseCase(DeviceRepositoryGateway deviceRepository) {
        return new UpdateDeviceUseCase(deviceRepository);
    }

    @Bean
    public DeleteDeviceUseCase deleteDeviceUseCase(DeviceRepositoryGateway deviceRepository) {
        return new DeleteDeviceUseCase(deviceRepository);
    }

}
