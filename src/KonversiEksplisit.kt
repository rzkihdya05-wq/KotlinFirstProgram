fun main(args: Array<String>) {
    val valInt: Int = 1
    val valSum: Long = 3L + valInt //konversi implisit
    println("Konversi Variabel valInt secara impilisit : " + valSum)
    val valLong: Long = valInt.toLong()//konversi eksplisit
    println("konversi variabel valInt secara eksplisit : " + valLong)
}