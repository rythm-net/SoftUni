function solve(arr) {
    let sum = 0;
    for (i = 0; i <= arr.length - 1; i++) {
        let num = Number(arr[i]);
        if (num % 2 === 0) {
            sum += num;
        }
    }
    console.log(sum);
}
solve(['1','2','3','4','5','6']);