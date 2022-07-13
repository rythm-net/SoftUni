function ski(input){
    let days = Number(input[0]);
    let typeOfHousing = (input[1]);
    let feedback = input[2];
    let nights = Number(days - 1);
    let price = 0;

    if (days < 10) {
        switch(typeOfHousing) {
            case "room for one person" :
                price = 18.00 * nights;
                break;
            case "apartment" :
                price = 25 * 0.70 * nights;
                break;
            case "president apartment" :
                price = 35 * 0.90 * nights;
                break;

        } if (feedback === "positive") {
            price = price * 1.25;
        } else if (feedback === "negative") {
            price = price * 0.90;
        }

    } else if (days >= 10 && days <= 15) {
        switch(typeOfHousing){
            case "room for one person" :
                price = 18.00 * nights;
                break;
            case "apartment" :
                price = 25 * 0.65 * nights;
                break;
            case "president apartment" :
                price = 35 * 0.85 * nights;
                break;

        } if (feedback === "positive") {
            price = price * 1.25;
        } else if (feedback === "negative") {
            price = price * 0.90;
        }

    } else {
        switch(typeOfHousing) {
            case "room for one person" :
                price = 18.00 * nights;
                break;
            case "apartment" :
                price = 25 * 0.50 * nights;
                break;
            case "president apartment" :
                price = 35 * 0.80 * nights;
                break;

        } if (feedback === "positive") {
            price = price * 1.25
        } else if (feedback === "negative") {
            price = price * 0.90;
        }
    }
    console.log(price.toFixed(2));
}
ski(["14", "apartment", "positive"]);