function football(input) {
    let firstMatchResult = input[0];
    let secondMatchResult = input[1];
    let thirdMatchResult = input[2];
    let won = 0;
    let lost = 0;
    let drawn = 0;
    let firstMatchHostScore = Number(firstMatchResult.charAt(0));
    let firstMatchGuestScore = Number(firstMatchResult.charAt(2));
    let secondMatchHostScore = Number(secondMatchResult.charAt(0));
    let secondMatchGuestScore = Number(secondMatchResult.charAt(2));
    let thirdMatchHostScore = Number(thirdMatchResult.charAt(0));
    let thirdMatchGuestScore = Number(thirdMatchResult.charAt(2));

    if (firstMatchHostScore > firstMatchGuestScore) {
        won++;
    } else if (firstMatchHostScore < firstMatchGuestScore) {
        lost++;
    } else {
        drawn++;
    }

    if (secondMatchHostScore > secondMatchGuestScore) {
        won++;
    } else if (secondMatchHostScore < secondMatchGuestScore) {
        lost++;
    } else {
        drawn++;
    }

    if (thirdMatchHostScore > thirdMatchGuestScore) {
        won++;
    } else if (thirdMatchHostScore < thirdMatchGuestScore) {
        lost++;
    } else {
        drawn++;
    }

    console.log(`Team won ${won} games.`);
    console.log(`Team lost ${lost} games.`);
    console.log(`Drawn games: ${drawn}`);
}