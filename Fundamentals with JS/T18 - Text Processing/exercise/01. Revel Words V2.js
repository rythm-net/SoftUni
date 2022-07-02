function solve(a, b) {
    let word = a.split(", ");
    let sentence = b.split(" ");

    for (let el of word) {
        for (let i = 0; i < sentence.length; i++) {
            let words = sentence[i];
            if ("*".repeat(el.length) === words) {
                sentence[i] = el;
            }
        }
    }
    console.log(sentence.join(" "));
}
solve("great, learning", "softuni is ***** place for ******** new programming languages");