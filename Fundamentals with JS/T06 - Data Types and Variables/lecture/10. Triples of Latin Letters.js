function solve(num) {
    for (let i = 0; i < num; i++) {
        for (let k = 0; k < num; k++) {
            for (let j = 0; j < num; j++) {
                let char1 = String.fromCharCode(97 + i);
                let char2 = String.fromCharCode(97 + k);
                let char3 = String.fromCharCode(97 + j);
                console.log(char1 + char2 + char3);
            }
        }
    }
}
solve(3);