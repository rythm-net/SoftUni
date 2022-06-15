function nonDecreasing(array) {
    let newArray = [];
    newArray.unshift(array.shift());

    for (let i = 0; i < array.length; i++) {
        let curentBiggest = array[i];

        for (let j = 0; j < newArray.length; j++) {
            let lastElement = newArray.pop();
            newArray.push(lastElement);

            if (curentBiggest >= lastElement) {
                newArray.push(curentBiggest);
                break;
            } else {
                break;
            }
        }
    }
    console.log(newArray.join(" "));
}
nonDecreasing([1, 3, 8, 4, 10, 12, 3, 2, 24]);
nonDecreasing([1, 2, 3, 4]);
nonDecreasing([20, 3, 2, 15, 6, 1]);