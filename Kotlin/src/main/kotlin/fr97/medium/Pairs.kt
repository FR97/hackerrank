package fr97.medium

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.math.abs
import kotlin.text.*


fun pairs(k: Int, arr: Array<Int>): Int {
    arr.sort()

    var i = 1
    var j = 0
    var totalPairs = 0

    while (i < arr.size) {
        when {
            arr[i] - arr[j] == k -> {
                totalPairs++; j++
            }
            arr[i] - arr[j] < k -> i++
            else -> j++
        }
    }

    return totalPairs
}

// Functional solution, problem is it is too slow to pass hackerrank test
// TODO: try to improve performance to avoid timeout
fun pairsFunctional(k: Int, arr: Array<Int>): Int {
    val allPairs = arr
        .mapIndexed { i1, el1 -> arr.filterIndexed { i2, el2 -> i1 != i2 && abs(el1 - el2) == k }.size }
        .sum()
    // Above approach counts each pair twice
    return allPairs / 2
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine()!!.split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val arr = scan.nextLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = pairs(k, arr)

    println(result)
}
