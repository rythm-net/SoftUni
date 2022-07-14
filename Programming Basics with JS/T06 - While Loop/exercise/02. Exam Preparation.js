function exam(input) {
    let allowed = Number(input[0]);
    let tasks = 0;
    let badGrades = 0;
    let total = 0;
    let lastTask = '';
    let currentGrade;
    let averageGrade = 0;
    let i = 1;
    let j = 2;

    while (badGrades < allowed) {

        if (input[i] === 'Enough' || input[j] === 'Enough') {
            averageGrade = total / tasks;
            console.log(`Average score: ${averageGrade.toFixed(2)}`);
            console.log(`Number of problems: ${tasks}`);
            console.log(`Last problem: ${lastTask}`);
            return;

        } else {
            currentGrade = Number(input[j]);
            if (currentGrade <= 4.00) {
                badGrades++;
            }
            total += currentGrade;
            tasks++;
            lastTask = input[i];
            i += 2;
            j += 2;
        }
    }
    console.log(`You need a break, ${badGrades} poor grades.`);
}
exam(["3", "Money", "6", "Story", "4", "Spring Time", "5", "Bus", "6", "Enough"]);
exam(["2", "Income", "3", "Game Info", "6", "Best Player", "4"]);