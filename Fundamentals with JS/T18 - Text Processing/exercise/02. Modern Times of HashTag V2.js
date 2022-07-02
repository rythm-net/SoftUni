function solve(text) {
    let result = [];

    for (let word of text.split(" ")) {
        if (word[0] === "#" && word.length !== 1) {
            result.push(word.substring(1));
        }
    }
    let final = [];

    for (let el of result) {
        let word = el.split("");
        let wordL = word.length;
        let flag = true;

        for (let i = 0; i < wordL; i++) {
            let char = word[i].charCodeAt(0);

            if (
                (char < 65 || char > 90) &&
                (char < 97 || char > 122)
            ) {
                flag = false;
            }
        }

        if (flag == true) {
            final.push(el);
        }
    }
    final.forEach((el) => console.log(el));
}
solve("Nowadays everyone uses #* to tag a #special word in #socialMedia");
solve("The symbol # is known #variously in English-speaking #regions as the #number sign");