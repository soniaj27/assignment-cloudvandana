function reverseWords(sentence) {
    // Split the sentence into an array of words
    const words = sentence.split(' ');

    // Map over the array of words and reverse each word
    const reversedWords = words.map(word => {
        // Split the word into an array of characters, reverse it, and join it back into a word
        return word.split('').reverse().join('');
    });
    const reversedSentence = reversedWords.join(' ');

    // Return the reversed sentence
    return reversedSentence;
}
//take input from user
const inputSentence = prompt("Enter a sentence:");

// Check if the user provided an input
if (inputSentence) {
    // Call the reverseWords function with the input sentence and store the result in reversedSentence
    const reversedSentence = reverseWords(inputSentence);

    // Print the reversed sentence to the console
    console.log("Reversed Sentence:", reversedSentence);
} else {
    // If no input is provided, print a message to the console
    console.log("No input provided.");
}
