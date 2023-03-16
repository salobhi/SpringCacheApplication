package com.test.cache.service;

import com.test.cache.model.ConfigModel;
import com.test.cache.repository.ConfigRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CacheService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CacheService.class);
    @Autowired
    private ConfigRepository configRepository;

    public ConfigModel getConfiguration(Integer id) {
        LOGGER.info("Getting Configuration by ID {} from service", id);
        return configRepository.getConfiguration(id);
    }
}
