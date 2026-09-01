package belajar.oop.data

//hindari penggunaan nullable properties
class Person(firstNameParam: String, lastNameParam: String = "") {
    var firstName: String = firstNameParam;
    var lastName: String = lastNameParam;


}
