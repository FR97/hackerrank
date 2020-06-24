package fr97.medium

import java.util.*


// Complete the whatFlavors function below.
fun whatFlavors(cost: Array<Int>, money: Int): Unit {
    val map = mutableMapOf<Int, Int>()

    for (i in cost.indices) {
        val id = i + 1
        val price: Int = cost[i]
        val leftover = money - price

        if (map.containsKey(leftover)) {
            println("${map[leftover]} $id")
        }
        map.putIfAbsent(price, id)
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
