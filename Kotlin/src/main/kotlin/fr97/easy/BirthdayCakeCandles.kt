package fr97.easy

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*


fun birthdayCakeCandles(ar: Array<Int>): Int {
    val max = ar.max() ?: 0
    return ar.filter { it == max }.size
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = birthdayCakeCandles(ar)

    println(result)
}
