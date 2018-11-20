package main.interview.arrays

import java.util.*

fun main(args: Array<String>) {
    var count = readLine()!!.toInt()
    var totalCount = 0L
    val  sc = Scanner( System.`in`)
    while(count-- > 0) {
        totalCount += sc.nextLong()
    }
    println(totalCount)
}