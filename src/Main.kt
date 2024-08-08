fun main() {

                             // Problem 8 part 1

    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))

    println()

                             // Problem 8 part 2

    println()

    val firstUserOperatingSystem = "Unkown OS"
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(firstUserOperatingSystem, emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()



                                // Problem 9

    val Steps = 4000
    val caloriesBurned = PedometerStepsToCalories(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories")
    println("")



                                // Problem 10

    val timeSpentToday = 300
    val timeSpentYesterday = 250
    val result = compare(timeSpentToday, timeSpentYesterday)



                               // Problem 11

    weatherDetails("Ankara", 27, 31, 82)
    println()

    weatherDetails("Tokyo", 32, 36, 10)
    println()

    weatherDetails("Cape Town", 59, 64, 2)
    println()

    weatherDetails("Guatemala City", 50, 55, 7)
    println()

                         // Problem 12 is just solutions

                         // Problem 13 is just Additional Practice
}


// Define your displayAlertMessage() below this line.

fun displayAlertMessage(operatingSystem: String, emailId: String): String {
    return "There's a new sign-in request on " + operatingSystem + " for your Google Account " + emailId + "."
}

// Define your PedometerStepsToCalories() below this line.

fun PedometerStepsToCalories(NumberOfSteps: Int): Double {
    val CaloriesBurnedForEachStep = 0.04
    val TotalCaloriesBurned = NumberOfSteps * CaloriesBurnedForEachStep
    return TotalCaloriesBurned
}

//Define your didYouSpendMoreTimeThenYesterday() below this line.

fun compare(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    if(timeSpentToday > timeSpentYesterday){
        return true
    }else{
        return false
    }
}

//Define your weatherDetails() below this line.

fun weatherDetails(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    println("City: $cityName")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceOfRain%")
    println()
}

