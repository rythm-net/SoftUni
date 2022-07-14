function maxNumber(input) {
    let max = Number(input[0]);
    let i = 1;
    let currentNumber;

    while (input[i] !== 'Stop') {
        currentNumber = Number(input[i]);
        if (currentNumber > max) {
            max = currentNumber;
        }
        i++;
    }
    console.log(max);
}
maxNumber(["100", "99", "80", "70", "Stop"]);
maxNumber(["-10", "20", "-30", "Stop"]);
maxNumber(["45", "-20", "7", "99", "Stop"]);