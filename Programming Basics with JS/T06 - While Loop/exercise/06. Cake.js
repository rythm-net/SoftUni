function cake(input) {
    let length = Number(input.shift());
    let width = Number(input.shift());
    let pieces = length * width;
    let total = 0;

    while (pieces >= total) {
        let current = input.shift();

        if (current === "STOP") {
            break;
        }

        let piece = Number(current);
        total += piece;
    }

    if (total > pieces) {
        let need = total - pieces;
        console.log(`No more cake left! You need ${need} pieces more.`);
    } else {
        let left = pieces - total;
        console.log(`${left} pieces are left.`);
    }
}
cake(["10", "10", "20", "20", "20", "20", "21"]);
cake(["10", "2", "2", "4", "6", "STOP"]);