import kotlin.random.Random

fun main() {
    // var random = Random(System.currentTimeMillis())
    // var bombNumber: Int = random(1, 101)
    val bombNumber: Int = Random.nextInt(1, 101)
    var lowerRange: Int = 1 // lower range
    var upperRange: Int = 100 // upper range
    var guess: Int = 0
    var win: Boolean = false

    while (guess != bombNumber) {
        if (upperRange - 1 == bombNumber && lowerRange + 1 == bombNumber) {
            win = true
            break
        }
        println("Choose a number between $lowerRange and $upperRange:")
        guess = readLine()!!.toIntOrNull() ?: bombNumber
        if (guess > upperRange || guess < lowerRange) {
            println("Come on, be serious!")
            System.exit(0)
        }
        if (guess < bombNumber) {
            lowerRange = guess
        } else if (guess > bombNumber) {
            upperRange = guess
        } else {
            break
        }
    }
    
    if (win) {
        println("You win! :)")
    } else {
        println("You lose! :(")
    }
}

