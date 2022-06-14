function solve(m, n) {

    for (let i = m; i >= n; i--) {
        console.log(i)
    }
}
//solve (8,5)

function solve1(m, n) {
    while (m >= n) {
        console.log(m)
        m--
    }
}
solve1(8, 5)