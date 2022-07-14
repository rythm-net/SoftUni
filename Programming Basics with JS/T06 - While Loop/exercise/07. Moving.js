function moving(input) {
    let width = Number(input[0]);
    let length = Number(input[1]);
    let height = Number(input[2]);
    let availableSpace = width * length * height;
    let space = 0;
    let i = 3;

    while (input[i] !== 'Done') {
        let boxes = Number(input[i]);
        space += boxes

        if (space > availableSpace) {
            console.log(`No more free space! You need ${Math.abs(space - availableSpace)} Cubic meters more.`);
            break;
        }
        i++;
    }

    if (space <= availableSpace) {
        console.log(`${availableSpace - space} Cubic meters left.`);
    }
}
moving(["10", "10", "2", "20", "20", "20", "20", "122"]);
moving(["10", "1", "2", "4", "6", "Done"])