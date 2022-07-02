function solve(text) {
    let words = [];
    let currWord = text[0];

    for (let index = 1; index < text.length; index++) {
        if (text[index].toUpperCase() !== text[index]) {
            currWord = currWord.concat(text[index]);
        } else {
            words.push(currWord);
            currWord = text[index];
        }
    }
    words.push(currWord)
    console.log(words.join(', '))
}
solve("SplitMeIfYouCanHaHaYouCantOrYouCan");