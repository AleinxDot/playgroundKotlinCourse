package functions

fun main() {
    println("Suggesting activities...")
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("happy", "sunny"))
    println(whatShouldIDoToday("sad", "rainy", 0))
    print("How do you feel?")
    println(whatShouldIDoToday(readLine()!!))
}
fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24) : String
{
    return when{
        mood == "happy" && weather == "sunny" -> "Go for a walk"
        temperature > 35 -> "Go Swimming"
        mood == "Sad" && weather == "Rainy" && temperature == 0 -> "Stay in bed"
        weather == "rainy" -> "Stay in bed"
        else -> {"Do whatever you want"}
    }
}
