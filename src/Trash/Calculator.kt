package Trash

import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)
    val stroka = scanner.nextLine()
    val parser = Parser()
    val expression = parser.calculation(stroka)
    if (parser.flag) {
        // for (x in expression) print("$x ")
        println(calculation(expression).toInt())
    }
}

private fun calculation(postfix: List<String>): Double {
    val stack = ArrayDeque<Double>()
    for (x in postfix) {
        if (x == "+") stack.push(stack.pop() + stack.pop())
        else if (x == "-") {
            val b = stack.pop().toDouble()
            val a = stack.pop().toDouble()
            stack.push((a - b))
        } else if (x == "*") stack.push(stack.pop() * stack.pop())
        else if (x == "/") {
            val b = stack.pop().toDouble()
            val a = stack.pop().toDouble()
            stack.push((a / b))
        } else if (x == "u-") stack.push(-stack.pop())
        else stack.push(x.toDouble())
    }
    return stack.pop()
}


class Parser {
    private var operators = "+-*/"
    private var delimiters = "() $operators"
    var flag = true

    private fun isDelimiter(enter: String): Boolean {
        if (enter.length != 1) return false
        for (i in 0..delimiters.lastIndex) {
            if (enter[0] == delimiters[i]) return true
        }
        return false
    }

    private fun isOperator(enter: String): Boolean {
        if (enter == "u-") return true
        for (i in 0..operators.lastIndex) {
            if (enter[0] == operators[i]) return true
        }
        return false
    }

    private fun priority(enter: String): Int {
        if (enter == "(") return 1
        if (enter == "+" || enter == "-") return 2
        return if (enter == "*" || enter == "/") 3 else 4
    }

    fun calculation(enter: String): List<String> {
        val postfix = ArrayList<String>()
        val stack = ArrayDeque<String>()
        val tokenizer = StringTokenizer(enter, delimiters, true)
        var previous = ""
        var current: String
        while (tokenizer.hasMoreTokens()) {
            current = tokenizer.nextToken()
            if (current == " ") continue
            if (isDelimiter(current)) {
                if (current == "(") stack.push(current)
                else if (current == ")") {
                    while (stack.peek() != "(") {
                        postfix.add(stack.pop())
                        if (stack.isEmpty()) {
                            flag = false
                            println("Скобки расставленны неправильно, или имется ошибка в коде. (Второе исключенно)")
                            return postfix
                        }
                    }
                    stack.pop()
                    if (!stack.isEmpty()) postfix.add(stack.pop())
                } else {
                    if (current == "-" && (previous == "" || (isDelimiter(previous) && previous != ")"))) current = "u-"
                    else {
                        while (!stack.isEmpty() && (priority(current) <= priority(stack.peek()))) {
                            postfix.add(stack.pop())
                        }
                    }
                    stack.push(current)
                }
            } else {
                postfix.add(current)
            }
            previous = current
        }

        while (!stack.isEmpty()) {
            if (isOperator(stack.peek())) postfix.add(stack.pop())
            else {
                flag = false
                println("Скобки расставленны неправильно, или имется ошибка в коде. (Второе исключенно)")
                return postfix
            }
        }
        return postfix
    }
}
