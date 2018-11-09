package main.interview.newYearChaos

import java.util.*
import kotlin.math.max

private fun minimumBribes(q: Array<Int>) {
    var bribesCount = 0
    for (i in (q.size - 1) downTo 0) {
        if (q[i] - (i + 1) > 2) { // to check if value is greater than the place by 2. if it is, then
            println("Too chaotic")
            return
        }
        for (j in max(0, q[i] - 2) until i) //
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