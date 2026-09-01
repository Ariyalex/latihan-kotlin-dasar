fun helloWorld() {
    println("hello world");
}

fun name(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstName!");
    } else {
        println("Hello $firstName $lastName");
    }
}

fun varargsContoh(nama: String, vararg bilangan: Int) {
    var total: Int = 0;
    for (i in bilangan) {
        total += i;
    }

    println("nama $total");
}

fun namaDefault(firstName: String, lastName: String = "Default") {
    println("Hello $firstName $lastName");
}

fun penjumlahan(a: Int, b: Int): Int {
    val total = a + b;
    return total;
}

fun pengurangan(a: Int, b: Int): Int = a + b;
fun hi(name: String) = println(name);

fun main() {
    helloWorld();

    name("Ariya", "Duta");
    name(firstName = "Ariya", "Duta");
    name(firstName = "Ariya", lastName = null);

    namaDefault("Ariya")

    println(penjumlahan(10, 19));
    pengurangan(10, 4);
    hi("jokowi");

    varargsContoh("Joko", 10, 10, 4, 4, 5, 6, 4, 2, 5, 23, 4);

    fun innerFunction() {
        println("say Hello");
    }

    fun returnIf(name: String = ""): String {
        return if (name.isEmpty()) {
            "kosong"
        } else {
            "nama: $name";
        }
    }

    fun returnWhen(name: String = ""): String {
        return when (name) {
            "" -> "Kosong";
            else -> "nama; $name";
        }
    }

    innerFunction();
    println(returnIf("Budi"));
    println(returnWhen());
}