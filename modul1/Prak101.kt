import java.util.Scanner
fun main(){
    val masukkansuhu= Scanner(System.`in`)
    println("Waktu Sekarang:")
    val waktu= readLine()
    println("Nama Anda:")
    val nama= readLine()
    println("Umur Anda:")
    val umur= Integer.valueOf(readLine())
    println("Suhu Tubuh Anda:")
    val suhutubuh= masukkansuhu.nextFloat()

    println("Selamat $waktu, $nama.")
    println("Umur anda $umur Tahun.")
    println("Suhu Tubuh anda $suhutubuh derajat Celcius.")
}
