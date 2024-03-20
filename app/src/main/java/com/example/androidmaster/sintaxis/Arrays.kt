package com.example.androidmaster.sintaxis

fun main (){
    var name:String = "adriel"
    var name2:String = "adriel"
    var name3:String = "adriel"
    var name4:String = "adriel"


    //Indice 0-6
    //Tamaño 7

    val diasSemanales = arrayOf("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo")


    if(diasSemanales.size >=8) {
        println(diasSemanales[7])
    }else{
 //       println("no hay mas valores")
    }


    for( pedo in diasSemanales.indices){
    //    println(diasSemanales[pedo])
    }
    for((posicion, valor) in diasSemanales.withIndex()){
    //    println("la posicion $posicion, contiene $valor")
    }
    for (inventada in diasSemanales){
        println("ahora es $inventada")
    }
}
