function suitcases(input) {
    let trunkSpace = Number(input[0]);
    let index = 1;
    command = input[index];

    let counter = 0;
    let totalSuitcases = 0;

    while (command !== 'End') {
        counter++;
        let suitcase = Number(command); // 100

        if (counter === 3) {
            suitcase = suitcase + (suitcase * 10 / 100);
            counter = 0;
        }
        trunkSpace -= suitcase;

        if (trunkSpace < 0) {
            console.log(`No more space!`);
            break;
        }
        totalSuitcases++;

        index++;
        command = input[index];
    }

    if (trunkSpace >= 0) {
        console.log(`Congratulations! All suitcases are loaded!`);
    }
    console.log(`Statistic: ${totalSuitcases} suitcases loaded.`);
}
suitcases(["1200.2", "260", "380.5", "125.6", "305", "End"]);