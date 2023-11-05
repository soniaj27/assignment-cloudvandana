function sortDescending(arr) {
    // Using the built-in sort method with a custom comparison function
    // That comparison function sorts elements in descending order (b - a)
    arr.sort((a, b) => b - a);
    // Return the sorted array
    return arr;
}

// Prompt the user to enter numbers separated by commas and store it in the variable inputString
const inputString = prompt("Enter numbers separated by commas for Creating an Array:");

if (inputString) {
    // Split the input string by commas and convert each element to a number using the map function
    const inputArray = inputString.split(',').map(Number);

    // Check if there are any NaN (Not a Number) values in the array
    if (!inputArray.some(isNaN)) {
        console.log("Input Array:", inputArray);

        // Call the sortDescending function with the input array and store the result in sortedArray
        const sortedArray = sortDescending(inputArray);

        console.log("Sorted Descending Array:", sortedArray);
    } else {
        console.log("Invalid input. Please enter valid numbers separated by commas.");
    }
} else {
    // If no input is provided, print a message to the console
    console.log("No input provided.");
}
