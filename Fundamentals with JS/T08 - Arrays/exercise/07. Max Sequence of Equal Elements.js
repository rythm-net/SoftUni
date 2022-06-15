function myWork(array) {
    let longestSequence = [];

    for (let i = 0; i < array.length; i++) {
        let currentNum = Number(array[i]);
        let currentArray = [currentNum];

        for (let j = i + 1; j < array.length; j++) {
            if (currentNum === Number(array[j])) {
                currentArray.push(Number(array[j]));
            } else {
                break;
            }
        }

        if (currentArray.length > longestSequence.length) {
            longestSequence = [];
            for (let k = 0; k < currentArray.length; k++) {
                longestSequence.push(currentArray[k]);
            }
        }
    }
    console.log(longestSequence.join(" "));
}
myWork([0, 1, 1, 5, 2, 2, 6, 3, 3]);