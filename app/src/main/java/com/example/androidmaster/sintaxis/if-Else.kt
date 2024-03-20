package com.example.androidmaster.sintaxis

fun main() {
    ifMultiple()
    ifInt()
    ifBoolean()
}

fun ifMultiple() {
    var edad = 18
    var permisoDeMisPadres = false
    var dinero = true

    if (edad >= 18 && permisoDeMisPadres || dinero){
    println("puedo beber")
    }else{
        println("no puedes beber na mijo")
    }
}
fun ifInt() {
    var edad = 12
    if(edad >= 18){
        println("puedes beber cerveza chaval")
    }else{
        println("no puedes ni lavarte los calzones")
    }
}


fun ifBoolean() {
    var soyFeliz:Boolean = true
    if (!soyFeliz){
        println("estoy feliz")
    }else{
        println("estoy triste")
    }
}


fun miPrimerIf() {
    val animal = "animal"
        if ( animal == "gato") {
            println("el animal es un gato")
        }else if(animal == "perro"){
            println("el animal es un perro :(")
        }else if( animal == "pajaro"){
            println("el animal es un pajarito feo >:v")
        }else{
            println("el animal no es un perro ni un pajaro ni un gato quiza sea una tortuga xd")
        }

}