package main.interview.arrays

import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val iter = sc.nextLine().split(" ")
    val size = iter[0].toInt()
    val shiftAmount = iter[1].toInt()
    val array = Array(size) {0}

    for (i in 0 until size) {
        val newLocation = (size +(i - shiftAmount)) % size
        array[newLocation] = sc.nextInt()
    }
    array.map { print("$it ") }
}
