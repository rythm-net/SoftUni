function arrayRotation(array, number) {
    let rotation = "";

    for (let i = 0; i < number; i++) {
        let first = array.shift();
        array.push(first);
    }

    for (let j = 0; j < array.length; j++) {
        rotation += " " + array[j];
    }
    console.log(rotation);
}
arrayRotation([51, 47, 32, 61, 21], 2);
arrayRotation([32, 21, 61, 1], 4);
arrayRotation([2, 4, 15, 31], 5);