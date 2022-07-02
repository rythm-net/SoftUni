function solve(text) {
    let result = [];
    let lastIndex = 0;
    let lower = text.toLocaleLowerCase();

    for (let i = 0; i < text.length; i++) {
        if (text[i] !== lower[i]) {
            let word = text.substring(lastIndex, i);
            lastIndex = i;
            if (word.length > 0) {
                result.push(word);
            }
        }
    }
    let word = text.substring(lastIndex);

    if (word.length > 0) {
        result.push(word);
    }
    console.log(result.join(", "));
}
solve("SplitMeIfYouCanHaHaYouCantOrYouCan");