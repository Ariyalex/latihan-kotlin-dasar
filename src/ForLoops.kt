fun main() {
    val names: Array<String> = arrayOf("Mary", "Mary", "Mary", "Mary", "Mary");

    for (name in names) {
        println(name);
    }

    for (i in 0..100 step 2) {
        print("$i ")
    }
}