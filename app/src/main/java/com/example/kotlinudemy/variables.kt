package com.example.kotlinudemy

fun main() {
    var s = "asd";
    println(s);

    var asd :String? = "123";
    asd = null;

    println(asd?.length);
    println(asd);

    //?: elvis === ternar opiration
    println(asd?.length ?: "sss");


    var let = 2;

    var condition =
        if (let == 1) {
            "cold"
        } else if (let == 2) {
            "two"
        } else {
            "asd";
        }

    println(condition);
    val obj : Any = "2222";

    if(obj is String){
        println("len is " + obj.length);
    }
    var age = 0;
    val x: String = obj as String; //unsafe cast
    //val z: String = age as String; //ClassCastException

    //строковый шаблон
    var firstname = "masha";
    var secondname = "ivanochuk";
    var age2 = 15;
    //Это java - код старого образца
    println(" name " + firstname + " sername " + secondname + " age " + age2);

    //Это kotlin
    println("name $firstname surname $secondname age $age2");

    println("\\");
    println("""\""");
    println("""
        one
        $firstname
        thre
    """.trimIndent());

    var answer = greeting("seva", "murodov");
    println(answer);
}

fun greeting(first:String,last:String): String {
    require(!first.isBlank()){"Укажите имя"}; //если указали пустоты вывод ошибки
    return "Hello $first $last";
}


