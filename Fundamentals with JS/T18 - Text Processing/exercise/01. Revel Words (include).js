function solve(words, sentance) {
    let wordsArr = words.split(", ");

    for (let word of wordsArr) {
        if (sentance.includes("*".repeat(word.length))) {
            sentance = sentance.replace("*".repeat(word.length), word);
        }
    }
    console.log(sentance);
}
solve("great, learning", "softuni is ***** place for ******** new programming languages");