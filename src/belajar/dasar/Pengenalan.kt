package belajar.dasar

//ada juga const, biasanya untuk keperluan global scope, biasanya gunakan nama UPPER_CASE
//jadi harus di scobe global, tidak bisa ditaruh di function belajar.dasar.main atau sebagainya
const val VARIABLE_TETAP: String = "ini konstant";

fun main() {
    val umur: Int = 100;

    val umurDouble: Double = umur.toDouble();
    val testing: Long = umurDouble.toLong();

    val testingChar: Char = '-';

    val nullTypeData: Int? = null;
//    bahasa seperti dart, tapi beda dikit aja sih.
//    nullable seperti dart


    val firstName: String = "Ariya";
    val lastName: String = "Duta";
    val address: String = """
        trim indent
        tidak tau ini maksudnya apa tapi ya begitu
        trim margin itu gini testing cek dicoba
        asli ini bisa cuy
    """.trimIndent()

    val fullName: String = firstName + " " + lastName;
    val fullName1: String = "$firstName $lastName";

    val members: Array<String> = arrayOf("Ariya", "Duta", "Perkasa");
//    seperti pada dart, bedanya mungkin harus pakai arrayOf function;

    println(firstName);
    println(lastName);
    println(address);
    println(fullName);
    println(fullName1);
    println("total $fullName char=${fullName.length}");

    println(umurDouble);
    println(testingChar);

    println(members); // tidak bisa dibaca karena langsung print tipe data-nya, seharusnya pakai indeks
    println(members[1]); // tidak bisa dibaca karena langsung print tipe data-nya, seharusnya pakai indeks
    println(members.get(0));
    members.set(2, "Eko");// walaupun val, isi array tetap bisa diubah.
//    val itu yang tidak bisa diubah adalah value dari variable bukan isi dari variable, secara gampangnya array/list bisa diubah datanya.
    println(members.get(2));


}