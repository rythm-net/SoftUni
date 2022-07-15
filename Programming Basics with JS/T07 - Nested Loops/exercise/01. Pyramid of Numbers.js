function pyramid(input) {
    let n = Number(input[0]);
    let current = 1;
    let isBigger = false;

    for (let rows = 1; rows <= n; rows++) {
        let printCurrentLine = '';

        for (let cols = 1; cols <= rows; cols++) {
            if (current > n) {
                isBigger = true;
                break;
            }
            printCurrentLine += current + ' ';
            current++;
        }
        console.log(printCurrentLine);

        if (isBigger) {
            break;
        }
    }
}
pyramid(['15']);