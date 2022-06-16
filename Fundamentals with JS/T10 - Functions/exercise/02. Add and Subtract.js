function addAndSubtract(a, b, c) {
    function sum(a, b) {
        return a + b;
    }
    let sumResult = sum(a, b);
    let subtract = (sumResult, c) => sumResult - c;
    let subtractResult = subtract(sumResult, c);

    console.log(subtractResult);
}
addAndSubtract(23, 6, 10);
addAndSubtract(1, 17, 30);
addAndSubtract(42, 58, 100);