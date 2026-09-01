fun main() {
    var i = 0;

    while (i < 20) {
        if (i % 2 == 0) {
            i++;
            continue;
        }
        if (i == 11) {
            break;
        }
        print("$i ");
        i++;
    }

//    do while loop
    var ii = 0;
    do {
        print("$ii ");
        ii++;
    } while (
        ii < 10
    )
}