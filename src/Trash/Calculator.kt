package Trash

import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)
    val stroka = "1 + 2 * ( 3 + 4 / 2 - ( 1 + 2 ) ) * 2 + 1"
    val chisloStack = ArrayDeque<Int>()
    val znakStack = ArrayDeque<Char>()

}

class Parser {
    private var operators = "+-*/"
    private var delimiters = "() $operators"
    var flag = true

    private fun isDelimiter(enter: String): Boolean {
        if (enter.length != 1) return false
        for (i in 0..delimiters.length) {
            if (enter[0] == delimiters[i]) return true
        }
        return false
    }

    private fun isOperator(enter: String): Boolean {
        if (enter == "u-") return true
        for (i in 0..operators.length) {
            if (enter[0] == operators[i]) return true
        }
        return false
    }

    private fun priority(enter: String): Int {
        if (enter == "(") return 1
        if (enter == "+" || enter == "-") return 2
        return if (enter == "*" || enter == "/") 3 else 4
    }

    fun chet(enter: String): List<String> {
        val postfix = ArrayList<String>()
        val stack = ArrayDeque<String>()



        return postfix
    }
}
