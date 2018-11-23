package main.algorithms.warmup


// Complete the compareTriplets function below.
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {

    var scoreOfA = 0
    var scoreOfB = 0

    for(i in 0 until a.size) {
        if(a[i] > b[i]) {
            scoreOfA += 1
        } else if(b[i] > a[i]) {
            scoreOfB+=1
        }
    }
    return arrayOf(scoreOfA,scoreOfB)
}

fun main(args: Array<String>) {
    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}