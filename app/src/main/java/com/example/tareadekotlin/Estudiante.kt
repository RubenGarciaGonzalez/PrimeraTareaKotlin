package com.example.tareadekotlin

class Estudiante (val nombre:String, val edad:Int, val dni:String , val curso:String ,  val repetidor:Boolean, val centro: String) {

    fun presentacion(){
        println("Me llamo ${this.nombre}, tengo ${this.edad} años y actualmente estoy cursando ${this.curso}. Repetidor? -> ${this.repetidor}")
    }

    fun ubicacion(){

        val centro = this.centro

        when(centro){
            "IES Al-Andalus" ->{
                println("El centro en dónde estudia ${this.nombre} (${this.centro}) se encuentra en Finca Santa Isabel, Paseo de la Caridad, s/n, 04008 Almería")
            }
            "IES Celia Viñas" ->{
                println("El centro en dónde estudia ${this.nombre} (${this.centro}) se encuentra en Calle Javier Sanz, 15, 04004 Almería ")
            }else ->{
                println("No podemos localizar el centro dónde estudia ${this.nombre} (${this.centro})")
            }

        }

    }

}