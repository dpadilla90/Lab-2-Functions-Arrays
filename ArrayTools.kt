fun main() {}

    //Encrpt function #1
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
    // Prompt the user for input
    print("Enter a string: ")
    val inputString = readLine() ?: "" // Read user input, default to empty string if null
    print("Enter a shift amount: ")
    val shiftAmount = readLine()?.toIntOrNull() ?: 0 // Read user input as Int, default to 0 if null or invalid
    
    val encryptedString: String = encrypt(inputString, shiftAmount) // Store the result in a val
    println("Encrypted String: $encryptedString") // Print the encrypted string

/**
*Averages the elements of an Integer Array and outputs the average as a double
*@param inputArray The  array that will be averaged
*@return The average value of inputArray
*/
    fun arrayAvg(inputArray: Array<Int>): Double {
        var total = 0.0 // initialize total as double
        for (element in inputArray) {
            total += element // Accumulate the sum ef elements in the array
        }
        return (total / inputArray.size) //Calculate the average divding the total by the array size
    }
    
    println("The average of the array is ${arrayAvg(arrayOf(1, 2, 3, 4, 5, 6))}") //print result
    


    //Array Contain Function #3
    fun arrayContains (inputArray: Array<Int>, searchValue: Int): Boolean {
        for (element in inputArray) {
            if (element == searchValue) {
                return true
        
            }
        }
        return false
    }

    println(arrayContains(arrayOf(1,2,3,4,5,6),0))

    //Reverse Array function #4
    fun reverseArray(inputArray: Array<Int>): Array<Int> {
        val reversedArray = Array(inputArray.size) { 0 } // Create a new array of the same size
    
        for (i in 0 until inputArray.size) {
            reversedArray[i] = inputArray[inputArray.size - 1 - i] // Copy elements in reverse order
        }
    
        return reversedArray
    }
    
    val originalArray = arrayOf(1, 2, 3, 4, 5, 6)
    val reversedArray = reverseArray(originalArray)
    println("Reversed Array: ${reversedArray.joinToString(", ")}")

