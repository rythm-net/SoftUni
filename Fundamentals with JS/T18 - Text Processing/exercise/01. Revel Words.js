function solve(words, sentance) {
    let wordsArr = words.split(", ");

    for (let word of wordsArr) {

        sentance = sentance.replace("*".repeat(word.length), word)
    }
    console.log(sentance)
}
solve("great, beate", "softuni is ***** place for ***** new programming languages");