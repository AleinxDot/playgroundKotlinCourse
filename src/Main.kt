import classes.Aquarium

fun main() {
    //Configurar los parámetros desde la configuración de IntelliJ IDEA
    println("Hello Kotlin!")
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.height = 80
    println("Length : ${myAquarium.length}\n " +
            "Width : ${myAquarium.width}\n " +
            "Height : ${myAquarium.height}")
    println("Aquarium Volume : ${myAquarium.volume}%")
}
