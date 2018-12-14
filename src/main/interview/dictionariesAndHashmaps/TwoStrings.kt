package main.interview.dictionariesAndHashmaps

import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var count = sc.nextInt()
    sc.nextLine()// to skip the blank line caused due to nextint()

    while (count-- > 0) {
        val string1 = sc.nextLine()
        val string2 = sc.nextLine()
        if(containsCommonSubstring(string1, string2)) println("YES") else println("NO")
    }
}

fun containsCommonSubstring(str1:String, str2:String): Boolean {
    val str1SubStringsList = fetchSubStringList(str1)
    val str2SubStringsList = fetchSubStringList(str2)
    for (i in 0 until str2SubStringsList.size) {
        if(str1SubStringsList.contains(str2SubStringsList[i])) {
            return true
        } else {
            continue
        }
    }
    return false
}

fun fetchSubStringList(str: String) : List<String> {
    var strList = ArrayList<String>()
    for(i in 0 until str.length) {
        for(j in i+1 .. str.length) {
            strList.add(str.substring(i,j))
        }
    }
    return strList
}
