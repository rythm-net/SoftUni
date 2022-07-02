function solve(text) {
    let words = text.split(" ").filter((el) => el !== "");
    let totalSum = 0;

    const isUpperCase = (letter) => letter.toUpperCase() === letter;
    const getAlphabetPosition = (Letter) => Letter.charCodeAt(0) - 96;

    words.forEach((word) => {
        let letterBefore = word[0];
        let letterAfter = word[word.length - 1];
        let number = Number(word.substring(1, word.length - 1));
        let beforePosition = getAlphabetPosition(letterBefore.toLowerCase());
        let afterPosition = getAlphabetPosition(letterAfter.toLowerCase());

        if (isUpperCase(letterBefore)) {
            number /= beforePosition;
        } else {
            number *= beforePosition;
        }

        if (isUpperCase(letterAfter)) {
            number -= afterPosition;
        } else {
            number += afterPosition;
        }
        totalSum += number;
    });
    console.log(totalSum.toFixed(2));
}
solve("P34562Z q2576f   H456z");