fun main(args: Array<String>) {
    var valInt: Int = 1
    val valSum: Long = 3L + valInt //konversi implisit
    println("Konversi Variabel valInt secara impilisit : " + valSum)
    val valLong: Long = valInt.toLong()//konversi eksplisit
    println("konversi variabel valInt secara eksplisit : " + valLong)

    var varLong : Long = 3_000_000_000
    valInt = valSum.toInt()
    println(valInt)
}