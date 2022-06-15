function mergeArrays(firstArray, secondArray) {
    let array = [firstArray.length - 1];

    for (let i = 0; i < firstArray.length; i++) {
        if (i % 2 === 0 || i === 0) {
            array[i] = Number(firstArray[i]) + Number(secondArray[i]);
        } else {
            array[i] = firstArray[i] + secondArray[i];
        }
    }

    console.log(
        `${array[0]} - ${array[1]} - ${array[2]} - ${array[3]} - ${array[4]}`);
}
mergeArrays(["5", "15", "23", "56", "35"], ["17", "22", "87", "36", "11"]);
mergeArrays(["13", "12312", "5", "77", "4"], ["22", "333", "5", "122", "44"]);