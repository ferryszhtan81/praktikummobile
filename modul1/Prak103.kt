internal object PRAK103 {
    private fun HASIL(N: Int) {
        for (num in 0 until N * N) {
            if (num % 2 == 0 && num % 3 == 0) print("$num ")
        }
    }
    @JvmStatic
    fun main(args: Array<String>) {
        val N = Integer.valueOf(readLine())
        HASIL(N)
    }
}
