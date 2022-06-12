function solve(num) {
    let ourNumber = num;
    for (let i = 1; i <= ourNumber; i++) {
        let output = '';
        for (let j = 1; j <= i; j++) {
            output += `${i} `;
        }
        console.log(output);
    }
}
solve(9)