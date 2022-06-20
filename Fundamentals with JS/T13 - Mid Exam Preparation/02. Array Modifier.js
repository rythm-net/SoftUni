function solve(array) {
    let numsArray = array[0].split(" ").map(Number);
    let commands = array.slice(1);

    for (let command of commands) {
        let [comanda, index1, index2] = command.split(" ");

        if (comanda == "end") {
            console.log(numsArray.join(", "));

        } else if (comanda == "swap") {
            let num1 = numsArray[index1];
            let num2 = numsArray[index2];
            numsArray[index1] = num2;
            numsArray[index2] = num1;

            //   numsArray.splice(index1, 1, num2);
            //   numsArray.splice(index2, 1, num1);

        } else if (comanda == "multiply") {
            numsArray[index1] *= numsArray[index2];

            //   let calc = Number(numsArray[index1]) * Number(numsArray[index2]);
            //   numsArray.splice(index1, 1, calc);

        } else if (comanda == "decrease") {

            // for (let i = 0; i < numsArray.length; i++) {
            //     numsArray[i]-=1

            numsArray.map((x) => (x -= 1));
        }
    }
}
solve(["23 -2 321 87 42 90 -123",
    "swap 1 3", "swap 3 6", "swap 1 0",
    "multiply 1 2", "multiply 2 1",
    "decrease", "end",]);