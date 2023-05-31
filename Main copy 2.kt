fun bonus(cargo: String, xp: Int): Float {
    var bonus = 0f

    if (cargo == "gerente") {
        if (xp >= 2) {
            bonus = 3000f
        } else {
            bonus = 2000f
        }
    } else if (cargo == "coordenador") {
        if (xp < 1) {
            bonus = 1500f
        } else {
            bonus = 1800f
        }
    } else if (cargo == "engenheiro de software") {
        bonus = 1000f
    } else if (cargo == "estagiário") {
        bonus = 500f
    } else {
        bonus = 0f
    }
    return bonus
}

fun bonusWhen(cargo: String): Float {
    val bonus = when (cargo){
        "gerente" -> 2000f
        "coordenador" -> 1500f
        "engenheiro de software" -> 1000f
        "estagiário" -> 500f
        else ->  0f
    }
    return bonus
}


fun main() {
    bonusWhen(cargo = "~daiwjmndaw")
}