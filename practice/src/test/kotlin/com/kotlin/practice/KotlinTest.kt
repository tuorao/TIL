package com.kotlin.practice

import org.junit.jupiter.api.Test
import java.lang.StringBuilder
import java.lang.reflect.Type
import java.time.LocalDate

class KotlinTest {
    @Test
    fun test() {
        val strs = listOf("abc", "def")
        println(strs.flatMap { it.toList() })
    }

    // not with test
    @Test
    fun notWithTest() {
        val res = StringBuilder()
        for (letter in 'A'..'Z') {
            res.append(letter)
        }
        res.append("\nend")
        println(res.toString())
    }

    @Test
    fun withTest() {
        val res = with(StringBuilder()) {
            for (letter in 'A'..'Z') {
                this.append(letter)
            }
            append("\nend")
            this.toString()
        }
        println(res)
    }

    @Test
    fun applyTest() {
        val res = StringBuilder().apply {
            for (letter in 'A'..'Z') {
                append(letter)
            }
            append("\nend")
        }
        println(res.toString())
    }

    operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
            object: Iterator<LocalDate> {
                var current = start
                override fun hasNext(): Boolean {
                    return current <= endInclusive
                }

                override fun next(): LocalDate {
                    return current.apply {
                        current = plusDays(1)
                    }
                }
            }

    @Test
    fun operatorTest() {
        val newYear = LocalDate.ofYearDay(2017, 1)
        val daysOff = newYear.minusDays(1)..newYear

        for (dayOff in daysOff) {
            println(dayOff)
        }
    }

    // 5개까지 쪼갤수있
    fun splitFilename(fullName: String) : NameComponents {
        val result = fullName.split('.', limit = 2)
        return NameComponents(result[0], result[1])
    }

    @Test
    fun componentSplitTest() {
        val (name, ext) = splitFilename("example.kt")
        println(name)
        println(ext)
    }

    fun lambdaAction(operation: (Int, Int) -> Int) {
        println("result : ${operation(2 ,3)}")
    }

    @Test
    fun lambdaTest() {
        lambdaAction { a, b -> a * b }
    }

    fun <T> Collection<T>.joinToString(
            separator: String = ", ",
            prefix: String = "",
            postfix: String = "",
            transform: (T) -> String = { it.toString() }
    ): String {
        val result = StringBuilder(prefix)
        for ((index, element) in this.withIndex()) {
            if (index > 0) result.append(separator)
            result.append(transform(element))
        }
        result.append(postfix)
        return result.toString()
    }

    @Test
    fun joinToStringTest() {
        val letters = listOf("Alpha", "Beta")
        println(letters.joinToString())
        println(letters.joinToString { it.toLowerCase() })
    }
}

data class NameComponents(val name: String, val extension: String)