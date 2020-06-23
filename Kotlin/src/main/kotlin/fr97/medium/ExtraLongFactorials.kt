package fr97.medium

import java.math.*
import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*


fun extraLongFactorials(n: Int): Unit {
    val factorial = (1..n).fold(BigInteger.ONE) { a, b -> a.times(b.toBigInteger()) }
    println(factorial)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    extraLongFactorials(n)
}
