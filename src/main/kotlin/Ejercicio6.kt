fun main(){
print("ingrese el valor del lado A:  ")
var a = readLine()!!.toDouble()
    print("ingrese el valor del lado B:  ")
    var b = readLine()!!.toDouble()
    print("ingrese el valor del lado C:  ")
    var c = readLine()!!.toDouble()
println("el area del terreno es:  ${area(a,b,c)}")
println("el perimetro del terreno es:  ${perimetro(a,b,c)}")

}
/*

6. Una empresa inmobiliaria vende terrenos con la forma a continuación: Escriba funciones que nos ayuden a encontrar el área y el perímetro del terreno. o Escriba una función que halle el área de un rectángulo a partir de su base y su altura o Escriba una función que halle la hipotenusa de un triángulo rectángulo a partir de los catetos del triángulo. o Encuentre el área de un triángulo a partir de su base y su altura o Encuentre el perímetro del terreno a partir de los lados A, B, C (hay que encontrar la hipotenusa). o El programa debe leer las dimensiones de los 3 lados y hallar el área y el perímetro del terreno usando las funciones anteriores.
ENTRADAS
Lado A-->a-->Double
Lado B-->b-->Double
Lado C-->c-->Double
SALIDAS
area del terreno-->A-->Double
perimetro del terreno-->P-->Double
 */

fun area(a:Double,b:Double,c:Double):Double{
    var areas = ((b*(a-c))/2.0)+(b*c)
    return areas
}
fun perimetro(a:Double,b:Double,c:Double):Double{
    var perimetros = (Math.sqrt((Math.pow(b,2.0)+Math.pow((a-c),2.0))) +a+b+c)
    return perimetros
}

