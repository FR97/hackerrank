package fr97.easy

import java.util.*


fun timeConversion(s: String): String {
    val amPm = s.substring(s.length - 2)
    val time = s.substring(0, s.length - 2).split(":")
    val hour = time[0].toInt()

    return when (amPm) {
        "AM" ->
            if (hour == 12)
                "00" + time.slice(1 until time.size).joinToString(":", prefix = ":")
            else
                time[0] + time.slice(1 until time.size).joinToString(":", prefix = ":")
        else ->
            if (hour == 12)
                "12" + time.slice(1 until time.size).joinToString(":", prefix = ":")
            else
                (hour + 12).toString() + time.slice(1 until time.size).joinToString(":", prefix = ":")
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()
    scan.next("\n")

    val result = timeConversion(s)

    println(result)
}
