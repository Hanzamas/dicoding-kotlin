package com.dicoding.kotlin

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")
    println("hello world ahahaha")
    print(name)
    print(if (true) "Hello" else "World")





    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
    //    Val immutable
//    Var mutable
    val nama: String = "kotlin"
    println("Hello, $nama!")
    val umur: Int = 69
    var umur2: Int = 69
    println("$umur")
    println("$umur2")
    var zeeber: String = "Ijoel"
    println("Hello, $zeeber!")
//    Nullable
    val text: String? = null
    println(text)
    var text2: String? = "Kotlin"
//safe call
    val text3: String? = null
    val textlength3 = text?.length
    println(textlength3)
//elvis operator
    val text4: String? = null
    val textlength4 = text?.length ?: 0
    println(textlength4)
//    Collection
    val intlist = listOf(1,2,3,4,5)
    println(intlist[3])
    val intset = setOf(1,2,3,4,5)

    val intmap = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(intmap ["b"])
    println(intmap.getValue("b"))

//    Mutable list and immutable
    val Listss = mutableListOf(1,2,3,4,5)
    Listss.add(6)
    Listss.add(1, 7)
    Listss[3]   = 8
    Listss.removeAt(1)
}