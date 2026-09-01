fun toUpper(value: String): String = value.uppercase();

fun main() {
    val contohLambda: (String, Int) -> String = { firstName, age ->
        val result: String = "$firstName umur $age";
        result;
    }

    println(contohLambda("Ariya", 20));

    val lambdaIt: (String) -> String = {
        "Nama saya $it";
    }

    println(lambdaIt("Eko"));

    val toUpperCase: (String) -> String = ::toUpper;

    println(toUpperCase("Ariya Duta"));

    fun hello(name: String, transformer: (String) -> String): String {
        val result = transformer(name);
        return result;
    }

    val lambdaUpper = { value: String -> value.uppercase() };
    println(hello("Eko", lambdaUpper));

    val resultLambda = hello("Ariya") { value: String -> value.lowercase() };
    println(resultLambda);
}