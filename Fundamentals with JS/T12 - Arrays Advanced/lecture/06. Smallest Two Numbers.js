function smallestTwoNumbers(arr) {
    let newArr = arr.sort((a, b) => a - b).slice(0, 2).join(" ")
    return newArr;
}
console.log(smallestTwoNumbers([30, 15, 50, 5]));
console.log("---");
console.log(smallestTwoNumbers([3, 0, 10, 4, 7, 3]));