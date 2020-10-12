

//Kotlin Functions part 2

/*fun main(args : Array<String>){
    //Recursive functions - call a function itself called recursive function
   println("Hello Recursive function !")
    _recursive()
}

fun _recursive(){
    println("Recursive")
    _recursive()
} */


// Named and default arguments
//no args in function call
/*
fun main(args : Array<String>){
    run()
}
fun run(num : Int = 4 , Letter : Char ='A'){
    println("Number is $num and Letter is $Letter")
}*/
//some args in function call
fun main(args : Array<String>){
    run(3, Letter = 'X')
}
fun run(num : Int , Letter : Char ='A'){
    println("Number is $num and Letter is $Letter")
}
