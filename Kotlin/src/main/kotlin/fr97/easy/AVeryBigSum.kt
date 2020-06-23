package fr97.easy


import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*


fun aVeryBigSum(ar: Array<Long>): Long {
    return ar.sum()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val ar = scan.nextLine().split(" ").map { it.trim().toLong() }.toTypedArray()
    val result = aVeryBigSum(ar)

    println(result)
}
