package com.example.demo

import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface CompanyRepository : ReactiveMongoRepository<Company, String>