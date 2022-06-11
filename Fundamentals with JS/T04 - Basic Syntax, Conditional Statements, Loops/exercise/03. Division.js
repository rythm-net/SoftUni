function solve(input) {
    let OurNumber = input;

    if (OurNumber % 10 === 0) {
        console.log('The number is divisible by 10');
    } else if (OurNumber % 7 === 0) {
        console.log('The number is divisible by 7');
    } else if (OurNumber % 6 === 0) {
        console.log('The number is divisible by 6');
    } else if (OurNumber % 3 === 0) {
        console.log('The number is divisible by 3');
    } else if (OurNumber % 2 === 0) {
        console.log('The number is divisible by 2');
    } else {
        console.log('Not divisible');
    }
}

solve(1643)