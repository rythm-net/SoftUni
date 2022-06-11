function solve(n){
    let oddNum = 1
    let sum = 0

    for(let i=1 ; i<=n ; i++) {
        sum+=oddNum
            console.log(oddNum)
            oddNum+=2
    }
    console.log(`Sum: ${sum}`)
}

solve(5)