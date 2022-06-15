function addAndSubstract(array) {
    let changedArray = [array.length - 1];
    let firstSum = 0;
    let secondSum = 0;

    for (let i = 0; i < array.length; i++) {
        if (Number(array[i]) % 2 === 0) {
            changedArray[i] = Number(array[i]) + i;
        } else {
            changedArray[i] = Number(array[i]) - i;
        }
        firstSum += Number(array[i]);
        secondSum += Number(changedArray[i]);
    }
    console.log(changedArray);
    console.log(firstSum);
    console.log(secondSum);
}
addAndSubstract([5, 15, 23, 56, 35]);
addAndSubstract([-5, 11, 3, 0, 2]);