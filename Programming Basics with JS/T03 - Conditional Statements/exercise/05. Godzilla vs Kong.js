function movie(input) {
    let budget = Number(input[0]);
    let stat = Number(input[1]);
    let priceForDressOfOneStat = Number(input[2]);
    let priceOfDecor = budget * 0.10;
    let totalPriceForStat = stat * priceForDressOfOneStat;
    let totalPriceOfTheMovie = totalPriceForStat + priceOfDecor;

    if (stat > 150) {
        totalPriceForStat = totalPriceForStat * 0.9;
    }

    totalPriceOfTheMovie = totalPriceForStat + priceOfDecor;
    let difference = Math.abs(totalPriceOfTheMovie - budget);

    if (totalPriceOfTheMovie <= budget) {
        console.log("Action!");
        console.log(`Wingard starts filming with ${difference.toFixed(2)} leva left.`);
    } else {
        console.log("Not enough money!");
        console.log(`Wingard needs ${difference.toFixed(2)} leva more.`);
    }
}
movie(["5", "5", "5"]);