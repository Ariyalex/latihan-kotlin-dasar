package belajar.oop.data

class Application(name: String) {
    //    companion object adalah singleton object yang di dalam inner class, tapi tanpa nama, cara akses nya jadi lebih mudah.
    companion object {
        fun printApplication() = println("percobaan singleton companion object  di dalam class")
    }
}