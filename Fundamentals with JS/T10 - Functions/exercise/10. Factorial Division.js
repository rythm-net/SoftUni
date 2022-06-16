function factorialDivision(num1, num2) {
    let factorialNum1 = 1;
    let factorialNum2 = 1;

    if (num1 === 0 || num1 === 1)
        factorialNum1 = 1;
    for (let i = num1 - 1; i >= 1; i--) {
        num1 *= i;
    }
    let resultNum1 = num1

    if (num2 === 0 || num2 === 1)
        factorialNum2 = 1;
    for (let j = num2 - 1; j >= 1; j--) {
        num2 *= j;
    }
    let resultNum2 = num2

    let finalResult = (resultNum1 / resultNum2).toFixed(2);
    return finalResult
}
console.log(factorialDivision(5, 2));
console.log('---')
console.log(factorialDivision(6, 2));