package com.test.cache;

import com.test.cache.service.CacheService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CacheRunner implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(CacheRunner.class);

    @Autowired
    private CacheService cacheService;

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("Started process to fetch configuration");
        // shall not pick from Cache
        LOGGER.info("Fetch Configuration ID 1 ==> " + cacheService.getConfiguration(1));
        // shall not pick from Cache
        LOGGER.info("Fetch Configuration ID 2 ==> " + cacheService.getConfiguration(2));
        // shall not pick from Cache
        LOGGER.info("Fetch Configuration ID 3 ==> " + cacheService.getConfiguration(3));
        // shall pick from Cache
        LOGGER.info("Fetch Configuration ID 1 ==> " + cacheService.getConfiguration(1));
        // shall pick from Cache
        LOGGER.info("Fetch Configuration ID 3 ==> " + cacheService.getConfiguration(3));
        // shall pick from Cache
        LOGGER.info("Fetch Configuration ID 2 ==> " + cacheService.getConfiguration(2));
        // shall pick from Cache
        LOGGER.info("Fetch Configuration ID 2 ==> " + cacheService.getConfiguration(2));
        // shall not pick from Cache
        LOGGER.info("Fetch Configuration ID 4 ==> " + cacheService.getConfiguration(4));
        LOGGER.info("Finished process to fetch configuration");
    }

}
