package main.algorithms.warmup

fun main(args: Array<String>) {
    val input = readLine()!!.trim().split(":").toTypedArray()

    println(convertedTime(input))
}

fun convertedTime(input: Array<String>): String {

    val convertedString = StringBuffer()

    val lastString = input[input.size-1]
    val amOrPm = lastString.substring(lastString.length-2,lastString.length)
    if(amOrPm == "AM") {
        if(input[0] == "12") {
            convertedString.append("00")
        } else {
            convertedString.append(input[0])
        }
    } else if(amOrPm =="PM") {
        if(input[0] == "12") {
            convertedString.append(input[0])
        } else {
            convertedString.append("${input[0].toInt() +12}")
        }
    }
    convertedString.append(":${input[1]}")
    convertedString.append(":${lastString.substring(0,lastString.length-2)}")

    return convertedString.toString()
}
