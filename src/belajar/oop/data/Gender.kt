package belajar.oop.data

enum class Gender(val description: String) {
    MALE("Male"), FEMALE("Female");

    fun printDescription() {
        println(description)
    }
}