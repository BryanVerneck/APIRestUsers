package com.example.restservice.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping("/logger")
    public String index(){
        logger.trace("A TRACE message");
        logger.debug("A DEBUG message");
        logger.info("A INFO message");
        logger.warn("A WARN message");
        logger.error("An ERROR message");

        return "check out the logs to see the output";

    }
}
