fun main(){
//    🔹 Soal 1 — Hitung Total Nilai
    println("\n=== Soal 1 ===")

    val scores = arrayOf(70, 85, 90, 60, 75)
    var total = 0

    for (score in scores) {
        total += score
    }
    println("Total nilai = $total")

//    🔹 Soal 2 — Cari Angka Genap
    println("\n=== Soal 2 ===")

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (num in numbers) {
        if (num % 2 != 0) continue
        println("Angka Genap = $num")
    }

//    🔹 Soal 3 — Cari Buah Tertentu
    println("\n=== Soal 3 ===")

    val fruits = listOf("Apple", "Banana", "Mango", "Orange", "Grapes")

    for (fruit in fruits) {
        if (fruit == "Mango") {
            println("Mango ditemukan!")
            break
        }
    }

//    🔹 Soal 4 — Hitung Mundur
    println("\n=== Soal 4 ===")

    var number = 10

    while (number >= 1) {
        println(number)
        number--
    }
    println("Selesai!")

//    🔹 Soal 5 — Cetak Nama dengan Index
    println("\n=== Soal 5 ===")

    val students = listOf("Andi", "Budi", "Cici", "Dedi")

    for ((index, name) in students.withIndex()) {
        println("${index + 1}. $name")
    }
}