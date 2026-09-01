package belajar.oop.data

class Car(paramBrand: String, paramName: String, paramYear: Int = 1990) {
    //    initializer bloc
    init {
        println("Car $paramBrand dibuat");
    }

    constructor(paramBrand: String, paramName: String) : this(paramBrand, paramName, 2001) {
        println("secondary constructor 1");
    }

    constructor(paramBrand: String) : this(paramBrand, "") {
        println("secondary constructor 2");
    }

    var brand: String = paramBrand;
    var name: String = paramName;
    var year: Int = paramYear;

}