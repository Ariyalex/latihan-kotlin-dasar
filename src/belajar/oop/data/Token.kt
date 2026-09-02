package belajar.oop.data

// syntax inline sudah deprecated, sekarang ganti ini. ini dikarenakan fitur ini merupakan eksperimen kotlin
//ekspektasi aku, ini bakal jarang digunakan
@JvmInline
value class Token(val value: String) {
    fun toUpper(): String = value.uppercase()
}