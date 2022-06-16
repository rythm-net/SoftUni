function simpleCalculator(a, b, operator) {
    switch (operator) {
        case "multiply":
            return a * b;
        case "divide":
            return a / b;
        case "add":
            return a + b;
        case "subtract":
            return a - b;
    }
}
console.log(simpleCalculator(5, 5, 'multiply'));
console.log(simpleCalculator(40, 8, 'divide'));
console.log(simpleCalculator(12, 19, 'add'));
console.log(simpleCalculator(50, 13, 'subtract'));