package com.example.demo

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import reactor.core.publisher.Flux

interface EmployeeRepository : ReactiveMongoRepository<Employee, ObjectId> {
    fun findByCompanyId(id: String): Flux<Employee>
}