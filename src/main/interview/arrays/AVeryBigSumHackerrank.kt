package main.interview.arrays

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the aVeryBigSum function below.
fun aVeryBigSum(ar: Array<Long>): Long {
    var sum = 0L
    for (i in 0 until ar.size) {
        sum += ar[i]
    }
    return sum
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}
