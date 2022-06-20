function solve(input) {
    let houses = input.shift().split("@");
    let cupid = 0;

    for (let i = 0; i < input.length; i++) {
        let commands = input[i];
        let tokens = commands.split(" ");
        let jumps = tokens[0];
        let steps = Number(tokens[1]);

        if (jumps == "Love!") {
            let count = 0;
            let failed = 0;
            console.log(`Cupid's last position was ${cupid}.`);
            
            for (let j = 0; j < houses.length; j++) {
                if (houses[j] == 0) {
                    count++;
                } else {
                    failed++;
                }
            }
            if (count < houses.length) {
                console.log(`Cupid has failed ${failed} places.`);
            } else {
                console.log(`Mission was successful.`);
            }
            break;
        }
        cupid += steps;

        if (cupid >= houses.length) {
            cupid = 0;
        }

        if (houses[cupid] == 0) {
            console.log(`Place ${cupid} already had Valentine's day.`);
        } else {
            houses[cupid] -= 2;

            if (houses[cupid] == 0) {
                console.log(`Place ${cupid} has Valentine's day.`);
            }
        }
    }
}
solve(["10@10@10@2",
    "Jump 1",
    "Jump 2",
    "Love!"]);