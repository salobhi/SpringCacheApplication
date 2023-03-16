package com.test.cache.repository;

import com.test.cache.model.ConfigModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class ConfigRepository {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigRepository.class);

    @Cacheable("config")
    public ConfigModel getConfiguration(Integer id) {
        addPause();
        LOGGER.info("Getting Configuration by ID {} from data source", id);
        return new ConfigModel(id, "Test Name " + id, "Test Value " + id);
    }

    private void addPause() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
