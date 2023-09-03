fun main() {
    print("enter a positive integer:")
    val n = readLine()?.toIntOrNull()

    if (n != null && n >= 1) {
        val i = n % 10
        for (row in 1..i) {
       
            for (space in 1..i - row) {
                print(" ")
            }

           
            for (num in 1..row) {
                print(num % 10)
            }

            for (num in row - 1 downTo 1) {
                print(num % 10)
            }

           
            println()
        }
    } else {
        println("enter a positive integer")
    }
}
