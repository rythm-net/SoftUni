function distinctArray(array) {
    for (let i = 0; i < array.length; i++) {
        let number = array[i];
        let count = 0;

        for (let j = 0; j < array.length; j++) {
            if (number == array[j]) {
                count++;
                if (count == 2) {
                    array.splice(j, 1);
                }
            }
        }
    }
    console.log(array.join(" "));
}
distinctArray([1, 2, 3, 4]);
distinctArray([7, 8, 9, 7, 2, 3, 4, 1, 2]);
distinctArray([20, 8, 12, 13, 4, 4, 8, 5]);