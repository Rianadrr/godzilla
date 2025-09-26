fun main() {
    // 🔹 Soal 1: Nilai Ujian
    println("\n=== Soal 1 ===")
    print("Masukkan nilai ujian: ")
    val nilai = readLine()!!.toInt()

    if (nilai >= 90) {
        println("Nilai A")
    } else if (nilai >= 75) {
        println("Nilai B")
    } else if (nilai >= 60) {
        println("Nilai C")
    } else {
        println("Tidak Lulus")
    }

    // 🔹 Soal 2: Genap atau Ganjil
    println("\n=== Soal 2 ===")
    print("Masukkan angka: ")
    val angka = readLine()!!.toInt()
    if (angka % 2 == 0) println("Angka Genap") else println("Angka Ganjil")

    // 🔹 Soal 3: Hari dalam Minggu
    println("\n=== Soal 3 ===")
    print("Masukkan angka (1–7): ")
    val number = readLine()!!.toInt()

    when (number) {
        1 -> println("Senin")
        2 -> println("Selasa")
        3 -> println("Rabu")
        4 -> println("Kamis")
        5 -> println("Jumat")
        6 -> println("Sabtu")
        7 -> println("Minggu")
        else -> println("Hari tidak valid!")
    }

    // 🔹 Soal 4: Penilaian Huruf
    println("\n=== Soal 4 ===")
    print("Masukkan nilai huruf (A–E): ")
    val grade = readLine()!![0].uppercaseChar() // ambil huruf pertama & uppercase

    when (grade) {
        'A', 'B' -> println("Lulus dengan baik")
        'C' -> println("Lulus pas-pasan")
        'D', 'E' -> println("Tidak lulus")
        else -> println("Nilai tidak valid")
    }

    // 🔹 Soal 5: Musim Berdasarkan Bulan
    println("\n=== Soal 5 ===")
    print("Masukkan bulan (1–12): ")
    val month = readLine()!!.toInt()
    val season = when (month) {
        12, 1, 2 -> "Musim Hujan"
        3, 4, 5 -> "Musim Semi"
        6, 7, 8 -> "Musim Panas"
        9, 10, 11 -> "Musim Gugur"
        else -> "Bulan tidak valid"
    }
    println(season)
}
