fun main(args: Array<String>) {
    var s = "A programmer gets stuck in the shower because the instructions on the shampoo were: lather,wash, and Repeat."
    println(s)
    s = s.lowercase()

    var voweCount = 0
    var consonantCount = 0

    val vowels = "aeiouy"
    val consonants = "bcdfghjkmnpqrstvwxz"
     for (c in s) {
         if (vowels.contains(c)) {
             voweCount++
         }else if (consonants.contains(c)) {
             consonantCount++
         }
     }
    println("Vowels: $voweCount")
    println("consonants: $consonantCount")
    println("Other characters: ${s.length - (voweCount + consonantCount)}")
}