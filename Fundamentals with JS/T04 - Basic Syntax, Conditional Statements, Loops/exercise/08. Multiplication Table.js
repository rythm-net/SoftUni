function solve(num) {
    let ourNumber = num;

    for (let i = 1; i <= 10; i++) {
        let result = `${ourNumber} X ${i} = ${ourNumber * i}`
        console.log(result);
    }
}

solve(2)