function price(input){
    let product = input[0];
    let city = input[1];
    let quantity = Number(input[2]);
    let finalSum = 0;

    if(city === 'Sofia'){
        switch(product) {
            case 'coffee' : finalSum = 0.50 * quantity; break;
            case 'water' : finalSum = 0.80 * quantity; break;
            case 'beer' : finalSum = 1.20 * quantity; break;
            case 'sweets' : finalSum = 1.45 * quantity; break;
            case 'peanuts' : finalSum = 1.60 * quantity; break;
        }

    } else if(city === 'Plovdiv'){
        switch(product) {
            case 'coffee' : finalSum = 0.40 * quantity; break;
            case 'water' : finalSum = 0.70 * quantity; break;
            case 'beer' : finalSum = 1.15 * quantity; break;
            case 'sweets' : finalSum = 1.30 * quantity; break;
            case 'peanuts' : finalSum = 1.50 * quantity; break;
        }

    } else if(city === 'Varna'){
        switch(product) {
            case 'coffee' : finalSum = 0.45 * quantity; break;
            case 'water' : finalSum = 0.70 * quantity; break;
            case 'beer' : finalSum = 1.10 * quantity; break;
            case 'sweets' : finalSum = 1.35 * quantity; break;
            case 'peanuts' : finalSum = 1.55 * quantity; break;
        }
    }
    console.log(finalSum);
}