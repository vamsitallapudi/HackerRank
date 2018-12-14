package main.interview.dictionariesAndHashmaps

import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var count = sc.nextInt()
    sc.nextLine()// to skip the blank line caused due to nextint()

    while (count-- > 0) {
        val string1 = sc.nextLine()
        val string2 = sc.nextLine()
        if(checkCommonSubString(string1, string2)) println("YES") else println("NO")
    }
}

fun checkCommonSubString(string1: String, string2: String): Boolean {
    val str1BoolArray = Array(26) {false}
    for(i in 0 until string1.length) {
        str1BoolArray[string1[i] - 'a'] = true //making the hashmap positions as true based on characters
    }
    for( i in 0 until string2.length) {
        if(str1BoolArray[string2[i]-'a']) {
            return true
        }
    }
    return false
}
