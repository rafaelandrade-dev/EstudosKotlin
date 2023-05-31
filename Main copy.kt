fun main() {
    /* Create a project that attend to the requirements down below:
        Declare a variable capable do store your full name
        Declare a text variable without any value
        Declare an immutable variable with the smallest type of data capable to store the size of your shoes
        Declare a variable capable to store the PIB of Brazil
        Declare a variable capable to store the population from Brazil
        Print the value of PIB per capita
        Run your program in a way that does not show any errors on executing
    */

    var nome = "Rafael Andrade Mendes"

    val text: String

    val sizeShoe: Short = 43

    val pibBrazil: Long = 189000000000

    val popBrazil: Int = 211000000

    val pibPerCapita = pibBrazil / popBrazil
    print(pibPerCapita)
}