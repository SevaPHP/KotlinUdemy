package com.example.kotlinudemy

import android.annotation.SuppressLint

class Car (val r: Int) {

    var brand = this.r;
    var model = "";
    var year = 0;

}

fun main() {
    val c1 = Car(22222)

    c1.model = "Mustang";
    c1.year = 1969;

    println(c1.brand);
    println(c1.model);
    println(c1.year);

    println(Button().whoami())
}

interface View {
    fun click();
    fun whoami() = println("i am who");
}
class Button :View{
    override fun click() {
        println("hello world")
    }

}