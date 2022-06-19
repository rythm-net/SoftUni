function arrayManipulastor(arrayOfIntegers, arrayOfComands) {
    for (let i = 0; i < arrayOfComands.length; i++) {
        let command = arrayOfComands[i].split(" ");

        if (command[0] === "add") {
            let index = Number(command[1]);
            let element = Number(command[2]);
            add(arrayOfIntegers, index, element);

        } else if (command[0] === "addMany") {
            command.shift();
            let index = Number(command.shift());
            let elements = command.splice(0).map(Number);
            addMany(arrayOfIntegers, index, elements);

        } else if (command[0] === "contains") {
            let element = Number(command[1]);
            console.log(contains(arrayOfIntegers, element));

        } else if (command[0] === "remove") {
            let index = Number(command[1]);
            remove(arrayOfIntegers, index);

        } else if (command[0] === "shift") {
            let positions = Number(command[1]);
            shift(arrayOfIntegers, positions);

        } else if (command[0] === "sumPairs") {

            for (let j = 0; j < arrayOfIntegers.length; j++) {
                let num = Number(arrayOfIntegers[j]);

                for (let p = j + 1; p < arrayOfIntegers.length; p++) {
                    let secondNum = Number(arrayOfIntegers[p]);
                    num += secondNum;
                    arrayOfIntegers.splice(j, 2, num);
                    break;
                }
            }
        } else {
            console.log(`[ ${arrayOfIntegers.join(", ")} ]`);
        }
    }

    function add(array, index, element) {
        array.splice(index, 0, element);
    }
    function addMany(array, index, elements) {
        array.splice(index, 0, ...elements);
    }
    function contains(array, element) {
        return array.indexOf(element);
    }
    function remove(array, index) {
        array.splice(index, 1);
    }
    function shift(array, positions) {
        for (let i = 0; i < positions; i++) {
            array.push(array.shift());
        }
    }
}
arrayManipulastor(
    [1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2],
    ["sumPairs", "sumPairs", "addMany 0 -1 -2 -3", "print"]);