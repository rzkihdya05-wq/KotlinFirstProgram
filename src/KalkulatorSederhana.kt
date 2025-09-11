fun main(args: Array<String>) {
    println("Welcome to Calculator")
    println("Enter The First number:")
    val a = readLine()!!.toDouble()
    println("Enter the scound number")
    val b = readLine()!!.toDouble()
    val sum =a + b
    val difference = a - b
    val product = a * b
    val qoutient = a / b
    println("sum: ${sum}")
    println("Product: ${difference}")
    println("Qoutient: ${qoutient}")
    println("Thank you for using calculator.")

}