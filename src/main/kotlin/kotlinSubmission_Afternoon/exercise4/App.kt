package kotlinSubmission_Afternoon.exercise4

fun main() {
    try {
        println("Masukkan bilangan untuk dicek apakah bilangan prima: ")
        val userInput = readlnOrNull()
        if (userInput != null) {
            val number = userInput.toInt()
            val prime = isPrime(number)

            if (prime) {
                println("$number adalah bilangan prima")
            } else {
                println("$number bukan bilangan prima")
            }
        }
    } catch (e: NumberFormatException) {
        println("Input tidak valid. Masukkan bilangan bulat.")
    }
}
fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}
