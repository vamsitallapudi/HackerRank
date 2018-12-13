package main.interview.dictionariesAndHashmaps

fun main(args: Array<String>) {
    val sizes = readLine()!!.trim().split(" ").map { it.toInt() }

    val magazine = HashMap<String, Int>(sizes[0])
    val ransomLine = HashMap<String, Int>(sizes[1])

    val magWords = readLine()!!.trim().split(" ").toTypedArray()
    val ransomWords = readLine()!!.trim().split(" ").toTypedArray()

    for(i in 0 until magWords.size) {
        if(magazine.containsKey(magWords[i])) {
            magazine[magWords[i]] = magazine.getValue(magWords[i]) + 1
        } else {
            magazine[magWords[i]] = 1
        }
    }
    for(i in 0 until ransomWords.size) {
        if(ransomLine.containsKey(ransomWords[i])) {
            ransomLine[ransomWords[i]] = ransomLine.getValue(ransomWords[i]) + 1
        } else {
            ransomLine[ransomWords[i]] = 1
        }
    }
    println(magazine)
}