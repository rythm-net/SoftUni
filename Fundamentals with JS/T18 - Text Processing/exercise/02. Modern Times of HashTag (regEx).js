function solve(text) {
    let textArr = text.split(" ");

    for (let word of textArr) {
        if (word[0] === "#" && word.length > 1) {
            let clearWord = word.substring(1);
            if (!/[^a-zA-Z]/.test(clearWord)) {
                console.log(clearWord);
            }
        }
    }
}
solve("Nowadays everyone uses #* to tag a #special word in #socialMedia");
solve("The symbol # is known #variously in English-speaking #regions as the #number sign");