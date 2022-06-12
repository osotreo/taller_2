

fun main(){
 print( "cual es el angulo en que se encuentra la escalera:  ")
 var a = readLine()!!.toDouble()
 print( "a que altura se encuentra apoyada la escalera:  ")
 var j = readLine()!!.toDouble()
 println("esta es la longitud de la escalera:   ${longitud(a,j)}")
 }
  /*

 Escriba una función que calcule la longitud de la escalera y si conocemos
la altura que tiene la escalera (x) cuando esta inclinada sobre la pared con
un ángulo α. Tenga en cuenta la siguiente figura:
Escriba el programa que use la función anterior para hallar la longitud de
la escalera a partir de los otros datos.
ENTRADAS
angulo-->a
altura-->j
SALIDAS
longitud escalera-->y
   */


fun longitud(a:Double,j:Double):Double {
var final = (Math.sinh(a)/j)
return final
}


