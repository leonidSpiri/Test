package OLIMP

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var amountlec = sc.nextInt()
    val indexlec = sc.nextInt()
    var res = true
    for (i in 1..indexlec * 2) {
        val reallec = sc.nextInt()
        if (amountlec < reallec) {
            res = false
            break
        } else {
            amountlec = reallec
            res = true
        }
    }

    if (res) print("YES")
    else print("NO")
}
//reallec > amountlec &&