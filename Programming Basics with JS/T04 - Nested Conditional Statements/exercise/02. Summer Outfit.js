function summerOutfit(input) {
    let degrees = Number(input[0]);
    let timeOfTheDay = input[1];
    let outFit ;
    let shoes ;

    if (10 <= degrees && degrees <= 18) {
        if(timeOfTheDay === "Morning") {
            outFit = "Sweatshirt";
            shoes = "Sneakers";
        } else if (timeOfTheDay === "Afternoon" || timeOfTheDay === "Evening") {
            outFit = "Shirt";
            shoes = "Moccasins";
        }

    } else if (18 < degrees && degrees <= 24) {
        if (timeOfTheDay === "Morning" || timeOfTheDay === "Evening") {
            outFit = "Shirt";
            shoes = "Moccasins";
        } else if (timeOfTheDay === "Afternoon") {
            outFit = "T-Shirt";
            shoes = "Sandals";
        }

    } else if (degrees >= 25) {
        if (timeOfTheDay === "Morning") {
            outFit = "T-Shirt";
            shoes = "Sandals";
        } else if (timeOfTheDay === "Afternoon") {
            outFit = "Swim Suit";
            shoes = "Barefoot";
        } else if (timeOfTheDay === "Evening") {
            outFit = "Shirt";
            shoes = "Moccasins";
        }
    }
    console.log(`It's ${degrees} degrees, get your ${outFit} and ${shoes}.`)
}
summerOutfit(["22", "Afternoon"]);