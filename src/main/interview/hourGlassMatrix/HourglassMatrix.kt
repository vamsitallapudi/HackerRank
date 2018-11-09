package main.interview.hourGlassMatrix

import java.util.*

fun main() {
    val sumList = ArrayList<Int>()
    val rows = 6
    val columns = 6

    val array = Array(rows) {IntArray(columns)}

    val sc = Scanner(System.`in`)

    for (i in array.indices) {
        for (j in array.indices) {
            array[i][j] = sc.nextInt()
        }
    }

    for (i in 0..3) {
        for (j in 0..3) {
            sumList.add(calculateSumOfHourGlass(array, i, j))
        }
    }

    println(Collections.max(sumList))
}

private fun calculateSumOfHourGlass(array: Array<IntArray>, i: Int, j: Int): Int {
    return array[i][j] + array[i][j + 1] + array[i][j + 2] + array[i + 1][j + 1] + array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2]
}