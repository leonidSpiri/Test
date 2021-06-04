package Trash

import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)
    val stroka = "1 + 2 * ( 3 + 4 / 2 - ( 1 + 2 ) ) * 2 + 1"
    val chisloStack = ArrayDeque<Int>()
    val znakStack = ArrayDeque<Char>()
    for (i in 0..stroka.lastIndex){
        val vxod = stroka[i].toString()
        if (lvl(vxod) == -1) chisloStack.add(vxod.toInt())

    }

}

fun lvl(znak: String):Int{
    return when (znak) {
        "+" -> 1
        "-" -> 1
        "*" -> 2
        "/" -> 2
        "(" -> 0
        ")" -> 0
        " " -> 0
        else -> -1
    }
}