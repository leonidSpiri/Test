package OLIMP

import java.util.*

fun main() {
    val array = arrayOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z")
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    var base = 37
    val find = scanner.next()
    var otvet = 0
    for (i in 2..36) {
        var buff = number
        val stack = ArrayList<String>()
        while (buff > 0) {
            val ost = buff % i
            buff /= i
            stack.add(array[ost])
        }
        if (stack.contains(find)) {
            var how = 0
            for (j in 0..stack.lastIndex) {
                if (stack[j].equals(find)) {
                    how++
                }
            }
            if (how > otvet) {
                base = i
                otvet = how
            }
        }

    }

    println(base)
}