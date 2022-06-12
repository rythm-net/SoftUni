function solve(start, end) {
    let startNum = start;
    let endNum = end;
    let result = '';
    let sum = 0;

    for (let i = startNum; i <= endNum; i++) {
        result += `${i} `;
        sum += i;


    }
    console.log(result);
    console.log(`Sum: ${sum}`);

}
solve(5, 10)