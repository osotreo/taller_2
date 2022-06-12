fun main(){
print("valor de x para el primer punto:  ")
var x1 = readLine()!!.toDouble()
    print("valor de x para el segundo punto:  ")
    var x2 = readLine()!!.toDouble()
    print("valor de y para el primer punto:  ")
    var y1 = readLine()!!.toDouble()
    print("valor de y para el segundo punto:  ")
    var y2 = readLine()!!.toDouble()
println("el valor de la distancia entre dos puntos es:   ${distancia(x1,x2,y1,y2)} ")
    println("el valor de la pendiente de la recta es:   ${pendiente(x1,x2,y1,y2)} ")
    println("el valor de la coordenada del punto medio entre dos puntos es:   ${coordenada(x1,x2,y1,y2)} ")

}
/*
 Ahora escriba un programa que lea las dos coordenadas de dos puntos, y que imprima,
 usando las funciones anteriores,
 la distancia entre esos puntos, la pendiente de la recta que une esos dos puntos y el punto medio.
ENTRADAS
coordenada x1-->Double
coordenada x2-->Double
coordenada y1-->Double
coordenada y2-->Double

SALIDAS
pendiente de la recta --> m:Double
distancia entre 2 ptos-->d:Double
pto medio -->m2:Double

 */


fun distancia(x1:Double,x2:Double,y1:Double,y2:Double):Double{
    var d = Math.sqrt(Math.pow((y2-y1),2.0)+Math.pow((x2-x1),2.0))
    return d
}

fun pendiente(x1:Double,x2:Double,y1:Double,y2:Double):Double{
    var m = (y2-y1)/(x2-x1)
    return m
}

fun coordenada(x1:Double,x2:Double,y1:Double,y2:Double):Pair<Double,Double> {
    var m2 = (x1+x2)/2
    var m3 = (y1+y2)/2
    return Pair(m2,m3)
}
