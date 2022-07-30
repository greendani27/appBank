package com.example.appbank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var saldo = 388.54f
    var sueldo  = 764.82f
    var entero = 62

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fecha = "25/06/2002"
        var nombre = "greendani27"
        var vip = false
        var inicial = "G"

        var saludo = "Hola $nombre"

        if(vip) saludo += ", te queremos mucho"
        else saludo += ", quieres ser vip? paga la cuota"

        var mes = fecha.split("/")[1].toInt()

        when(mes) {
            1, 2, 3 -> println("\nEn invierno no hay ofertas de inversiones")
            4, 5, 6 -> println("\nEn primavera hay ofertas de inversiones con el 1.5% de interes")
            7, 8, 9 -> println("\nEn verano hay ofertas de inversiones con el 2.5% de interes")
            10, 11, 12 -> println("\nEn otoño hay ofertas de inversiones con el 3.5% de interes")
            else -> println("\n La fecha es erronea")
        }

        println(saludo)

        var pin = 1234
        var intentos = 0

        var claveIngresada = 1230

        do {
            println("Ingrese el pin: ")
            println("Clave ingresada: ${claveIngresada++}")
            intentos++
        } while (intentos < 3 && claveIngresada != pin)
        if(intentos == 3) println("Tarjeta bloqueada")


    }
}