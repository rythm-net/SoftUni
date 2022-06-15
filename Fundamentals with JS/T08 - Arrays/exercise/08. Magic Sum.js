function magicSum(array, number) {
    for (let i = 0; i < array.length - 1; i++) {
        for (let j = i + 1; j < array.length; j++) {
            if (Number(array[i]) + Number(array[j]) === number) {
                console.log(`${Number(array[i])} ${Number(array[j])}`);
                break;
            }
        }
    }
}
magicSum([6, 2, 2, 6], 8);