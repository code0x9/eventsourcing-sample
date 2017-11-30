package com.mark.study.eventsourcing.model

import org.springframework.data.jpa.repository.JpaRepository
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.transaction.Transactional

@Entity
data class Customer(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Long,
        val firstName: String,
        val lastName: String) {
    constructor(firstName: String, lastName: String) : this(0, firstName, lastName)
}

@Transactional
interface CustomerRepository : JpaRepository<Customer, Long> {
    fun findByLastName(lastName: String): Iterable<Customer>
}
