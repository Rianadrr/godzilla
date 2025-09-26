fun main(){
    //🔹 Soal 1 — Nilai Statistik
    println("\n=== Soal 1 ===")
    val number = listOf(70, 85, 90, 60)
    val result = calculateStats(number)

    println("Data: $number")
    println("Total = ${result["Total"]}")
    println("Rata-rata = ${result["Rata-rata"]}")
    println("Max = ${result["Max"]}")
    println("Min = ${result["Min"]}")

    //🔹 Soal 2 — Pola Segitiga Bintang
    println("\n=== Soal 2 ===")
    calculateTrianglePattern(5)

    //🔹 Soal 3 — Palindrome Checker
    println("\n=== Soal 3 ===")
    val word1 = "level"
    val word2 = "kotlin"

    println("$word1 → ${isPalindrome(word1)}")
    println("$word2 → ${isPalindrome(word2)}")

    //🔹 Soal 4 — Cari Angka Tertinggi Kedua
    println("\n=== Soal 4 ===")
    val nums = listOf(10, 30, 20, 50, 40)
    val results = findSecondLargest(nums)

    if (results != null) {
        println("Angka tertinggi kedua adalah $results")
    } else {
        println("Tidak ada angka kedua tertinggi")
    }

    //🔹 Soal 5 — Jumlah Kata dalam Kalimat
    println("\n=== Soal 5 ===")
    val kalimat = "Belajar Kotlin itu mudah"
    println("Jumlah kata = ${countWords(kalimat)}")

    //🔹 Soal 6 — Matriks Penjumlahan
    println("\n=== Soal 6 ===")
    val A = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )

    val B = arrayOf(
        intArrayOf(7, 8, 9),
        intArrayOf(1, 2, 3)
    )

    val hasil = addMatrices(A, B)

    println("Hasil Penjumlahan Matriks:")
    for (row in hasil) {
        println(row.joinToString(" "))
    }


}
// Define Function
//🔹 Soal 1 — Nilai Statistik
fun calculateStats(numbers: List<Int>): Map<String, Any>{
    val total = numbers.sum()
    val average = numbers.average()
    val max = numbers.max()
    val min = numbers.min()

    return mapOf(
        "Total" to total,
        "Rata-rata" to average,
        "Max" to max,
        "Min" to min
    )
}

//🔹 Soal 2 — Pola Segitiga Bintang
fun calculateTrianglePattern(n: Int){
    for (i in 1..n) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}

//🔹 Soal 3 — Palindrome Checker
fun isPalindrome(text: String): Boolean{
    return text == text.reversed()
}

//🔹 Soal 4 — Cari Angka Tertinggi Kedua
fun findSecondLargest(numbers: List<Int>): Int? {
    if (numbers.size < 2) return null

    var first: Int
    var second: Int

    if (numbers[0] > numbers[1]) {
        first = numbers[0]
        second = numbers[1]
    } else {
        first = numbers[1]
        second = numbers[0]
    }

    for (i in 2 until numbers.size) {
        val num = numbers[i]
        if (num > first) {
            second = first
            first = num
        } else if (num > second && num != first) {
            second = num
        }
    }
    return if (first == second) null else second
}

//🔹 Soal 5 — Jumlah Kata dalam Kalimat
fun countWords(sentence: String): Int {
    var count = 0
    var inWord = false

    for (ch in sentence) {
        if (ch != ' ') {
            if (!inWord) {
                count++
                inWord = true
            }
        } else {
            inWord = false
        }
    }
    return count
}

//🔹 Soal 6 — Matriks Penjumlahan
fun addMatrices(A: Array<IntArray>, B: Array<IntArray>): Array<IntArray> {
    val rows = A.size
    val cols = A[0].size
    val result = Array(rows) { IntArray(cols) }

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            result[i][j] = A[i][j] + B[i][j]
        }
    }
    return result
}