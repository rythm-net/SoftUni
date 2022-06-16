function nxNMatrix(n) {
    let arr = [];

    for (i = 0; i < n; i++) {
        arr.push([]);
        for (j = 0; j < n; j++) {
            arr[i][j] = n;
        }
    }
    for (let char of arr) {
        console.log(char.join(' '));
    }
}
nxNMatrix(3);
nxNMatrix(7);
nxNMatrix(2);