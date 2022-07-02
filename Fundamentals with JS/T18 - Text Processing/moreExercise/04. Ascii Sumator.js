function solve(input) {
    let char1 = Math.min(input[0].charCodeAt(0), input[1].charCodeAt(0));
    let char2 = Math.max(input[0].charCodeAt(0), input[1].charCodeAt(0));
    let text = input[2];
    let sum = 0;

    for (const char of text) {
        let currChar = char.charCodeAt(0);
        if (currChar > char1 && currChar < char2) {
            sum += currChar;
        }
    }
    console.log(sum);
}