package belajar.oop.data

abstract class Location(var name: String)

class Province(name: String) : Location("$name Province")

class City(name: String) : Location("$name City")