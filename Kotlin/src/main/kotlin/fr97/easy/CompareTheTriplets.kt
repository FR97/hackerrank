package fr97.easy

import kotlin.collections.*
import kotlin.io.*

import kotlin.text.*


fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    return a.mapIndexed { i, score -> score.compareTo(b[i]) }
        .filter { it != 0 }
        .fold(arrayOf(0,0)) { arr, sc ->
            if(sc > 0) arr[0] = arr[0]+1
            else arr[1] = arr[1]+1
            arr
        }
}

fun main(args: Array<String>) {
    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
