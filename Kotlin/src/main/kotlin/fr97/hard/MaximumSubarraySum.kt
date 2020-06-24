package fr97.hard

import java.util.*
import kotlin.math.max


fun maximumSum(a: Array<Long>, m: Long): Long {
    // Function to create powerset from given array
    fun powerSet(a: Array<Long>): Array<Array<Long>> =
        if (a.isEmpty()) arrayOf(emptyArray())
        else powerSet(a.sliceArray(1 until a.size)).let { it + it.map { it + a.first() } }

    // Fold over powerset to find maximum sum % m
    return powerSet(a).fold(0L) { curr, arr -> max(curr, arr.sum()%m)  }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val nm = scan.nextLine().split(" ")

        val n = nm[0].trim().toInt()

        val m = nm[1].trim().toLong()

        val a = scan.nextLine().split(" ").map { it.trim().toLong() }.toTypedArray()

        val result = maximumSum(a, m)

        println(result)
    }
}