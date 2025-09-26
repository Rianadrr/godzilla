fun main(){
//    🔹 Bagian 1 — Dasar (Data Type & Print)
    println("\n=== Bagian 1 ===")

//    Deklarasikan variabel studentName dengan tipe String dan inisialisasikan dengan nama kamu sendiri. Cetak hasilnya.
    val studentName: String = "Rian Adriansyah"
    println("Student Name: $studentName")

//    Deklarasikan variabel age dengan tipe Int dan isi dengan umur kamu. Cetak hasilnya.
    val age: Int = 22
    println("Age: $age")

//    Buat variabel temperature dengan tipe Float, isi dengan nilai suhu 36.7, lalu cetak.
    val temperature: Float = 36.7F
    println("Current Temperature: $temperature Celcius")

//    Buat variabel isGraduated dengan tipe Boolean, isi dengan false, lalu cetak.
    val isGraduated: Boolean = false
    if(isGraduated)
        println("Graduation: Yes")
    else
        println("Graduation: No")

//    Deklarasikan variabel grade dengan tipe Char dan isi dengan huruf 'A'. Cetak.
    val grade: Char = 'A'
    println("Grade: $grade")


//    🔹 Bagian 2 — Numeric Types
    println("\n=== Bagian 2 ===")

//    Buat variabel population dengan tipe Long dan isi dengan 273_000_000.
    val population: Long = 273_000_000

//    Buat variabel smallNumber dengan tipe Short dan isi dengan 32000.
    val smallNumber: Short = 32000

//    Buat variabel tinyValue dengan tipe Byte dan isi dengan 127.
    val tinyValue: Byte = 127

//    Cetak ketiga variabel di atas dalam satu baris menggunakan string template.
    println("Population: " + population.toString() + " Small Number: " + smallNumber.toString() + " Tiny Value: " + tinyValue.toString())

//    🔹 Bagian 3 — Nullable
    println("\n=== Bagian 3 ===")

//    Deklarasikan variabel nickname bertipe String? dan beri nilai null.
    var nickname: String? = null
    val before = nickname

//    Setelah itu, isi nickname dengan nama panggilan kamu.
    nickname = "Rian"
//    Cetak nilai nickname sebelum dan sesudah diisi.
    println("Nickname Before: $before and Nickname After: $nickname")

//    🔹 Bagian 4 — Array & Collection
    println("\n=== Bagian 4 ===")

//    Buat array numbers berisi angka 1 sampai 5. Cetak semua elemen.
    val numberArray: Array<Int> = arrayOf(1,2,3,4,5)
    println("Array: ${numberArray.joinToString()}")

//    Buat listOfFruits dengan tipe List berisi "Apple", "Banana", "Mango". Cetak list tersebut.
    val listOfFruits: List<String> = listOf("Apple", "Banana", "Mango")
    println("List of Fruits: ${listOfFruits.joinToString()}")

//    Buat mutableListOfScores dengan tipe MutableList, isi dengan 80, 85, 90. Tambahkan angka 95, lalu cetak semua.
    val mutableListOfScores: MutableList<Int> = mutableListOf(80,85,90)
    mutableListOfScores.add(95)
    println("Mutable List of Scores: ${mutableListOfScores.joinToString()}")

//    Buat setOfNumbers dengan isi 1,2,2,3,3,4. Cetak hasilnya. Apakah ada elemen yang duplikat?
    val setOfNumbers: Set<Int> = setOf(1,2,2,3,3,4)
    println("Set of Numbers: ${setOfNumbers.joinToString()}") // tidak ada duplikat

//    Buat mapOfStudent dengan isi: "Math" to 90, "Science" to 85. Cetak semua pasangan key-value.
    val mapOfStudent: Map<String, Int> = mapOf("Math" to 90, "Science" to 85)
    println("Math: ${mapOfStudent["Math"]}")
    println("Science: ${mapOfStudent["Science"]}")

//    🔹 Bagian 5 — Mix & Match
    println("\n=== Bagian 5 ===")
//    Deklarasikan variabel city, year, dan pi menggunakan type inference (tanpa menuliskan tipe datanya).
//    - city = "Jakarta"
//    - year = 2025
//    - pi = 3.14159 Cetak semua nilai dalam satu baris.
    val city = "Jakarta"
    val year = 2025
    val pi = 3.14159
    println("City: $city, Year: $year, Pi: $pi")

//    Buat variabel isLoggedIn dengan nilai false. Ubah nilainya menjadi true dan cetak sebelum & sesudah.
    var isLoggedIn: Boolean = false
    var beforeChange = isLoggedIn
    isLoggedIn = true
    println("Before: $beforeChange, After: $isLoggedIn")

//    Buat variabel charList berisi huruf-huruf nama depanmu (contoh: "K", "H", "A", "L", "I", "D") dalam bentuk Array. Cetak seluruh isi array.
    val charList: CharArray = charArrayOf('R', 'I', 'A', 'N')
    println("Char List: ${charList.joinToString()}")

//    🔹 Bagian 6 — Tantangan
//    Buat variabel studentInfo berupa MutableMap<String, Any>, dengan isi:
//    - "name" → nama kamu (String)
//    - "age" → umur kamu (Int)
//    - "score" → nilai ujian (Double) Tambahkan key "isGraduated" dengan nilai Boolean, lalu cetak seluruh isi map.
    val studentInfo: MutableMap<String, Any> = mutableMapOf("name" to "Rian", "age" to 21, "score" to 87.5)
    studentInfo["isGraduated"] = false
    println("Student Info: $studentInfo")

//    Buat array grades berisi A, B, C, D, E. Cetak hanya nilai pertama dan terakhir.
    val grades: Array<Char> = arrayOf('A', 'B', 'C', 'D', 'E')
    println("First Grade: ${grades.first()}, Last Grade: ${grades.last()}")

//    Buat MutableList<String> bernama hobbies, isi dengan minimal 3 hobi kamu. Hapus satu hobi dari list, lalu cetak hasil akhirnya.
    val hobbies: MutableList<String> = mutableListOf("Gaming", "Reading", "Coding")
    hobbies.remove("Reading")
    println("Hobbies: $hobbies")
}