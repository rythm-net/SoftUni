function trainTrainers(input) {
    let index = 0;
    let judges = Number(input[index]);
    index++;

    let command = input[index];
    let sumGrades = 0;
    let themes = 0;

    while (command !== 'Finish') {
        themes++;
        let name = command;
        let tempSumGrade = 0;

        for (let i = 0; i < judges; i++) {
            index++;
            let grade = Number(input[index]);
            tempSumGrade += grade;
        }

        let tempAvgGrade = tempSumGrade / judges;
        sumGrades += tempAvgGrade;
        console.log(`${name} - ${tempAvgGrade.toFixed(2)}.`);
        index++;
        command = input[index];
    }

    let avgGrade = sumGrades / themes;
    console.log(`Student's final assessment is ${avgGrade.toFixed(2)}.`);
}
trainTrainers(["2", "While-Loop", "6.00", "5.50", "For-Loop", "5.84", "5.66", "Finish"]);