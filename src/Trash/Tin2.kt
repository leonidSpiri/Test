package Trash

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val vxod = scanner.next()
    var istrue = true
    val glas = arrayOf("a", "e", "i", "o", "u", "y")
    for (i in 0..vxod.length - 2) {
        if (glas.contains(vxod[i].toString()) && glas.contains(vxod[i + 1].toString())
                || !glas.contains(vxod[i].toString()) && !glas.contains(vxod[i + 1].toString())) {
            istrue = false
        }

    }
    if (istrue) println("YES")
    else println("NO")
}