import kotlin.math.cbrt

fun converteAnos(anos: Int) {
    println("$anos anos equivalem a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")

}

fun str(nome: String) {
    println(nome.length)
}

fun calc(cubo: Int) {
    println("${cubo * cubo * cubo}")
}

fun converterMilhas(milhas: Float): Float{
    return milhas * 1.6f
}

fun transformar(palavra: String){
    println("${palavra.replace(oldValue = "a", newValue = "x").lowercase()}")
}


fun main() {
    transformar(palavra = "Rafael")
}



