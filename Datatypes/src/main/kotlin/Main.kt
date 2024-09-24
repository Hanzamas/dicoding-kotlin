package com.dicoding.kotlin

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    var identifier: Type = initialization
//    Data types and Variable
    var company: String = "Dicoding"
    company = "Dicoding Indonesia"
    println(company)
    val immunity: Int = 95
    println(immunity)
    println( company + immunity)
    // Awalnya dari seperti ini.
    var value = 1
    value = value + 2

// Menjadi seperti ini.
    var anotherValue = 1
    anotherValue += 2

// Nilai value dan anotherValue akan bernilai sama, yakni 3

//    Character
    var vocalA = 'A'
    println("Vocals" + vocalA++)

    val vocalB = 'B'
    println(vocalB)
    val vocalC = 'C'
    println(vocalC)

//String
    val tekstring: String = "Dicoding"
    println(tekstring)
//    Indexing
    val text  = "Dicoding"
    val firstChar = text[3]

    print("The 4th character of the $text is $firstChar")
    val textx  = "Kotlin"
    for (char in textx){
        print("$char ")
    }
//    Escaped String
    val statement = "Kotlin is Awesome!"
//    val statements = "Kotlin is "Awesome!"" // Error
    val statements = "Kotlin is \"Awesome!\""
//    \t: menambah tab ke dalam teks.
//\n: membuat baris baru di dalam teks.
//\’: menambah karakter single quote kedalam teks.
//\”: menambah karakter double quote kedalam teks.
//\\: menambah karakter backslash kedalam teks.
//    Unicode
    val name = "Unicode test: \u00A9"
    print(name)
    val line = "Line 1\n" +
            "Line 2\n" +
            "Line 3\n" +
            "Line 4\n"
    val linez = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    print(linez)
    // String Templates
    val nama = "kotlins"
    print("Nama saya $nama")

//    If EXPRESSION
    val openHours = 7
    val now = 20

    if (now > openHours){
        println("office already open")
    }else{
        println("office is closed")
    }
    var office: String
    if (now > openHours) {
        office = "Office already open"
    } else {
        office = "Office is closed"
    }

    print(office)
    office = if (now > 7) {
        "Office already open"
    } else if (now == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    print(office)
//    Boolean
    val officeOpen = 7
    val officeClosed = 16
    val isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else {
        false
    }

    print("Office is open : $isOpen")

    val isOpens = now >= officeOpen && now <= officeClosed

    print("Office is open : $isOpens")
    val isClose = now < officeOpen || now > officeClosed

    print("Office is closed : $isClose")
    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }
//    numbers
    val intNumber = 100
    val longNumber: Long = 100
    val longsNumber = 100L
    val shortNumber: Short = 10
    val byteNumber = 0b11010010
    val doubleNumber: Double = 1.3
    val floatNumber: Float = 0.123456789f    // yang terbaca hanya 0.1234567
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)
//    Konversi data
    val bytesNumber: Byte = 1
    val intsNumber: Int = byteNumber // compile error
    val bytezNumber: Byte = 10
    val intzNumber: Int = byteNumber.toInt() // ready to go
//    toByte(): Byte
//toShort(): Short
//toInt(): Int
//toLong(): Long
//toFloat(): Float
//toDouble(): Double
//toChar(): Char
    val stringNumber = "23"
    val inttNumber = 3

    print(inttNumber + stringNumber.toInt())

//    Arrays
    val array = arrayOf(1, 3, 5, 7)
    val mixArray = arrayOf(1, 3, 5, 7 , "Dicoding" , true)
    val intArray = intArrayOf(1, 3, 5, 7)
//    intArrayOf() : IntArray
    intArray[2] = 11
//    booleanArrayOf() : BooleanArray
//    charArrayOf() : CharArray
//    longArrayOf() : LongArray
//    shortArrayOf() : ShortArray
//    byteArrayOf() : ByteArray


//    Nullable
    val textss: String? = null // ready to go
    var string: String? = "Dicoding"
    if(string != null) { // smart cast
        print(string.length) // It works now!
    }
    var obj: Any = "Dicoding"
//cast
    if(obj is String) {
        // Tidak membutuhkan casting secara eksplisit.
        println("String length is ${obj.length}")
    }
//    safe calls
    val textxz: String? = null
    text?.length
    val textxx: String? = null
    val textLength = textxx?.length ?: 7
//    val textLength = if (text != null) text.length else 7
//    val text: String? = null
//val textLength = text!!.length // ready to go ???

//    Functions
fun setUser(name: String, age: Int): String {
    return "Your name is $name, and you $age years old"
}
    fun setsUser(name: String, age: Int): String = "Your name is $name, and you $age years old"
    println(user)

    printUser("Alfian")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"
fun printUser(name: String): Unit {
    print("Your name is $name")
}
fun printsUser(name: String) {
    print("Your name is $name")
}
val user = setUser("Alfian", 19)

