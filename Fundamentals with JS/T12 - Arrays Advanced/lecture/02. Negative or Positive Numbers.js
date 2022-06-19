function negativeOrPositiveNumbers(arr) {
    let newArr = [];

    for (let char of arr) {
        if (Number(char) < 0) {
            newArr.unshift(char);
        } else {
            newArr.push(char)
        }
    }
    console.log(newArr.join('\n'));
}
negativeOrPositiveNumbers(['7', '-2', '8', '9']);
console.log("---")
negativeOrPositiveNumbers(['3', '-2', '0', '-1']);