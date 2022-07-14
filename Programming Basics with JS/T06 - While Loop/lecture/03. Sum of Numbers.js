function sumNumbers(input) {
    let number = Number(input[0]);
    let sum = 0;
    let i = 1;

    while(sum < number) {
        sum += Number(input[i]);
        i++;
    }
    console.log(sum);
}
sumNumbers(["100", "10", "20", "30", "40"]);
sumNumbers(["20", "1", "2", "3", "4", "5", "6"]);
