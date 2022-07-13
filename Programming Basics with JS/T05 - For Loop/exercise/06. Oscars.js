function oscars(input) {
    let name = input[0];
    let points = Number(input[1]);
    let judges = Number(input[2]);
    let judgeName, judgePoints;
    let index1 = 3, index2 = 4;

    for (let i = 0; i < judges; i++) {
        judgeName = input[index1];
        judgePoints = Number(input[index2]);
        points = points + ((judgeName.length * judgePoints) / 2);

        if (points > 1250.5) {
            console.log(`Congratulations, ${name} got a nominee for leading role with ${points.toFixed(1)}!`);
            return;
        }
        index1 += 2;
        index2 += 2;
    }
    console.log(`Sorry, ${name} you need ${(1250.5 - points).toFixed(1)} more!`);
}
oscars(['Zahari Baharov', '205', '4',
    'Johnny Depp', '45',
    'Will Smith', '29',
    'Jet Lee', '10',
    'Matthew Mcconaughey', '39']);

oscars(["Sandra Bullock", "340", "5",
    "Robert De Niro", "50",
    "Julia Roberts", "40.5",
    "Daniel Day-Lewis", "39.4",
    "Nicolas Cage", "29.9",
    "Stoyanka Mutafova", "33"]);