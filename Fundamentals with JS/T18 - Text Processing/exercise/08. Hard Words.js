function solve(arrData) {
    let letter = arrData.shift().split(" ");
    let hardWords = arrData.shift();

    for (let i = 0; i < letter.length; i++) {
        let word = letter[i];

        for (let hardWord of hardWords) {
            if (word.endsWith("!") || word.endsWith("?") || word.endsWith(",") || word.endsWith(".") ) {
                if (word.slice(0, -1) === "_".repeat(hardWord.length)) {
                    word = word.replace("_".repeat(hardWord.length), hardWord);
                }
            } else if (word === "_".repeat(hardWord.length)) {
                word = hardWord;
            }
        }
        letter[i] = word;
    }

    console.log(letter.join(" "));
}
solve([
    "Hi, grandma! I'm so ____ to write to you. ______ the winter vacation, so _______ things happened. My dad bought me a sled. Mom started a new job as a __________. My brother's ankle is ________, and now it bothers me even more. Every night Mom cooks ___ on your recipe because it is the most delicious. I hope this year Santa will _____ me a robot.",
    ["pie", "bring", "glad", "During", "amazing", "pharmacist", "sprained"],]);