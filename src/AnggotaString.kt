fun main(args: Array<String>) {
    val s = "Rhinopotapus"
    println(s.startsWith("rhin"))
    println(s.endsWith("tamus"))
    println(s.contains("pot"))
    println(s.contains("lol"))

    var config = "fullscreen shaDows autosave"
    config = config.lowercase()
    println("will the game run in fullscreen?")
    println(config.contains("fullscreen"))
    println("will shadows be turned on?")
    println(config.contains("shadows"))
    println("will sound be turned off?")
    println(config.contains("nosound"))
    println("would the player like to use autosave?")
    println(config.contains("autosave"))

    //replace()
    var strJava = "java is the best!"
    strJava = strJava.replace("Java","Kotlin")
    println(s)
    println("$strJava is ${strJava.length} characters long.")

    //substring()
    println("i would not banish all of these Internets.".substring(2, 7))

    //compareTo()
    println("alpha".compareTo("bravo"))
}