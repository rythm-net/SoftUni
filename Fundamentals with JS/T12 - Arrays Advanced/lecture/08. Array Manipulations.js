function arrayManipulations(commands) {
    let arr = commands.shift().split(' ').map(Number);

    for (let i = 0; i < commands.length; i++) {
        let currentCommand = commands[i].split(' ');

        if (currentCommand[0] === "Add") {
            arr.push(Number(currentCommand[1]));
        }
        if (currentCommand[0] === "Remove") {
            arr = arr.filter(x => x !== Number(currentCommand[1]))
        }
        if (currentCommand[0] === "RemoveAt") {
            arr.splice(Number(currentCommand[1]), 1);
        }
        if (currentCommand[0] === "Insert") {
            arr.splice(Number(currentCommand[2]), 0, Number(currentCommand[1]));
        }
    }
    console.log(arr.join(" "))

}
arrayManipulations(
    ['4 19 2 53 6 43',
        'Add 3',
        'Remove 2',
        'RemoveAt 1',
        'Insert 8 3']);

console.log("---");

arrayManipulations(
    ['6 12 2 65 6 42',
        'Add 8',
        'Remove 12',
        'RemoveAt 3',
        'Insert 6 2']);