function solve(input) {
    let totalSum = 0
    let text = input[0];
    let caseLetter = input[1];

    for (const char of text) {
        let currChar = char.charCodeAt(0);
        if (caseLetter === "LOWERCASE" && currChar >= 97 && currChar <= 122) {
            totalSum += currChar;
        } else if (caseLetter === "UPPERCASE" && currChar >= 65 && currChar <= 90) {
            totalSum += currChar;
        }
    }
    console.log(`The total sum is: ${totalSum}`);
}
solve(['HelloFromMyAwesomePROGRAM', 'LOWERCASE']);
solve(['AC/DC', 'UPPERCASE'])