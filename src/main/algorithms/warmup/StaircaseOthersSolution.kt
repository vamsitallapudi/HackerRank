package main.algorithms.warmup

fun main(args: Array<String>) {
    val size = readLine()!!.toInt()
    (1..size).forEach {
        println(" ".repeat(size - it) + "#".repeat(it))
    }
}