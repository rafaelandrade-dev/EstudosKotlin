fun caixa() {
    val caixa: Int = 2000
    var balao: Int = 7
    var count: Int = 0

    while (balao < caixa) {
        balao += 7
        count++

    }
    println("Cabem $count balões na caixa d'água")


}

fun fizzBuzz() {
    var count: Int = 0

    while (count < 50) {
        print("$count")

        if (count % 3 == 0 && count % 5 == 0) {
            print(" FizzBuzz")
        } else if (count % 3 == 0) {
            print(" Buzz")
        } else if (count % 5 == 0) {
            print(" Fizz")
        }

        count++
        println()
    }
}

fun invertido(str: String) {

    var i = str.length - 1
    while (i >= 0) {
        print(str[i])
        i--
    }

}

fun xo(str: String): Boolean {
    var strLower = str.lowercase()

    var countX = 0
    var countO = 0

    var i = 0
    while (i < strLower.length) {
        if (strLower[i] == 'x') {
            countX++
        } else if (strLower[i] == 'o') {
            countO++
        }
        i++
    }


    return (countX == countO && countX != 0)
}


fun main() {
    println(xo("xxoooxxo"))// true
    println(xo("xxoxx"))// false
    println(xo("dkjlnawb"))// false
    println(xo("xxozzzzzzzzz"))// false
}


/*
    for (i in 1..50){
        print("$i ")
    }
*/

/*
    for (i in 50 downTo 1){
        print("$i ")
    }
*/
/*
    for (i in 1..50){
        if(i%5 == 0) {
            continue
        }
        print("$i ")
    }

    for (i in 1..n){
        for(j in 1..i){
            print("#")
        }
        println()
    }
*/
