package main.interview.arrays

import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val iter = sc.nextLine().split(" ")
    val size = iter[0]
    val rotations = iter[1].toInt()
    val arrayList = ArrayList(sc.nextLine().split(" "))

    performLeftRotation(arrayList, rotations)
}

fun performLeftRotation(arrayList: ArrayList<String>, rotations:Int) {
    var noOfTimes = rotations
    val iterator = arrayList.iterator()
    val list = ArrayList<String>()
    while (iterator.hasNext() && noOfTimes>0) {
        val l = iterator.next()
        list.add(l)
        iterator.remove()
        noOfTimes--
    }
    arrayList.addAll(list)
    arrayList.map { print("$it ") }
}
