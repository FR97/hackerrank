package fr97.medium


import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the minimumLoss function below.
fun minimumLoss(price: Array<Long>): Int {
    val mappedByPrice = price.mapIndexed { i, p -> p to i.toLong() }.toMap()
    val sorted = price.sortedArray()
    return sorted
        .foldIndexed(Long.MAX_VALUE) { i, min, p ->
            val prevPrice = if (i == 0) 0 else sorted[i - 1]
            when {
                i == 0 -> min
                mappedByPrice.getOrDefault(p, 0L) < mappedByPrice.getOrDefault(prevPrice, 0L)
                        && p - prevPrice in 1 until min -> p - prevPrice
                else -> min
            }
        }.toInt()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val price = scan.nextLine().split(" ").map { it.trim().toLong() }.toTypedArray()

    val result = minimumLoss(price)

    println(result)
}
