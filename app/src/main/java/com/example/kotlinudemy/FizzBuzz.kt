package com.example.kotlinudemy
// нам дается число любое (4) если делиться на 3 = fizz если на 5 = buzz и на 3 и на 5 = fizzbazz
fun main() {
   // println(fizzBuzz(25));
}

fun fizzBuzz(i: Int): String {

    val total = 25;
    var result = "";

    for (i in 1..total){
       if (i % 3 == 0){
           if(i % 5 == 0){
               result += "$i - FizzBazz \n";
           }else {
               result += "$i - Fizz \n";
           }
       }else if (i % 5 == 0){
           if(i % 3 == 0){
               result += "$i - FizzBazz \n";
           }else {
               result += "$i - Bazz \n";
           }
       }
    }

    return result;
}
