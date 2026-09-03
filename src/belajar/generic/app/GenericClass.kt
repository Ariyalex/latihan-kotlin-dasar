package belajar.generic.app

import belajar.generic.data.MyData

fun main() {
    val myData: MyData<String, Int> = MyData<String, Int>("String", 100);
    val myData2 = MyData(200, "testing")

    myData.printMyData()
    myData2.printMyData()
}