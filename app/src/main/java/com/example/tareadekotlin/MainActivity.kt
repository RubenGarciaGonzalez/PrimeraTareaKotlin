package com.example.tareadekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        classes()
    }

    fun classes(){

        //Creación de un estudiantes
        var estudiante = Estudiante("Rubén", 16, "77247854P", "4º ESO", false, "IES Al-Andalus")
        estudiante.presentacion()
        estudiante.ubicacion()

        var estudiante1 = Estudiante("Laura", 19, "77469852P", "2º BACH", true, "IES Celia Viñas")
        estudiante1.presentacion()
        estudiante1.ubicacion()

        var estudiante2 = Estudiante("Rodolfo", 13, "77968124S", "2º ESO", false, "IES Alborán")
        estudiante2.presentacion()
        estudiante2.ubicacion()


        //Creación de un profesores
        var profesor = Profesor("Antonio",Asignatura.Asignatura.Matematicas , "5487459X", "IES Al-Andalus")
        profesor.presentacion()

        var profesor1 = Profesor("Isabel",Asignatura.Asignatura.Ingles , "7841459X", "IES Nicolas Salmerón y Alonso")
        profesor1.presentacion()

    }
}


