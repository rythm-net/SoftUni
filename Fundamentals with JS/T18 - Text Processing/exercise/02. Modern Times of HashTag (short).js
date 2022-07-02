function solve(text) {
    let tokens = text.split(' ');
    let result = [];

    for (let token of tokens) {
        if (token.length > 1 && token[0] == "#") {
            let valid = true;

            for (let char of token.substring(1)) {
                let currCode = char.charCodeAt(0);
                if (
                    (currCode < 65 || currCode > 90) &&
                    (currCode < 97 || currCode > 122)
                ) {
                    valid = false;
                    break;
                }
            }

            if (valid){
                result.push(token.substring(1))
            }
        }
    }

    for (let words of result){
        console.log(words)
    }
}
solve("Nowadays everyone uses #* to tag a #special word in #socialMedia");
solve("The symbol # is known #variously in English-speaking #regions as the #number sign");