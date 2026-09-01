fun main() {

    fun factorialLoop(value: Int): Int {
        println("value sekarang: $value");
        return when (value) {
            1 -> 1;
            else -> value * factorialLoop(value - 1);
        }
    }

    fun recursivePyramid(value: Int): Int? {
        fun innerFunction(i: Int): Int? {
            return when (i) {
                0 -> null;
                else -> {
                    print("*");
                    i - 1;
                    innerFunction(i - 1);
                }
            }
        }
        return when (value) {
            0 -> null;
            else -> {
                recursivePyramid(value - 1);
                innerFunction(value);
                println();
                null;
            }
        };

    }

//    println(factorialLoop(10));
    recursivePyramid(10);
}