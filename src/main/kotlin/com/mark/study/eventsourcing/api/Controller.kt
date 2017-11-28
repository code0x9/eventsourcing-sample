package com.mark.study.eventsourcing.api

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EventSourcingSampleController {
    private val logger = LoggerFactory.getLogger(this.javaClass)

    @GetMapping("/")
    fun index(): String {
        logger.info("!!!")
        return "Hello Axon Framework."
    }
}
