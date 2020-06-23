package fr97.medium


import java.util.*
import kotlin.io.*
import kotlin.math.sqrt

fun encryption(s: String): String {
    val withoutSpaces = s.filterNot { it == ' ' }
    val lengthSqrt = sqrt(withoutSpaces.length.toDouble()).toInt()
    val col = if(withoutSpaces.length > lengthSqrt*lengthSqrt) lengthSqrt+1 else lengthSqrt

    val matrix = withoutSpaces
        .chunked(col)
        .map { it.chunked(1) }

    return matrix.getOrElse(0) { emptyList() }
        .mapIndexed { i, _ -> matrix.map { c -> c.getOrElse(i){""} } }
        .joinToString(" ") { it.joinToString("") }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = encryption(s)

    println(result)
}