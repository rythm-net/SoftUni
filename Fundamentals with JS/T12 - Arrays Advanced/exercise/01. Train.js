function train(array) {
    let wagons = array.shift().split(" ").map(Number);
    let maxCapacityOfWagon = Number(array.shift());

    for (let i = 0; i < array.length; i++) {
        let [command, number] = array[i].split(" ");
        number = Number(number);

        if (command === "Add") {
            add(number, maxCapacityOfWagon);
        } else {
            command = Number(command);
            passenger(command, maxCapacityOfWagon);
        }
    }

    console.log(wagons.join(" "));

    function add(num, max) {
        if (num <= max) {
            wagons.push(num);
        }
    }

    function passenger(num, max) {
        for (let i = 0; i < wagons.length; i++) {
            let result = num + wagons[i];
            if (result <= max) {
                wagons.splice(i, 1, result);
                break;
            }
        }
    }
}
train(["32 54 21 12 4 0 23", "75", "Add 10", "Add 0", "30", "10", "75"]);