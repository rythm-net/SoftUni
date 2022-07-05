function race(input) {
    let participants = input.shift().split(', ');
    let notWords = /[^a-zA-Z]/g;
    let notDigits = /[^0-9]/g;
    let storeList = {};

    while (input[0] != 'end of race') {
        let line = input.shift();
        let name = line.replace(notWords, '');
        let number = line.replace(notDigits, '').split('').map(Number).reduce((a, b) => a + b);

        if (participants.includes(name)) {
            if (storeList[name] == undefined) {
                storeList[name] = number;
            } else {
                storeList[name] += number;
            }
        }
    }
    let sorted = Object.entries(storeList).sort((a, b) => b[1] - a[1]);

    for (let i = 0; i < 3; i++){
        switch (i) {
            case 0: console.log(`${i + 1}st place: ${sorted[i][0]}`); break;
            case 1: console.log(`${i + 1}nd place: ${sorted[i][0]}`); break;
            case 2: console.log(`${i + 1}rd place: ${sorted[i][0]}`); break;
        }
    }
}
race([
    "George, Peter",
    "G4e@55or%6g6!68e!!@ ",
    "R1@!3a$y445689641@",
    "B5@i@#123ll",
    "G@e54o$r6ge#",
    "7P%et^#e5346r",
    "T$o553m&6",
    "end of race",]);
