function searchingForNumber(firstArray, secondArray) {
    let [numberOfElements, deletingCount, searchedNumber] = secondArray;
    let array = firstArray.slice(0, numberOfElements);
    array.splice(0, deletingCount);
    let count = 0;

    if (array.includes(searchedNumber)) {
        for (let index of array) {
            if (index === searchedNumber) {
                count++;
            }
        }
        console.log(`Number ${searchedNumber} occurs ${count} times.`);
    } else {
        console.log(`Number ${searchedNumber} occurs ${count} times.`);
    }
}
searchingForNumber([5, 2, 3, 4, 1, 6], [5, 2, 3]);