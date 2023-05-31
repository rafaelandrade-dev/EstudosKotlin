fun quadrado() {
    print("Informe o lado 1:")
    val lado1 = readLine()


    print("Informe o lado 2:")
    val lado2 = readLine()


    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()

        if (x == y) {
            println("É um quadrado")
        } else {
            println("Não é um quadrado")
        }
    }
}

fun triangulo() {
    print("Informe o primeiro lado do triângulo:")
    val lado1 = readLine()

    print("Informe o segundo lado do triângulo:")
    val lado2 = readLine()

    print("Informe o terceiro lado do triângulo:")
    val lado3 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "" && lado3 != null && lado3 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()
        val z = lado3.toInt()

        if (x == y && x == z) {
            println("Você possui um triângulo equilátero")
        } else {
            println("Não é um triângulo equilátero")
        }
    }

}


fun portaria(){
    print("Por favor, insira sua idade: ")
    val idade = readLine()

    print("Insira o tipo de convite: ")
    val convite = readln()

    print("Insira o código do convite: ")
    val codigo = readln()


    if (idade != null && idade != "" && convite != null && convite != "" && codigo != null && codigo != "") {
        var age = idade.toInt()
        if (age < 18){
            println("Negado. Menores de idade não são permitidos.")
            return
        } else {
            if (convite != "comum" && convite != "premium" && convite != "luxo") {
                println("Negado. Convite inválido")
                return
            } else {
                if (codigo.startsWith("XL") || codigo.startsWith("XT")) {
                    println("Welcome:)")
                } else {
                    println("Código do convite inválido")
                }


            }
        }

    } else {
        println("O valor inserido foi inválido")
    }
}




fun main() {
    portaria()

}




