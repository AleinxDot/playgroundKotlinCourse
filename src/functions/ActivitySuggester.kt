package functions

fun main() {
    println("Suggesting activities...")
    println(whatShouldIDoToday("sad"))
}
fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24) : String
{
    return when(mood == "happy" && weather == "sunny")
    {
        true -> "Go for a walk"
        false -> "Stay in bed"
    }
}