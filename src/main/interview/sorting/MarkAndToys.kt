package main.interview.sorting

fun main(args: Array<String>) {
    val input = readLine()!!.trim().split(" ").map { it.toInt() }
    val toysCount = input[0]
    var money = input[1]
    var itemCount = 0
    val priceList = readLine()!!.trim().split(" ").map { it.toInt() }.toIntArray()
    priceList.sort()
    for ( i in 0 until priceList.size) {
        val remainingAmount = money - priceList[i]
        if(remainingAmount>=0 && itemCount<toysCount) {
            itemCount++
            money = remainingAmount
        }
    }
    println(itemCount)
}