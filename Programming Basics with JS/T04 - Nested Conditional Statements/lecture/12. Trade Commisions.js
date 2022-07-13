function price(input) {
    let city = input[0];
    let sales = Number(input[1]);
    let isValid = 0 <= sales && sales <= 500;
    let isValid1 = 500 < sales && sales <= 1000;
    let isValid2 = 1000 < sales && sales <= 10000;
    let isValid3 = sales > 10000;
    let finalSum = 0;

    if (isValid) {
        switch(city) {
            case "Sofia" : console.log((finalSum = 0.05 * sales).toFixed(2)); break;
            case "Varna" : console.log((finalSum = 0.045 * sales).toFixed(2)); break;
            case "Plovdiv" : console.log((finalSum = 0.055 * sales).toFixed(2)); break;
            default : console.log("error");
        }

    } else if (isValid1) {
        switch(city) {
            case "Sofia" : console.log((finalSum = 0.07 * sales).toFixed(2)); break;
            case "Varna" : console.log((finalSum = 0.075 * sales).toFixed(2)); break;
            case "Plovdiv" : console.log((finalSum = 0.08 * sales).toFixed(2)); break;
            default : console.log("error");
        }

    } else if (isValid2) {
        switch(city) {
            case "Sofia" : console.log((finalSum = 0.08 * sales).toFixed(2)); break;
            case "Varna" : console.log((finalSum = 0.10 * sales).toFixed(2)); break;
            case "Plovdiv" : console.log((finalSum = 0.12 * sales).toFixed(2)); break;
            default : console.log("error");
        }

    } else if (isValid3) {
        switch(city) {
            case "Sofia" : console.log((finalSum = 0.12 * sales).toFixed(2)); break;
            case "Varna" : console.log((finalSum = 0.13 * sales).toFixed(2)); break;
            case "Plovdiv" : console.log((finalSum = 0.145 * sales).toFixed(2)); break;
            default : console.log("error");
        }

    } else {
        console.log("error");
    }
}
price(['Ivan', '1500']);