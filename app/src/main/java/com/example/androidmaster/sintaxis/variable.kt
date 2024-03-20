package com.example.androidmaster.sintaxis

//VARIABLES
val age:Int = 30
var age1=24


fun main(){
    showMyName(name = "Adrielcito")
    showMyAge(24 )
    add(50, 75)
    var mySubtrack = subtract(11,5)
    println(mySubtrack)
}

fun showMyName( name:String) {
    println("me llamo $name")
}

fun showMyAge(currentAge:Int = 20) {
    println("tengo $currentAge años")
}

fun add(firsNumber:Int, secondNumber:Int){
    println(firsNumber + secondNumber)
}
fun subtract(firsNumber: Int, secondNumber: Int):Int {
    return firsNumber - secondNumber
}
fun subtrackCool(firsNumber: Int, secondNumber: Int):Int = firsNumber - secondNumber

fun variablesAlfanumericos(){
    /**
     * Variables alfanumericas
     */
    //Char
    val exampleChar1:Char ='a'
    val exampleChar2:Char ='2'
    val exampleChar3:Char ='@'
    //String
    val miString:String = "Adriel"


    var exampleStringHola= "hola!"
    exampleStringHola="hola me llamo $miString y tengo $age1 años"
    println(exampleStringHola)

    val example123:String= age1.toString()
    println (example123)
}

fun variablesNumericas(){
    /**
     * Variables numericas
     */
    //Int

    //operadores
    println("sumar")
    println(age + age1)

    println("restar")
    println(age - age1)

    println("multiplicar")
    println(age * age1)

    println("dividir")
    println(age / age1)

    println("modulo")
    println(age % age1)


    //Long
    val  exampleLong:Long = 12983273493821
    //Float
    val exampleFloat:Float = 10.5f
    //Double
    val exampleDouble:Double = 81762397.1928093

}

fun variablesBooleanas(){
    /**
     * Variables booleanas
     */
    //booleanas
    val exampleBooleano1:Boolean = false
    val exampleBooleano2:Boolean = true
}
