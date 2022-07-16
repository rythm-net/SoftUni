function mobile(input) {
    let contractPeriod = input[0];
    let contractType = input[1];
    let internet = input[2];
    let months = Number(input[3]);
    let tax = 0;
    let total = 0;

    switch(contractPeriod) {

        case 'one':
            switch(contractType) {
                case 'Small' : tax = 9.98; break;
                case 'Middle' : tax = 18.99; break;
                case 'Large' : tax = 25.98; break;
                case 'ExtraLarge' : tax = 35.99; break;
            }
            break;

        case 'two':
            switch(contractType) {
                case 'Small' : tax = 8.58; break;
                case 'Middle' : tax = 17.09; break;
                case 'Large' : tax = 23.59; break;
                case 'ExtraLarge' : tax = 31.79; break;
            }
            break;
    }

    if (internet === 'yes') {
        if (tax <= 10.00) {
            tax += 5.50;
        } else if (tax <= 30.00) {
            tax += 4.35;
        } else {
            tax += 3.85;
        }
    }

    if (contractPeriod === 'two') {
        tax = tax - (tax * 3.75 / 100);
    }
    total = tax * months;

    console.log(`${total.toFixed(2)} lv.`);
}
mobile(["two", "Large", "no", "10"])
