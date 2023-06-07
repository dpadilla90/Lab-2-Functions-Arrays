fun main() {
    //Tester for function #1
    encryptFunctionTester();
    //Test Function #2
    averageArrayTester ();
    //tester for function #3
    arrayContainsTester();
    //tester for function #4
    reverseArrayTester();
}

/**
 * Encrypts the given input string by shifting each character to the right by the specified shift amount.
 *
 * @param inputString The string to be encrypted.
 * @param shiftAmount The amount by which each character should be shifted.
 * @return The encrypted string.
 */
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

//Function tester code
fun encryptFunctionTester(){
    println("Enter a string: ")
    val inputString = readLine() ?: "" // Read user input, default to empty string if null
    println("Enter a shift amount: ")
    val shiftAmount = readLine()?.toIntOrNull() ?: 0 // Read user input as Int, default to 0 if null or invalid

    val encryptedString: String = encrypt(inputString, shiftAmount) // Store the result in a val
    println("Encrypted String: $encryptedString") // Print the encrypted string
}

/**
 * Calculates the average of the elements in the given inputArray.
 *
 * @param inputArray The array of integers for which to calculate the average.
 * @return The average of the elements in the inputArray. Returns 0.0 if the inputArray is empty.
 */
fun arrayAvg(inputArray: Array<Int>): Double {
    if(inputArray.isEmpty()){ //Avoid divide by 0 in return
        return 0.0
    }
    var total = 0.0 // initialize total as double
    for (element in inputArray) {
        total += element // Accumulate the sum ef elements in the array
    }
    return (total / inputArray.size) //Calculate the average divding the total by the array size
}

fun averageArrayTester (){
    println("The average of the array is ${arrayAvg(arrayOf(1, 2, 3))} " ) //Expect 2
    println("The average of the array is ${arrayAvg(arrayOf(-1, 2, -3))} " ) //Expect: -2/3
    println("The average of the array is ${arrayAvg(arrayOf(-1909))} " ) //Expect -1909
    println("The average of the array is ${arrayAvg(arrayOf(-0))} " ) //Expect: 0
    println("The average of the array is ${arrayAvg(arrayOf())} " ) //Expect: 0
}



/**
 * Checks if the given inputArray contains the specified searchValue.
 *
 * @param inputArray The array of integers to search within.
 * @param searchValue The value to search for in the inputArray.
 * @return true if the searchValue is found in the inputArray, false otherwise.
 */
fun arrayContains(inputArray: Array<Int>, searchValue: Int): Boolean {
    for (element in inputArray) { // Iterate through each element in the inputArray
        if (element == searchValue) { // Check if the current element matches the searchValue
            return true // Return true if a match is found
        }
    }
    return false // Return false if no match is found
}
//Function tester
fun arrayContainsTester(){
    val array = arrayOf(1, 2, 3, 4, 5, 6)
    val integer = 0
    println("Input array: ${array.joinToString(", ")}")
    println("Search value: $integer")
    println(arrayContains(array,integer)) 

    val array2 = arrayOf(1, -2, 3, -4, 5, 6)
    val integer2 = -2
    println("Input array: ${array2.joinToString(", ")}")
    println("Search value: $integer2")
    println(arrayContains(array2,integer2)) 
}


/**
 * Reverses the elements in the given inputArray.
 *
 * @param inputArray The array of integers to be reversed.
 * @return The reversed array.
 */
fun reverseArray(inputArray: Array<Int>): Array<Int> {
    val reversedArray = Array(inputArray.size) { 0 } // Create a new array of the same size

    for (i in 0 until inputArray.size) {
        reversedArray[i] = inputArray[inputArray.size - 1 - i] // Copy elements in reverse order
    }

    return reversedArray // Return reversed array
}

//Function tester
fun reverseArrayTester(){

    val originalArray = arrayOf(1, 2, 3, 4, 5, 6)
    println("Original Array: ${originalArray.joinToString(", ")}")
    val reversedArray = reverseArray(originalArray)
    println("Reversed Array: ${reversedArray.joinToString(", ")}")

    val originalArray2 = arrayOf(-2, -3, -4, -5, -6)
    println("Original Array: ${originalArray2.joinToString(", ")}")
    val reversedArray2 = reverseArray(originalArray2)
    println("Reversed Array: ${reversedArray2.joinToString(", ")}")

}

