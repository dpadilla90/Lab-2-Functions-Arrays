fun main() {

    fun ceaserCipher(inputString: String, shiftAmount: Int): String {
        val array1 = inputString.toCharArray()

        // Modifying the original array
        for (i in 0 until shiftAmount) {
            val temp = array1[array1.size - 1] // Store the last element temporarily

            for (j in array1.size - 1 downTo 1) {
                array1[j] = array1[j - 1] // Shift each element to the right
            }

            array1[0] = temp // Place the stored element at the beginning
        }
        val shiftedString = array1.joinToString("")
        return shiftedString
    }

    val string: String = ceaserCipher("1234567", 3)
    print(string)
}
