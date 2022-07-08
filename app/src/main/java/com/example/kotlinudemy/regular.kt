package com.example.kotlinudemy
//. - любой символ
//? - Или один или ни одного предшествующих элементов
//+ - один или более элементов
//* - ноль или более элементов
//^ - начало строки
//$ - конец строки
//| - или
//[abc] - а б или ц
//[a-c] - диапазон от а до ц
//[^abc] - отрицание все за исключением абс
//\s - пробелы
//\w - символы встречающиеся в словах [a-zA-Z_0-9]
//\W - символы в словах не встречающиеся (не буквы и не цифры)
//\d{5} пять цифр подрят
//\s{2,4} от двух до четырех пробельных символов
//(a.c) группа из символа а. любого другого символа и символа с


fun main() {

    var line = "abc 1223 def";

    var regexp = """.*\d{4}.*""";

    var pattern = regexp.toRegex();

    println(
        line.matches(pattern))

    println(date("12 JAN 2020"));
    println(html());
    println(log());
}

fun date(date: String):Boolean //12 JAN 2020
{
    val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)";

    val regexp = """\d{2} $month \d{4}""";

    return date.matches(regexp.toRegex());

}

fun html() {

    val html = "<html><head>Hello</head></html>";

    val regexp = """<[^/>]+>""";

    val found = regexp.toRegex().findAll(html);

    for (result in found){
        println(result.value);
    }
}

fun log(){
    val line = """2020-01-14 12:13:58.374 1232132adda12 LOGIN (CASSystemUser): 128 89(*(#& *@!#*!@ ^&(% !@$(&@)!$&!@$ !@)*#*!@#^ ^^))!)!)""";

    val regexp = """(\d{4}-\d{2}-\d{2}).+LOGIN \(([^)]+)\)""";

    val found = regexp.toRegex().findAll(line);

    for (result in found){
//        for (group in result.groupValues){
//            println(group);
//        }
        println(result.groupValues[1]);
        println(result.groupValues[2]);
    }
}

