fun main() {

    fun encrypt(inputString: String, shiftAmount: Int): String {
        val array1 = inputString.toCharArray()

        // Modifying the original array
        for (i in 0 until shiftAmount) {
            val temp = array1[array1.size - 1] // Store the last element temporarily

            for (j in array1.size - 1 downTo 1) {
                array1[j] = array1[j - 1] // Shift each element to the right
            }

            array1[0] = temp // Place the stored element at the beginning
        }
        val shiftedString = array1.joinToString("") //array1 es converted back to a string
        return shiftedString //returns shifted string
    }

    // val encryptedString: String = encrypt("Carlos", 3)
    // print(encryptedString)

    fun arrayContains (inputArray: Array<Int>, searchValue: Int): Boolean {
        for (element in inputArray) {
            if (element == searchValue) {
                return true
        
            }
        }
        return false
    }

    print(arrayContains(arrayOf(1,2,3,4,5,6),0))

}
