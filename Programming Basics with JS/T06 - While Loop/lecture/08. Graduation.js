function graduation(input) {
    let student = input[0];
    let averageGrade = 0.0;
    let total = 0.0;
    let i = 1;
    let classes = 12;

    while (i <= classes) {
        let currentGrade = Number(input[i]);

        if (currentGrade < 4.00) {
            console.log(`${student} has been excluded at ${i} grade`);
            return;
        }
        total += currentGrade;
        i++;
    }
    averageGrade = total / classes;
    console.log(`${student} graduated. Average grade: ${averageGrade.toFixed(2)}`);
}
graduation(["Gosho", "5", "5.5", "6", "5.43", "5.5", "6", "5.55", "5", "6", "6", "5.43", "5"]);