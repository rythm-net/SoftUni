function minNumber(input) {
    let min = Number(input[0]);
    let i = 1;
    let currentNumber;

    while (input[i] !== 'Stop') {
        currentNumber = Number(input[i]);
        if (currentNumber < min) {
            min = currentNumber;
        }
        i++;
    }
    console.log(min);
}
minNumber(["100", "99", "80", "70", "Stop"]);
minNumber(["-1", "-2", "Stop"]);