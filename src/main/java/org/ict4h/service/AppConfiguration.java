package org.ict4h.service;

import org.ict4h.domain.configuration.AppConfig;
import org.ict4h.domain.configuration.AppConfigs;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties
public class AppConfiguration {
    private final AppConfigs appConfigs = new AppConfigs();

    public AppConfigs getAppConfigs() {
        return appConfigs;
    }

    public List<String> getAppNames() {
        List<String> appNames = new ArrayList<>();
        for (AppConfig appConfig : appConfigs) {
            appNames.add(appConfig.getAppName());
        }
        return appNames;
    }

    public AppConfig getAppConfigForApp(String appName) {
        return appConfigs.getForApp(appName);
    }
}
