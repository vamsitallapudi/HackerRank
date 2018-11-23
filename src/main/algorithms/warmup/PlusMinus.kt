package main.algorithms.warmup

import java.util.*
import kotlin.collections.*
import kotlin.text.*

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>) {

    var pos =0f
    var neg = 0f
    var neutral = 0f

    for (i in 0 until arr.size) {
        when {
            arr[i] > 0 -> pos++
            arr[i] < 0 -> neg++
            arr[i] == 0 -> neutral++
        }
    }

    println("%.6f".format(pos/arr.size))
    println("%.6f".format(neg/arr.size))
    println("%.6f".format(neutral/arr.size))


}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
