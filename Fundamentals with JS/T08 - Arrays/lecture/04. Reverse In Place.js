function solve(arr) {
    let newArr = [];
    for (let i = arr.length - 1; i >= 0; i--) {
        newArr.push(arr[i]);
    }
    console.log(newArr.join(' '));
}
solve(['abc', 'def', 'hig', 'klm', 'nop'])