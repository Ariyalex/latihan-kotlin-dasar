fun main() {
    tailrec fun recursiveFunction(value: Int, total: Int = 1): Int {
        return when (value) {
            1 -> total;
            else -> recursiveFunction(value - 1, total * value);
        }
    }

    println(recursiveFunction(10));
}