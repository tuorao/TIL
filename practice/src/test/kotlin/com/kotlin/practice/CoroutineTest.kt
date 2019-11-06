package com.kotlin.practice

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import mu.KotlinLogging
import org.junit.jupiter.api.Test


class CoroutineTest {
    private val logger = KotlinLogging.logger {  }

    @Test
    fun t1() {
        GlobalScope.launch {
            delay(5000L)
            logger.info("test123")
        }
        logger.info("test2")
        runBlocking {
            logger.info("what?")
            delay(10000L)
        }
    }
}