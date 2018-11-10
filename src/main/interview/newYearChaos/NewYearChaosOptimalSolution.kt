package main.interview.newYearChaos

import java.util.Scanner


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val q = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        bribesCount(q)
    }
}

private fun bribesCount(q: Array<Int>) {
    var bribesCount = 0
    for (i in 0 until q.size) {
        if (q[i] - (i + 1) > 2) { // to check if value is greater than the place by 2. if it is, then
            println("Too chaotic")
            return
        }
        for (j in i until q.size) {
            if(q[j] < q[i]) bribesCount++
        }
    }
    println(bribesCount)
}