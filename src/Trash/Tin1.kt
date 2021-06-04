package Trash

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val one = scanner.nextInt()
    val two = scanner.nextInt()
    val three = scanner.nextInt()
    val four = scanner.nextInt()
    when {
        one == three -> println("$two $one $three $four")
        one == four -> println("$two $one $four $three")
        two == three -> println("$one $two $three $four")
        two == four -> println("$one $two $four $three")
        else -> println("-1")
    }
}

