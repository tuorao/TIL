package com.kotlin.practice.service

import com.kotlin.practice.model.Coffee
import com.kotlin.practice.repository.CoffeeRepository
import org.springframework.stereotype.Service

@Service
class CoffeeService(val coffeeRepository: CoffeeRepository) {

    fun getCoffeeAndName() = coffeeRepository.findAll()
            .joinToString { coffee -> Coffee.nameAndCost(coffee.cost, coffee.name)}

    fun init(): MutableList<Coffee> = coffeeRepository.saveAll(listOf(
            Coffee(null, 500, "아메리카노"),
            Coffee(null, 700, "라떼"),
            Coffee(null, 900, "헤이즐넛")
    ))
}