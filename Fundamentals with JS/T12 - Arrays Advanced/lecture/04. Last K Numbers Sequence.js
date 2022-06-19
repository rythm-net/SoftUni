function lastKNumbersSequance(n, k) {
    let arr = [1];

    for (let i = 1; i < n; i++) {
        let lastK = arr.slice(-k);
        let sum = 0;

        for (let char of lastK) {
            sum += char
        }
        arr.push(sum)
    }
    console.log(arr.join(" "))
}
lastKNumbersSequance(6, 3);
console.log("---")
lastKNumbersSequance(8, 2);