function sumNumbers(input) {
    let start = Number(input[0]);
    let end = Number(input[1]);
    let magicNumber = Number(input[2]);
    let combinationsCount = 0;

    for (let i = start; i <= end; i++) {
        for (let j = start; j <= end; j++) {
            let sum = i + j;
            combinationsCount++;

            if (sum === magicNumber) {
                console.log(`Combination N:${combinationsCount} (${i} + ${j} = ${magicNumber})`);
                return;
            }
        }
    }
    console.log(`${combinationsCount} combinations - neither equals ${magicNumber}`);
}
sumNumbers(['1', '10', '5']);
sumNumbers(['88', '888', '1000']);
sumNumbers(['23', '24', '20']);
sumNumbers(['88', '888', '2000']);