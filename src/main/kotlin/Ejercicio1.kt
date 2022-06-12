fun main(){

    println("resultado es: ${valor(2.0,2.0)}")

}

/*
. Escriba una función en Kotlin y un programa que use esa función, que
encuentre el valor de la siguiente función algebraica:
f(x,y)=x2−2xy+y2

 */
fun valor(x:Double,y:Double):Double {
    var resultado= (Math.pow(x,2.0))-(2.0*x*y)+(Math.pow(y,2.0))
return resultado
}


