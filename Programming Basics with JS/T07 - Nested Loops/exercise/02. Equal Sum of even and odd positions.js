function equalSum(input) {
    let first = Number(input[0]);
    let second = Number(input[1]);
    let printLine = '';

    for (let i = first; i <= second; i++) {
        let currentNumber = i.toString();
        let evenSum = 0;
        let oddSum = 0;

        for (let j = 0; j < currentNumber.length; j++) {
            let currentDigit = Number(currentNumber.charAt(j));
            if (j % 2 === 0) {
                evenSum += currentDigit;
            } else {
                oddSum += currentDigit;
            }
        }

        if (oddSum === evenSum) {
            printLine += `${i} `;
        }
    }
    console.log(printLine);
}
equalSum(["100000", "100050"]);