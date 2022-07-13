function fruitShop(input) {
    let fruit = input[0];
    let day = input[1];
    let count = Number(input[2]);
    let isValid = day == "Monday" || day == "Tuesday" || day == "Wednesday" || day == "Thursday" || day == "Friday";
    let isValid1 = day == "Saturday" || day == "Sunday";

    if (isValid) {
        switch(fruit) {
            case "banana" : console.log((count * 2.50).toFixed(2)); break;
            case "apple" : console.log((count * 1.20).toFixed(2)); break;
            case "orange" : console.log((count * 0.85).toFixed(2)); break;
            case "grapefruit" : console.log((count * 1.45).toFixed(2)); break;
            case "kiwi" : console.log((count * 2.70).toFixed(2)); break;
            case "pineapple" : console.log((count * 5.50).toFixed(2)); break;
            case "grapes" : console.log((count * 3.85).toFixed(2)); break;
            default : console.log("error");
        }

    } else if (isValid1) {
        switch(fruit) {
            case "banana" : console.log((count * 2.70).toFixed(2)); break;
            case "apple" : console.log((count * 1.25).toFixed(2)); break;
            case "orange" : console.log((count * 0.90).toFixed(2)); break;
            case "grapefruit" : console.log((count * 1.60).toFixed(2)); break;
            case "kiwi" : console.log((count * 3).toFixed(2)); break;
            case "pineapple" : console.log((count * 5.60).toFixed(2)); break;
            case "grapes" : console.log((count * 4.20).toFixed(2)); break;
            default : console.log("error");
        }

    } else {
        console.log("error");
    }
}