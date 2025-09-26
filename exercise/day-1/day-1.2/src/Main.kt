fun main(){
//    🔹 Bagian 1 — Aritmatika
    println("\n=== Bagian 1 ===")

//    Buat variabel length = 7 dan width = 4. Hitung luas persegi panjang.
    val length = 7
    val width = 4
    println("Luas Persegi Panjang: ${length * width}")

//    Buat variabel radius = 10. Hitung keliling lingkaran dengan rumus 2 * π * r (gunakan 3.14 untuk π).
    val radius = 10
    val pi = 3.14
    println("Keliling Lingkarang: ${2 * pi * radius}")

//    Hitung sisa pembagian 200 % 7.
    println("Sisa Pembagian 200 % 7 = ${200 % 7}")

//    🔹 Bagian 2 — Perbandingan
    println("\n=== Bagian 2 ===")

//    Buat variabel x = 100 dan y = 200. Cek apakah x lebih kecil dari y.
    val x = 100
    val y = 200
    println("x lebih kecil dari y = ${x < y}")

//    Buat variabel temp = 36.5. Cek apakah suhu tersebut sama dengan 37.0.
    val temp = 36.5
    println("apakah suhu tersebut sama dengan 37.0 = ${temp == 37.0}")

//    Buat variabel a = 50, b = 50. Cek apakah keduanya sama.
    val a = 50
    val b = 50
    println("apakah keduanya sama = ${a.equals(b)}")

//    🔹 Bagian 3 — Logika
    println("\n=== Bagian 3 ===")

//    Buat variabel isSunny = true dan isRaining = false. Cek apakah hari ini cerah (gunakan operator logika).
    val isSunny = true
    val isRaining = false
    println("apakah hari ini cerah = ${isSunny && !isRaining}")

//    Buat variabel hasMoney = true dan isStoreOpen = false. Cek apakah bisa belanja (harus punya uang DAN toko buka).
    val hasMoney = true
    val isStoreOpen = false
    println("apakah bisa belanja = ${hasMoney && isStoreOpen}")

//    Buat variabel isWeekend = true dan isHoliday = false. Cek apakah hari ini libur (weekend ATAU holiday).
    val isWeekend = true
    val isHoliday = false
    println("apakah hari ini libur = ${isWeekend || isHoliday}")

//    🔹 Bagian 4 — Assignment
    println("\n=== Bagian 4 ===")

//    Buat variabel num = 8. Tambahkan 5, lalu kalikan 2, lalu kurangi 3, lalu bagi 5. Cetak hasil akhir.
    var num = 8
    num += 5
    num *= 2
    num -= 3
    num /= 5
    println("Hasil Perhitungan = $num")

//    Buat variabel price = 1000. Diskon 20% bisa ditulis sebagai price -= price * 20 / 100. Hitung harga setelah diskon.
    var price = 1000
    price -= price * 20 /100
    println("harga setelah diskon = ${price}")

//    🔹 Bagian 5 — Increment / Decrement
    println("\n=== Bagian 4 ===")

//    Buat variabel counter = 10. Naikkan ++ sebanyak 2 kali, lalu turunkan -- sebanyak 3 kali. Cetak hasil akhir.
    var counter = 10
    counter++
    counter++
    counter--
    counter--
    counter--
    println("Hasil akhir = $counter")

//    Buat variabel points = 0. Naikkan 5 kali dengan ++, lalu kurangi 1 kali dengan --. Cetak hasil akhir.
    var points = 0
    points++
    points++
    points++
    points++
    points++
    points--
    println("Hasil akhir = $points")
}