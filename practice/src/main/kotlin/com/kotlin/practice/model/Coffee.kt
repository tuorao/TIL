package com.kotlin.practice.model

data class Coffee(
        val cost: Int,
        val name: String
) {
    companion object {
        fun nameAndCost(cost: Int, name: String) = name + " " + cost + "원"
    }
}