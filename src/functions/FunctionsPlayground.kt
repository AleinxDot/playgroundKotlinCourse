package functions

import java.util.Random


class FunctionsPlayground {

    fun main(args : Array<String>){
        val timeInInt = args[0].toInt();
        if(timeInInt !in 0..23) {
            println("Invalid time. Please enter a time between 0 and 23.");
            return;
        } else{
            val message = "Good ${if (timeInInt < 12) "morning" else "evening"}, Kotlin."
            println(message);
        }
        feedFish()

    }
    fun feedFish(){
        val day = randomDay()
        val food = fishFood(day)
        println("Today is $day and the fish eat $food")
    }
    fun randomDay() : String{
        val week= listOf("Monday","Tuesday","Wednesday","Thursday", "Friday","Saturday","Sunday")
        return week[Random().nextInt(7)]
    }
    fun fishFood(day: String) : String{
        return when (day) {
            "Monday" -> "flakes"
            "Tuesday" -> "pellets"
            "Wednesday" -> "redworms"
            "Thursday" -> "granules"
            "Friday" -> "mosquitoes"
            "Saturday" -> "lettuce"
            "Sunday" -> "plankton"
            else -> "fasting"
        }
    }

}