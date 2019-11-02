package com.kotlin.practice.controller

import com.kotlin.practice.model.Coffee
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/")
    fun getCoffeeAndName(): String {
        val list = arrayListOf<Coffee>()
        list.add(Coffee(500, "아메리카노"))
        list.add(Coffee(700, "라떼"))

        return list.joinToString { coffee -> Coffee.nameAndCost(coffee.cost, coffee.name) }
    }
}


