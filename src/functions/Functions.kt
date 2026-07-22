package functions

import java.util.Random

fun main(args : Array<String>){
    // Don't forget to add args values in the configuration of IntelliJ IDEA
    val timeInInt = args[0].toInt()
    if(timeInInt !in 0..23) {
        println("Invalid time. Please enter a time between 0 and 23.")
        return
    } else{
        val message = "Good ${if (timeInInt < 12) "morning" else "evening"}, Kotlin."
        println(message)
    }
    feedFish()

}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20): Boolean{
    return true
}
fun shouldChangeWater2(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20
){}

fun feedFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    shouldChangeWater(day,20, 50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 50)
    shouldChangeWater2(day = "Monday")

    if (shouldChangeWater(day)){
        println("Change the water today")
    }
    // swim()
    if (canAddFish(10.0, listOf(), 7, true)){
        println("Can add fish")
    }else{println("Cannot add fish")}

}
fun canAddFish(
    tankSize: Double,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations: Boolean = true
): Boolean{
    val realTankSize = if (hasDecorations){tankSize * .8} else {tankSize}
    val totalFishSizes = (currentFish + fishSize).sum()
    return realTankSize >= totalFishSizes
}

fun swim(spepd:String = "fast"){
    println("Swimming $spepd")
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