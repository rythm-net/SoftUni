function solve(text) {
    let result = text[0];

    for (let i = 1; i < text.length; i++) {
        if (text[i] !== text[i-1]) {
            result+= text[i]
        }
    }
    console.log(result)
}
solve("aBaaaBbbbbbcdddeeeedssaa");