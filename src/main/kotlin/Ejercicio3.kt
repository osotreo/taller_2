fun main(){

    print("cual es el valor del salario:  ")
    var s = readLine()!!.toDouble()
    println("el valor que gasta en arriendo, comida y el dinero que le queda es:  ${salario(s)}")
}


/*
4. Escriba una función y un programa en Kotlin que resuelva el siguiente
problema: Pedro acabó de recibir el sueldo mensual. Si se gasta el 40% de
ese sueldo en el arriendo y el 15% del sueldo en comida, determine
cuánto dinero se gastó en cada uno de esos dos ítems (en arriendo y en
comida) y cuanto dinero le queda al final.
ENTRADAS
sueldo--> s: Double
SALIDAS
arriendo-->a:Double
comida-->c:Double
saldo sueldo-->q:Double
 */

fun salario (s:Double):Triple<Double,Double,Double>{
var a = s*0.4
var c = s*0.15
var  q =s*0.55
return  Triple(a,c,q)







}

