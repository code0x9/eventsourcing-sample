package com.mark.study.eventsourcing.api

import com.mark.study.eventsourcing.model.Customer
import com.mark.study.eventsourcing.model.CustomerRepository
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.inject.Inject

@RestController
class EventSourcingSampleController {
    private val logger = LoggerFactory.getLogger(this.javaClass)

    @Inject
    lateinit var repository: CustomerRepository

    @GetMapping("/")
    fun index(): String {
        logger.info("!!!")
        repository.save(Customer("Jack", "Bauer"))
        repository.save(Customer("Chloe", "O'Brian"))
        repository.save(Customer("Kim", "Bauer"))
        repository.save(Customer("David", "Palmer"))
        repository.save(Customer("Michelle", "Dessler"))

        for (customer in repository.findAll()) {
            logger.info("customer: $customer")
        }

        val michelle = repository.findOne(5)
        logger.info("michelle: $michelle")

        for (bauer in repository.findByLastName("Bauer")) {
            logger.info("bauers: $bauer")
        }

        return "Hello Axon Framework."
    }
}
