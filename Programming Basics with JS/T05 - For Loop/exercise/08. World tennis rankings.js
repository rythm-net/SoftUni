function tennis(input) {
    let tournaments = Number(input[0]);
    let startingPoints = Number(input[1]);
    let stage = '';
    let points = 0;
    let winningPoints = 0;
    let matchesWon = 0;
    let totalPoints = startingPoints;

    for (let i = 2; i <= tournaments + 1; i++) {
        stage = input[i];

        switch(stage) {
            case 'W':
                points = 2000;
                totalPoints += points;
                winningPoints += points;
                matchesWon++;
                break;

            case 'F':
                points = 1200;
                totalPoints += points;
                winningPoints += points;
                break;

            case 'SF':
                points = 720;
                totalPoints += points;
                winningPoints += points;
                break;

            default:
                console.log('Error.');
        }
    }
    let averagePoints = Math.floor(winningPoints / tournaments);
    let percentage = ((matchesWon / tournaments) * 100).toFixed(2);

    console.log(`Final points: ${totalPoints}`);
    console.log(`Average points: ${averagePoints}`);
    console.log(`${percentage}%`);
}
tennis(['5', '1400', 'F', 'SF', 'W', 'W', 'SF']);
tennis(['4', '750', 'SF', 'W', 'SF', 'W']);
tennis(['7', '1200', 'SF', 'F', 'W', 'F', 'W', 'SF', 'W']);