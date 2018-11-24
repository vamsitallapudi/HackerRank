package main.algorithms.warmup

fun main(args: Array<String>) {
    val input = readLine()!!.toInt()
    for(i in 1..input) {
        repeat(input-i) {print(" ")}
        repeat(i) {print("#")}
        println()
    }
}