package fr97.easy

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*


fun miniMaxSum(arr: Array<Int>) {
    val arrLong = arr.map { it.toLong() }
    val min = arrLong.sum() - arr.max()!!
    val max = arrLong.sum() - arr.min()!!
    println( "$min $max")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}
