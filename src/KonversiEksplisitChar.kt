fun main(args: Array<String>) {
    //ASCII value
    var c: Char // character
    var i: Int //ordinal (ASCII) value of the character
    // conversion from text to ASCII value
    c = 'a'
    i = c.toInt()
    println("the character $c was converted to its ASCII value of $i)")

    // conversion from on ASCII value to text
    i = 98
    c = i.toChar()
    println("the ASCII value of $i was converted to its textual value of $c")
}