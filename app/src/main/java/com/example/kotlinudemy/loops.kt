package com.example.kotlinudemy

fun main() {
    //while/dowhile
    var co = 0;
    var total = "";
    while (co < 10){
        println("${co++}");
    }
//    do {
//        val c = readLine();
//        println("${c}");
//    }while (c != "quit")

    //for
    for (i in 1..10){
       for (j in 1..co - i ) {
           total += " ";
       }
        for (j in 1..i * 2 - 1) {
            total += "*";
        }
        total += "\n";
    }
    println(total);

    for(i in 'a'..'z'){
        println(i);

    }
}