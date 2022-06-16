function oddAndEvenSum(num) {
    let evenSum = 0;
    let oddSum = 0;
    let numToString = num.toString()

    for (let i = 0; i < numToString.length; i++) {
        if (numToString[i] % 2 === 0) {
            evenSum += Number(numToString[i]);
        } else {
            oddSum += Number(numToString[i]);
        }
    }
    console.log(`Odd sum = ${oddSum}, Even sum = ${evenSum}`);
}
oddAndEvenSum(1000435);
oddAndEvenSum(3495892137259234);