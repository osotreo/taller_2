import kotlin.contracts.Returns
import kotlin.math.ceil

fun main() {
    print("estudiantes gordos: ")
    val gordos = readLine()!!.toInt()
    print("estudiantes flacos: ")
    val flacos = readLine()!!.toInt()
    print(("total sillas: "))
    val sillas = readLine()!!.toInt()
    print("bus  ${bus(gordos,flacos,sillas)}")
}
fun bus(gordos:Int,flacos:Int,silla:Int):Int{
    require(silla>0 || gordos>0 || flacos>0)
return ceil(((gordos*2+flacos)/silla).toDouble()).toInt()
}


