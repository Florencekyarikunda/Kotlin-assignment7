fun main() {
    oddNumbers()
    names()
    robotServe(5)
    robotServe(7)
    robotServe(16)
    numberRanges()

}
fun oddNumbers(){
for (s in 1..100)
 if (s%2==0){
     println(s)
 }
}
fun names() {
    var names = arrayOf("Florence","Violah","Irene","Promise" )
     for (name in names) {
        if (name.length > 5) {
           println(name)
        }
    }
}


fun robotServe(age:Int) {
    if (age <= 6) {
        println("Serve guests a glass of milk")
    }
    if (age >= 6 && age <= 15) {
        println("Serve guests a bottle of fanta orange ")
    } else {
        println("Serve everybody a bottle of coca cola")
    }
}

fun numberRanges() {
    for (num in 1..100){
        if (num % 3 != 0 && num % 5 != 0) {
            println(num)
        } else if (num % 3 != 0) {
            println("Fizz")
        } else if (num % 5 != 0) {
            println("Buzz")
        } else {
            println("FizzBuzz")
        }
    }
    }

