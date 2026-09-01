package belajar.oop.data

class Address {
    var street: String = "";
    var city: String = "";
    var country: String = "Indonesia";

    //    percobaan secondary constructor tanpa primary constructor
    constructor(paramStreet: String, paramCity: String) {
        this.street = paramStreet;
        this.city = paramCity;

        println("address secondary constructor 1");
    }

    constructor(paramStreet: String, paramCity: String, paramCountry: String) : this(paramStreet, paramCity) {
        this.country = paramCountry

        println("address secondary constructor 2");
    }
}