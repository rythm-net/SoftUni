function meetings(input) {
    let arr = {};

    for (let i = 0; i < input.length; i++) {
        let line = input[i].split(" ");
        let name = line[0];
        let number = line[1];

        arr[name] = number;
    }

    for (let name in arr) {
        console.log(`${name} -> ${arr[name]}`);
    }
}
meetings([
    "Tim 0834212554",
    "Peter 0877547887",
    "Bill 0896543112",
    "Tim 0876566344",]);