package com.kotlin.practice.model

import javax.persistence.*

@Entity
data class Coffee(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long?,
        @Column
        val cost: Int,
        @Column
        val name: String
) {
    constructor() : this(null, 0, "")

    companion object {
        fun nameAndCost(cost: Int, name: String) = name + " " + cost + "원"
    }
}