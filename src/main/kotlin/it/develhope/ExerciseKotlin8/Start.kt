package it.develhope.ExerciseKotlin8

/* Write an extension method that filters a list by value (e.g. smaller than 500). Write an extension method that prints list values.
Then create a list that that has at least 10 members, filter them and then print the values that pass the filter. */

fun main (){

    val numbers: List <Int> = listOf(1,2,30,400,500,4999,5000,9000,34567,10000)
    numbers.filterSmaller().print()
}

fun List<Int>.filterSmaller(): List <Int>{
    return this.filter { it < 500 }
}

fun List<Int>.print(){
    this.forEach { println(it) }

}

