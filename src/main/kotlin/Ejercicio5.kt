fun main(){

    print("ingrese el radio del circulo pequeño: ")
    var r= readLine()!!.toDouble()
    println("el area de la corona es:  ${areaCorona(r)}")
    }

/*
. Escriba una función que halle el área de un círculo de acuerdo a la
siguiente fórmula: A=π×r2. Ahora escriba una función que halle el área de
la corona circular (región en verde en la siguiente figura) a partir de la
resta de las áreas del círculo grande (con radio R) y el círculo pequeño
(con radio r). En esta segunda función debe usar la primera. Además
escriba un programa que lea el valor de los dos radios y, usando la
función anterior, calcule y halle el área de la corona circular.
ENTRADAS
radio_Grande-->R
radio_Pequeño-->r

SALIDAS
area_Grande--> aG
area_Pequeño-->aP
area_Corona-->aC
 */


fun areaCorona(r:Double):Double{
    var area_Pequeña = (Math.pow(r,2.0)*Math.PI)
        fun areaGrande(R:Double):Double{
            val area_Grande = (Math.pow(R,2.0)*Math.PI)
        return area_Grande
        }
    print("ingrese el radio del circulo grande: ")
    var R= readLine()!!.toDouble()
    val area_Corona= areaGrande(R)-area_Pequeña
    return area_Corona
}
