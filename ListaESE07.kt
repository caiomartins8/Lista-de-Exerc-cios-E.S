fun main (args: Array<String>) {

println ( "digite o tamanho dos lados do quadrado para descobrir a area e o dobro :")
    val lados = readLine()!!.toInt()

val areaquadrado = (lados * lados)
val dobro = areaquadrado * 2


println ( "a area do quadrado é $areaquadrado e o dobro $dobro")

} 