function solve(array) {
    let [emp1, emp2, emp3, students] = array.map(Number);
    let studentsPerHour = emp1 + emp2 + emp3;
    let hours = 0;

    while (students > 0) {
        hours++;

        if (hours % 4 == 0) {
            hours++;
        }
        students -= studentsPerHour;
    }
    console.log(`Time needed: ${hours}h.`);
}
solve(["5", "6", "4", "20"]);
solve(["1", "2", "3", "45"]);
solve(["3", "2", "5", "40"]);