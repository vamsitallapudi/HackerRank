package main.algorithms.warmup

fun main(args: Array<String>) {
    var count = 0
    val sizeOfArray = readLine()!!.trim().toInt()
    val array = readLine()!!.trim().split(" ").map { it.toInt() }.toIntArray()
    for(i in 0 until sizeOfArray) count+=array[i]
    println(count)
}