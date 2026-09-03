package belajar.generic.app

interface SayHello {
    fun sayHello(msg: String): String
}

open class Employee
class VicePresident : Employee(), SayHello {
    override fun sayHello(msg: String): String = "hello $msg"
}

class President : Employee()

class Company<T : Employee>(val employee: T) : Employee() {
}

class Company2<T>(val employee: T) where T : Employee, T : SayHello {

}


fun main() {
    val employee1 = Employee()
    val vicePresident = VicePresident()
    val company: Company<Employee> = Company(employee1);

    val company2: Company2<VicePresident> = Company2(vicePresident)


    println(company2.employee.sayHello("testing"))

}