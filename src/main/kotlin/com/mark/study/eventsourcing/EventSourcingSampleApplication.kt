package com.mark.study.eventsourcing

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class EventSourcingSampleApplication {

}

fun main(args: Array<String>) {
    SpringApplication(EventSourcingSampleApplication::class.java).run(*args)
}
