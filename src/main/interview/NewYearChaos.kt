package main.interview

import java.util.*
import kotlin.math.max

// Complete the minimumBribes function below.
fun minimumBribes(q: Array<Int>) {
    var bribesCount = 0
    for (i in (q.size - 1) downTo 0) {
        if (q[i] - (i + 1) > 2) {
            println("Too chaotic")
            return
        }
        for (j in max(0, q[i] - 2) until i)
            if (q[j] > q[i]) bribesCount++
    }
    println(bribesCount)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val q = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        minimumBribes(q)
    }
}