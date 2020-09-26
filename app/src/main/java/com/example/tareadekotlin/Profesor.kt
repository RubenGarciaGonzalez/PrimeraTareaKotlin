package com.example.tareadekotlin

class Profesor(val nombre: String, val asignatura: Asignatura.Asignatura, val dni:String, val centro:String ) {

    fun presentacion(){
        println("Me llamo ${this.nombre} y soy profesor de ${this.asignatura} en el centro ${this.centro}. Mi DNI es ${this.dni}")
    }

}