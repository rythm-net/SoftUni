function solve(input) {
    let text = input[0];
    let pattern = /(@|#)(?<hiddenWord1>[A-Za-z]{3,})\1\1(?<hiddenWord2>[A-Za-z]{3,})/g;
    let counter = 0;
    let match = pattern.exec(text);
    let result = [];
    let isMatch = false;

    while (match !== null) {
        counter++;

        let word1 = match[2];
        let word2 = match[3];
        let reversed = word2.split("").reverse().join("");

        if (word1 == reversed) {
            isMatch=true
            result.push(`${word1} <=> ${word2}`);
        }
        match = pattern.exec(text);
    }

    if (counter > 0) {
        console.log(`${counter} word pairs found!`);

        if (isMatch) {
            console.log(`The mirror words are:`);
            console.log(result.join(", "));
        } else {
            console.log(`No mirror words!`)
        }

    } else {
        console.log(`No word pairs found!`);
        console.log(`No mirror words!`)
    }
}
solve (['@mix#tix3dj#poOl##loOp#wl@@bong&song%4very$long@thong#Part##traP##@@leveL@@Level@##car#rac##tu@pack@@ckap@#rr#sAw##wAs#r#@w1r'])