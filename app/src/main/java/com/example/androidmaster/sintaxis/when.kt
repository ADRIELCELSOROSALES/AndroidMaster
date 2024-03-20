package com.example.androidmaster.sintaxis

fun main() {
    pruebaDeWhen(110928)
}


fun pruebaDeWhen(month: Int) {
    val resultado = when (month) {
        in 1..6 -> "primera no se qué"
        in 7..12 -> "Ejemplo 2"
        else -> "fallo"
    }

    println(resultado)
}



fun result(value:Any){
    when (value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if (value) println("hola esto es un valor boolean true")
    }
}

fun getSemestre(month:Int){
    when(month){
        in 1..6 -> println("primer semestre")
        in 7..12 -> println("segundo semestre")
        !in 1..12 -> println("no es un semestre valido")
    }

}

fun getTrimester(month:Int){
    when(month){
        1, 2, 3 -> println("primer trimestre")
        4, 5, 6 -> println("segundo trimestre")
        7, 8, 9 -> println("tercer trimestre")
        10, 11, 12 -> println("cuarto trimestre")
        else -> println("no es un trimestre valido")

    }
}

fun getMonth(month:Int){
    when(month){
        1 -> println("enero")
        2 -> println("febrero")
        3 -> println("marzo")
        4 -> println("abril")
        5 -> println("mayo")
        6 -> println("junio")
        7 -> println("julio")
        8 -> println("agosto")
        9 -> println("septiembre")
        10 -> println("octubre")
        11 -> {println("noviembre")
               println("esto tambien se imprime")}
        12 -> println("diciembre")
        else -> println("no es ningun mes valido")
    }
}