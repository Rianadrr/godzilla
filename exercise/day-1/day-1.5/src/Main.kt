fun main(){
    //🔹 Soal 1 — Luas Persegi Panjang
    println("\n=== Soal 1 ===")
    println("Luas Persegi = " + calculateRectangleArea(8,5))

    //🔹 Soal 2 — Bilangan Genap atau Ganjil
    println("\n=== Soal 2 ===")
    println("Bilangan 7 adalah " + checkEvenOdd(7))

    //🔹 Soal 3 — Sapaan dengan Nama
    println("\n=== Soal 3 ===")
    sayHi()
    sayHi("Rian")

    //🔹 Soal 4 — Hitung Kuadrat
    println("\n=== Soal 4 ===")
    println("Hasil Kuadrat dari 9 = " + square(9))

    //🔹 Soal 5 — Jumlahkan List Angka
    println("\n=== Soal 5 ===")
    val number = listOf(1,2,3,4,5)
    println("Penjumlahan list = " + sumList(number))
}

// Define Function
//🔹 Soal 1 — Luas Persegi Panjang
fun calculateRectangleArea(length: Int, width: Int): Int{
    return length * width
}

//🔹 Soal 2 — Bilangan Genap atau Ganjil
fun checkEvenOdd(number: Int): String{
    if (number % 2 == 0) return "Genap" else return "Ganjil"
}

//🔹 Soal 3 — Sapaan dengan Nama
fun sayHi(name: String = "Guest"){
    println("Hi, $name!")
}

//🔹 Soal 4 — Hitung Kuadrat
fun square(n: Int) = n * n

//🔹 Soal 5 — Jumlahkan List Angka
fun sumList(numbers: List<Int>): Int{
    var total = 0
    for (num in numbers) {
        total += num
    }
    return total
}