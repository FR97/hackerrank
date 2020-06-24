package fr97.medium

import java.util.*


// Complete the whatFlavors function below.
fun whatFlavors(cost: Array<Int>, money: Int): Unit {
    val mappedByPrice = cost.mapIndexed { i, c -> c to i + 1 }.toMap()

    for (i in cost.indices) {

        val price = cost[i]
        val leftover = money - price
        val id = mappedByPrice.getOrDefault(leftover, -1)

        if (id != i + 1 && id > 0) {
            println("${i + 1} ${mappedByPrice[leftover]}")
        }
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val money = scan.nextLine().trim().toInt()

        val n = scan.nextLine().trim().toInt()

        val cost = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

        whatFlavors(cost, money)
    }
}
