package main.interview.hacklandelection

import com.sun.xml.internal.fastinfoset.util.StringArray
import java.util.*

fun main() {
    val list = StringArray()
    var iter = readLine()!!.toInt()
    while(iter-- > 0) {
        list.add(readLine()!!)
    }
    electionWinner(list)
}

fun electionWinner(list: StringArray) {
    var winner = ""
    var max = 0
    val hashMap = HashMap<String, Int>()
    for (i in 0 until list.size) {
        if (hashMap.containsKey(list[i])) {
            hashMap[list[i]] = hashMap.getValue(list[i])+1
        } else {
            hashMap[list[i]] = 0
        }
    }
    for (entry in hashMap.entries) {
        if(entry.value > max) {
            max = entry.value
            winner = entry.key
        } else if(entry.value == max) {
            winner = if(entry.key > winner) entry.key else winner
        }
    }
    println(winner)
}
