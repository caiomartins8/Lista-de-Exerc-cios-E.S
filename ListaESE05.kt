fun main (args: Array<String>) {

println ( "digite uma quantidade de metros para ser transformada em centimetros :")
    val metros = readLine()!!.toInt()

val transformacao = metros * 100

println ( "a conversao fica em $transformacao centimetros")


}