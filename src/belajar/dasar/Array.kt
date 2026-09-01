package belajar.dasar

fun main() {
    val names: Array<String?> =
        arrayOfNulls(5); // arrayOfNull hanya bisa diisi dengan sizenya dulu, untuk mengisi datanya lewat indeks setelah deklarasi
    names.set(0, "Eko");
    names[1] = "Ariya";
    names[2] = "Duta";
    names[3] = "Wacana";
    names[4] = "Permana";

    for (name in names) {
        println(name);
    }
}