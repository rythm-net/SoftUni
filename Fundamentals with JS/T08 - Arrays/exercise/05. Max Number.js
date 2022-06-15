function maxNumber(array) {
    let line = "";

    for (let i = 0; i < array.length; i++) {
        let isItBigger = true;

        for (let j = i + 1; j < array.length; j++) {
            if (array[i] <= array[j]) {
                isItBigger = false;
            }
        }
        if (isItBigger) {
            line += " " + array[i];
        }
    }
    console.log(line);
}
maxNumber([41, 41, 34, 20]);