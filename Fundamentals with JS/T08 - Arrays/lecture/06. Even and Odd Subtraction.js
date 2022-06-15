function solve(arr) {
    let evenSum = 0;
    let oddSum = 0;

    for (i = 0; i <= arr.length - 1; i++) {
        num = arr[i];
        if (num % 2 === 0) {
            evenSum += num;
        } else {
            oddSum += num;
        }
    }
    console.log(evenSum - oddSum);
}
solve([2,4,6,8,10]);