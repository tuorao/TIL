package com.kotlin.practice.controller

import com.kotlin.practice.model.Coffee
import com.kotlin.practice.service.CoffeeService
import mu.KotlinLogging
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(val coffeeService: CoffeeService) {
    private val logger = KotlinLogging.logger {}

    @GetMapping("/")
    fun getCoffeeAndName(): String {
        logger.info("getCoffee Test")
        return coffeeService.getCoffeeAndName()
    }

    @GetMapping("/init")
    fun init(): MutableList<Coffee> {
       return coffeeService.init()
    }
}


