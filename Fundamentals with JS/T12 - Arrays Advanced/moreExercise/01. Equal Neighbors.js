function equalNeighbors(arr) {
    let count = 0;

    for (let i = 0; i < arr.length; i++) {
        let array = arr[i];
        for (let j = 0; j < array.length; j++) {
            let element = array[j];
            if (i !== arr.length - 1) {
                if (element === array[j + 1]) {
                    count++;
                }
                if (element === arr[i + 1][j]) {
                    count++;
                }
            } else if (element === array[j + 1]) {
                count++;
            }
        }
    }
    console.log(count);
}
equalNeighbors([
    ["test", "yo", "yo", "ho"],
    ["well", "done", "no", "6"],
    ["not", "done", "yet", "5"],]);