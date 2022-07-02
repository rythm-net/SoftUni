function solve(text) {
    let firstHalf = text
        .split("")
        .slice(0, text.length / 2)
        .reverse()
        .join("");

    let secondHalf = text
        .split("")
        .slice(text.length / 2)
        .reverse()
        .join("");

    console.log(firstHalf)
    console.log(secondHalf)
}
solve("tluciffiDsIsihTgnizamAoSsIsihT");