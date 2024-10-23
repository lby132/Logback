package dev.be.logback.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MdcController {

    @GetMapping("/mdc")
    public String mdc() {
        MDC.put("job", "dev");
        log.trace("log -> trace");
        log.debug("log -> debug");
        log.info("log -> info");
        log.warn("log -> warn");
        log.error("log -> error");
        MDC.clear();
        return "mdc";
    }
}
