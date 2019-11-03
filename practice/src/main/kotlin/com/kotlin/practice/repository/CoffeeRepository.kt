package com.kotlin.practice.repository

import com.kotlin.practice.model.Coffee
import org.springframework.data.jpa.repository.JpaRepository

interface CoffeeRepository : JpaRepository<Coffee, Long>