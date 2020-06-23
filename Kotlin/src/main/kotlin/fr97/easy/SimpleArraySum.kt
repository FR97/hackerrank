package fr97.easy


import java.util.*


fun simpleArraySum(ar: Array<Int>): Int {
    return ar.sum()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    val result = simpleArraySum(ar)

    println(result)
}
