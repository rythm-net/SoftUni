function solve(input) {
    let houses = input.shift().split("@").map(Number);
    let cupid = 0;

    while (input[0] !== "Love!") {
        let command = input.shift().split(" ");
        let steps = Number(command[1]);
        cupid += steps;

        if (cupid >= houses.length) {
            cupid = 0;
        }

        if(houses[cupid] == 0) {
            console.log(`Place ${cupid} already had Valentine's day.`)
        } else {
            houses[cupid] -= 2;
            if (houses[cupid] == 0) {
                console.log(`Place ${cupid} has Valentine's day.`)
            }
        }
    }
    console.log(`Cupid's last position was ${cupid}.`)
    let missed = 0

    for (let house of houses) {
        if (house > 0) {
            missed++
        }
    }

    if (missed > 0) {
        console.log(`Cupid has failed ${missed} places.`)
    } else {
        console.log(`Mission was successful.`)
    }
}
solve(["10@10@10@2", "Jump 1", "Jump 2", "Love!"]);
solve(["2@4@2", "Jump 2", "Jump 2", "Jump 8", "Jump 3", "Jump 1", "Love!"])