package com.kotlin.practice.controller

import com.kotlin.practice.model.Coffee
import com.kotlin.practice.model.constValue
import com.kotlin.practice.service.CoffeeService
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import mu.KotlinLogging
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(val coffeeService: CoffeeService) {
    private val logger = KotlinLogging.logger {}

    @GetMapping("/")
    fun getCoffeeNameAndCost(): String {
        logger.info("getCoffee Test")
        logger.info("전역변수 : {}", constValue)

        coffeeService.init()

        // 별도의 쓰레드로 실행됩니다
        // 10초간 쉬고 save를 하기 때문에 호출했을 때 launch 구문이 실행되기 이전의 결과가 보여집니다
        GlobalScope.launch {
            delay(10L)
            coffeeService.save(Coffee(null, 1000, "토피넛라떼"))
        }
        return coffeeService.getCoffeeNameAndCost()
    }
}


