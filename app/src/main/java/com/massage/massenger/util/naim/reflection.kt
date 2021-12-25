package com.massage.massenger.util.naim

class ReflectionDemo {
}

fun add(a: Int,b: Int) : Int{
    return a+b
}

fun add(a: String,b: String): String{
    return """$a$b"""
}

fun isDivisibleBy3(a: Int): Boolean{
    return a%3 == 0
}

class Property(var a: Float){
}

val x = 10;

fun main(){
    // Function reference obtained using :: operator
//    val ref1 = ::isDivisibleBy3
//    val array = listOf(1,2,3,4,5,6,7,8,9)
//    println(array.filter(ref1))

    // Function reference obtained for an overloaded function
    // By explicitly specifying the type
//    val ref2: (String,String) -> String = ::add
//    println(ref2)

    // Function reference obtained implicitly
//    val x = add(3,5)
//    println(x)

    val z = ::x
    println(z.get())
    println(::Property.name)

    // Property Reference for a class property
    val y = Property::a
    println(y.get(Property(5.899f)))
}
