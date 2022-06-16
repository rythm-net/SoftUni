function carWash(array) {
    let myArray = array;
    let value = 10;

    myArray.shift();

    for (let i = 0; i < myArray.length; i++) {
        let command = myArray[i];

        if (command === "soap") {
            value += 10;
        } else if (command === "water") {
            let waterIncreasing = value * 0.2;
            value += waterIncreasing;
        } else if (command === "vacuum cleaner") {
            let vacuumIncreasing = value * 0.25;
            value += vacuumIncreasing;
        } else {
            let decrease = value * 0.1;
            value -= decrease;
        }
    }
    console.log(`The car is ${value.toFixed(2)}% clean.`);
}
carWash(["soap", "water", "mud", "mud", "water", "mud", "vacuum cleaner"]);