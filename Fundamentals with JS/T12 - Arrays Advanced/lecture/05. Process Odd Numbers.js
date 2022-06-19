function processOddNumbers(arr) {
    let arrOfOddPositions = arr.filter((x, i) => i % 2 === 1).map(x => x * 2).reverse();
    console.log(arrOfOddPositions.join(" "))
}
processOddNumbers([10, 15, 20, 25]);
console.log("---");
processOddNumbers([3, 0, 10, 4, 7, 3]);