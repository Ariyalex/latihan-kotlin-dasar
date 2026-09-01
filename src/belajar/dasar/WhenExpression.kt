package belajar.dasar

fun main() {
    val finalExam = 'B';

    val passValue: Array<Char> = arrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G');

    when (finalExam) {
        'A', 'B', 'C' -> println("umazing")
        'D' -> {
            println("testing bisa multiline")
        }

        'E' -> println("mantap")
        else -> println("bukan le")
    }

    when (finalExam) {
        in passValue -> println("lulus");
        !in passValue -> println("tidak lulus");
    }

    val name = "Ariya";
    when (name) {
        is String -> println("belajar.dasar.name: $name");
        !is String -> println("is not a string");
    }

//    when sebagai pengganti if
    val nilai = 90;
    when {
        nilai < 2 -> println("nilai is less than 2");
        nilai > 5 -> println("nilai is greater than 5");
        else -> println("nilai is greater than 10");
    }
}