function charactersInRange(char1, char2) {
    let startingChar = char1.charCodeAt(0);
    let endingChar = char2.charCodeAt(0);
    let charArr = [];

    if (startingChar > endingChar) {
        startingChar = char2.charCodeAt(0);
        endingChar = char1.charCodeAt(0);
    }
    for (let i = startingChar + 1; i < endingChar; i++) {
        charArr.push(String.fromCharCode(i));
    }
    console.log(charArr.join(' '));
}
charactersInRange('a', 'd');
charactersInRange('#', ':');
charactersInRange('C', '#');