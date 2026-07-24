package classes

class Aquarium {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }
    // Constructor
    constructor(width: Int = 20, height: Int = 40, length: Int = 100) {
        this.width = width
        this.height = height
        this.length = length
    }

}