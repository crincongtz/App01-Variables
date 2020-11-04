package com.crincongtz.myapp_01variables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    var numero: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        numero = 123

        val a = numero!! + 1

        val variableUno = 22

        val variableDos = "String"

        val varTres: Int = 10

        val variableCuatro: String = "Hola mundo"

//        variableUno = 10

//        Log.d("CursoKotlin")
        Log.d("CursoKotlin", "El valor de la variable1 = $variableUno")

        var entero = 10

        Log.d("CursoKotlin", "El valor de la variable entero = $entero")

        entero = 33

        Log.d("CursoKotlin", "El nuevo valor de la variable entero = $entero")


        variableUno.inc()

        Log.i("CursoKotlin", "El valor de la variableUno = ${variableUno.inc()}")

        Log.w("CursoKotlin", "El valor de la variableDos[0] = ${variableDos.reversed()}")


//        Log.v  Verbose
//        Log.d  Debug
//        Log.i  Info
//        Log.w  Warning
//        Log.e  Error

        val double = 18.243857394857349875934
        var caracter: Char = 'a'
        var stringUno = 'S'

        val floatUno = 12.45f

        val enteroLargo: Long = 3234234
    }


}