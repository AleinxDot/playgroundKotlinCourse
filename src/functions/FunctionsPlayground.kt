package functions

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

    }
}