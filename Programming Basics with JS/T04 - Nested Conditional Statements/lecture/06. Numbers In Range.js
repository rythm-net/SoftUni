function numInRange(input) {
    let number = Number(input[0]);
    let inRange = ((number >= -100) && (number <= 100))

    if ((number >= -100) && (number <= 100) && (number !== 0)){
        console.log("Yes");
    } else {
        console.log("No")
    }
}
numInRange([0]);