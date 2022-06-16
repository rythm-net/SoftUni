function repeatString(word, num) {
    let newWord = ''

    for (let i = 0; i < num; i++) {
        newWord += word
    }
    return newWord
}
console.log(repeatString("abc", 3));
console.log(repeatString("String", 2));