
fun main (args: Array<String>) {

println ( "digite sua primeira nota :")
    val nota1 = readLine()!!.toInt()


println ( "digite sua segunda nota :")
    val nota2 = readLine()!!.toInt()
    
    
println ( "digite sua terceira nota :")
    val nota3 = readLine()!!.toInt()


println ( "digite sua quarta nota :")
    val nota4= readLine()!!.toInt()


val media = (nota1 + nota2 + nota3 + nota4) / 4 


println ( "A media das notas é $media ")


}