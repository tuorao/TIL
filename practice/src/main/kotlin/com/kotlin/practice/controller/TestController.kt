package com.kotlin.practice.controller

import com.kotlin.practice.model.Coffee
import com.kotlin.practice.repository.CoffeeRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(val coffeeRepository: CoffeeRepository) {

    @GetMapping("/")
    fun getCoffeeAndName(): String {
        print("ㅋㅋㅋ")
        return coffeeRepository.findAll().joinToString { coffee -> Coffee.nameAndCost(coffee.cost, coffee.name) }
    }
}


