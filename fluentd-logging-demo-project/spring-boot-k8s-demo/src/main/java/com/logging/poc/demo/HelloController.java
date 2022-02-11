package com.logging.poc.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * TODO: Document this class.
 */
@RestController
@Slf4j
public class HelloController {

    @GetMapping("/info")
    public String hello() {
        log.info("Hello logger example info");
        return "Hello world info!";
    }

    @GetMapping("/debug")
    public String debug() {
        log.debug("Hello logger example debug");
        return "Hello world debug!";
    }

    @GetMapping("/trace")
    public String trace() {
        log.trace("Hello logger example trace");
        return "Hello world trace!";
    }

    @GetMapping("/error")
    public String error() {
        log.error("Hello logger example error");
        return "Hello world error!";
    }

    @GetMapping("/ex")
    public String ex() {
        try {
            int i = Integer.parseInt("q")/2;
        } catch(Exception e) {
            log.error("Exception Exception error {}", e);
        }
        return "Hello world error!";
    }


}
