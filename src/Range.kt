fun main() {
    val range = 0..100;


    for (x in 0..100) {
        print(x);
    }

    val rangeDown = 100 downTo 1;

    val range1 = 0..50 step 2;

    println(range.contains(100));
    println(range.contains(1000));
    println(range.count());
    println(range.last);
    println(range.first);
    println(range.step);

    for (x in range1) {
        println(x);
    }

}