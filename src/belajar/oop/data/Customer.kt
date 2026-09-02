package belajar.oop.data

open class Customer(val name: String, val type: String, val balance: Long) {
    constructor(name: String, type: String) : this(name, type, 0);
    constructor(name: String) : this(name, "Standard");
}

//super constructor bisa mengakses constructor manapun yang ada di satu tingkat parent class
//super constructor hanya bisa digunakan jika tidak ada primary constructor
class PremiumCustomer : Customer {
    constructor(name: String) : super(name, "Premium")
    constructor(name: String, balance: Long) : super(name, "Premium", balance)
}


class ExecutiveCustomer(name: String, balance: Long) :
    Customer(name, "Executive", balance) { //contoh penggunaan super constructor tanpa keyword super
    constructor(name: String) : this(name, 0)
}