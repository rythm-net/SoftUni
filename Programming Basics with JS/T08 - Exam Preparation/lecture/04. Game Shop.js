function game(input) {
    let games = Number(input[0]);
    let hearthstone = 0;
    let fortnite = 0;
    let overwatch = 0;
    let others = 0;

    for (let i = 0; i < games; i++) {
        if (input[i] === 'Hearthstone') {
            hearthstone++;
        } else if (input[i] === 'Fortnite') {
            fortnite++;
        } else if (input[i] === 'Overwatch') {
            overwatch++;
        } else {
            others++;
        }
    }

    let calcHearthstone = hearthstone / games * 100;
    let calcFortnite = fortnite / games * 100;
    let calcOverwatch = overwatch / games * 100;
    let calcOthers = others / games * 100;

    console.log(`Hearthstone - ${calcHearthstone.toFixed(2)}%`);
    console.log(`Fortnite - ${calcFortnite.toFixed(2)}%`);
    console.log(`Overwatch - ${calcOverwatch.toFixed(2)}%`);
    console.log(`Others - ${calcOthers.toFixed(2)}%`);
}
game(["3", "Hearthstone", "Diablo 2", "Star Craft 2"]);