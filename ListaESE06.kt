fun main (args: Array<String>) {

println ( "digite o raio do circulo para descobrir a area  :")
    val raio = readLine()!!.toInt()

val areacirculo = (raio * raio) * 3.14

println ( "a area do circulo é $areacirculo")


}