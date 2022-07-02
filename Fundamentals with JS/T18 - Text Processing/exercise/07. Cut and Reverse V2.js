function solve(input) {
    let arr = input.split("");
    let first = [];
    let second = [];

    for (let i = 0; i < arr.length / 2; i++) {
        first.push(arr[i]);
        second.push(arr[arr.length - 1 - i]);
    }
    return [first.reverse().join(""), second.join("")].join("\n");
}
console.log(solve("tluciffiDsIsihTgnizamAoSsIsihT"));