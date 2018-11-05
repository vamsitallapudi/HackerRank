package main.interview.hacklandelection

import com.sun.xml.internal.fastinfoset.util.StringArray
import java.util.*

fun main() {
    var list = StringArray()
    var iter = readLine()!!.toInt()
    while(iter-- > 0) {
        list.add(readLine()!!)
    }
    electionWinner(list)
}

fun electionWinner(list: StringArray) {
    val hashMap = HashMap<String, Int>()
    for (i in 0 until list.size) {
        if (hashMap.containsKey(list[i])) {
            hashMap[list[i]] = hashMap.getValue(list[i])+1
        } else {
            hashMap[list[i]] = 1
        }
    }
    for (i in 0 until hashMap.size) {
        Collections.max()
    }
}
