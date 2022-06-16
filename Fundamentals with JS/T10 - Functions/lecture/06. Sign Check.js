function signCheck(num1, num2, num3) {

    if (Math.sign(num1) === -1 && Math.sign(num2) === -1 && Math.sign(num3) === -1) {
        return 'Negative'

    } else if (Math.sign(num1) === 1 && Math.sign(num2) === -1 && Math.sign(num3) === -1) {
        return 'Positive'

    } else if (Math.sign(num1) === 1 && Math.sign(num2) === 1 && Math.sign(num3) === -1) {
        return 'Negative'

    } else if (Math.sign(num1) === 1 && Math.sign(num2) === 1 && Math.sign(num3) === 1) {
        return 'Positive'

    } else if (Math.sign(num1) === -1 && Math.sign(num2) === 1 && Math.sign(num3) === 1) {
        return 'Negative'

    } else if (Math.sign(num1) === -1 && Math.sign(num2) === -1 && Math.sign(num3) === 1) {
        return 'Positive'

    } else if (Math.sign(num1) === -1 && Math.sign(num2) === 1 && Math.sign(num3) === -1) {
        return 'Positive'

    } else if (Math.sign(num1) === 1 && Math.sign(num2) === -1 && Math.sign(num3) === 1) {
        return 'Negative'

    }
}
console.log(signCheck(5, 12, -15));
console.log(signCheck(-6, -12, 14));
console.log(signCheck(-1, -2, -3));
console.log(signCheck(-5, 1, 1));