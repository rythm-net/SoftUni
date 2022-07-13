function journey(input) {
    let budget = Number(input[0]);
    let season = input[1];
    let typeOfHousing ;
    let finalSum ;

    if (budget <= 100) {
        if(season == "summer") {
            typeOfHousing = "Camp";
            finalSum = budget * 0.30;
        } else if (season == "winter") {
            typeOfHousing = "Hotel";
            finalSum = budget * 0.70;
        }
        console.log("Somewhere in Bulgaria");
        console.log(`${typeOfHousing} - ${finalSum.toFixed(2)}`);

    } else if (budget <= 1000) {
        if (season == "summer") {
            typeOfHousing = "Camp";
            finalSum = budget * 0.40
        } else if (season == "winter") {
            typeOfHousing = "Hotel";
            finalSum = budget * 0.80;
        }
        console.log("Somewhere in Balkans");
        console.log(`${typeOfHousing} - ${finalSum.toFixed(2)}`);

    } else if (budget > 1000) {
        typeOfHousing = "Hotel";
        finalSum = budget * 0.90;
        console.log("Somewhere in Europe");
        console.log(`${typeOfHousing} - ${finalSum.toFixed(2)}`);
    }
}