function solve(text, word) {
    let tokens = text.split(word)
    console.log(tokens.join("*".repeat(word.length)))
}
solve("A small sentence with some words", "small");
solve("Find the hidden word", "hidden");