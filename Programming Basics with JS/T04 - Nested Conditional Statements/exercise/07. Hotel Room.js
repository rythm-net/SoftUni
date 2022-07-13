function hotelRoom(input) {
    let month = input[0];
    let stay = Number(input[1]);
    let priceForStudio = 0;
    let priceForApart = 0;

    if (stay > 7 && stay <= 14){

        switch(month){
            case "May" :
            case "October" :
                priceForStudio = 50 * 0.95 * stay;
                priceForApart = 65 * stay;
                break;
            case "June" :
            case "September" :
                priceForStudio = 75.20 * stay;
                priceForApart = 68.70 * stay;
                break;
            case "July" :
            case "August" :
                priceForStudio = 76 * stay;
                priceForApart = 77 * stay;
                break;
        }

    } else if (stay > 14) {

        switch(month) {
            case "May" :
            case "October" :
                priceForStudio = 50 * 0.70 * stay;
                priceForApart = 65 * 0.90 * stay;
                break;
            case "June" :
            case "September" :
                priceForStudio = 75.20 * 0.80 * stay;
                priceForApart = 68.70 * 0.90 * stay;
                break;
            case "July" :
            case "August" :
                priceForStudio = 76 * stay;
                priceForApart = 77 * 0.90 * stay;
                break;
        }

    } else {

        switch(month) {
            case "May" :
            case "October" :
                priceForStudio = 50 * stay;
                priceForApart = 65 * stay;
                break;
            case "June" :
            case "September" :
                priceForStudio = 75.20 * stay;
                priceForApart = 68.70 * stay;
                break;
            case "July" :
            case "August" :
                priceForStudio = 76 * stay;
                priceForApart = 77 * stay;
                break;
        }
    }
    console.log(`Apartment: ${priceForApart.toFixed(2)} lv.`);
    console.log(`Studio: ${priceForStudio.toFixed(2)} lv.`);
}
hotelRoom(["June", "14"]);