function solve(text) {
    let textArr = text.split("");
    let reversedArr = textArr.reverse();
    let halfText = reversedArr.length / 2;
    let newText = reversedArr.join("");

    console.log(newText.substring(halfText));
    console.log(newText.substring(0, halfText));
}
solve("tluciffiDsIsihTgnizamAoSsIsihT");