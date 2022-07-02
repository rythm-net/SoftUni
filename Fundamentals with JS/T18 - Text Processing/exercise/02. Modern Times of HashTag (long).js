function solve(text) {
    let result = [];

    let collecting = false;
    let currentWord = "";

    for (let char of text) {
        if (collecting) {
            if (char == " ") {
                collecting = false;
                if (currentWord.length > 0) {
                    result.push(currentWord);
                }
                currentWord = "";
            } else {
                let code = char.charCodeAt(0);
                if ((code >= 65 && code <= 90) || (code >= 97 && code <= 122)) {
                    currentWord += char;
                } else {
                    collecting = false;
                }
            }
        } else {
            if (char == "#") {
                collecting = true;
            }
        }
    }

    if (collecting && currentWord.length > 0) {
        result.push(currentWord);
    }

    for (let word of result) {
        console.log(word);
    }
}
solve("Nowadays everyone uses #use to tag a #special word in #socialMedia");
solve("The symbol # is known #variously in English-speaking #regions as the #number sign");