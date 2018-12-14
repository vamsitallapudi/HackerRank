package main.interview.dictionariesAndHashmaps

fun main(args: Array<String>) {
    val sizes = readLine()!!.trim().split(" ").map { it.toInt() }

    val magazineMap = HashMap<String, Int>(sizes[0])
    val ransomMap = HashMap<String, Int>(sizes[1])

    val magWords = readLine()!!.trim().split(" ").toTypedArray()
    val ransomWords = readLine()!!.trim().split(" ").toTypedArray()

    for(i in 0 until magWords.size) {
        if(magazineMap.containsKey(magWords[i])) {
            magazineMap[magWords[i]] = magazineMap.getValue(magWords[i]) + 1
        } else {
            magazineMap[magWords[i]] = 1
        }
    }
    for(i in 0 until ransomWords.size) {
        if(ransomMap.containsKey(ransomWords[i])) {
            ransomMap[ransomWords[i]] = ransomMap.getValue(ransomWords[i]) + 1
        } else {
            ransomMap[ransomWords[i]] = 1
        }
    }
    if(checkIfPossible(ransomMap, magazineMap))
        println("Yes")
    else
        println("No")
}

private fun checkIfPossible(ransomMap: HashMap<String, Int>, magazineMap: HashMap<String, Int>): Boolean {
    for (i in ransomMap.entries) {
        return if (magazineMap.containsKey(i.key)) {
            if(magazineMap[i.key]!! - ransomMap[i.key]!! >= 0) {
                continue
            } else {
                false
            }
        } else {
            false
        }
    }
    return true
}