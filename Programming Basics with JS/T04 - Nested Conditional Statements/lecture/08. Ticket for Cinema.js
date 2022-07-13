function priceOfTicket(input){
    let day = input[0];
    let priceOne = 12;
    let priceTwo = 14;
    let priceThree = 16;

    switch(day) {
        case "Monday" :
        case "Tuesday" :
        case "Friday" : console.log(priceOne);

    } switch(day) {
        case "Wednesday" :
        case "Thursday" : console.log(priceTwo);

    } switch(day) {
        case "Saturday" :
        case "Sunday" : console.log(priceThree)
    }
}
priceOfTicket(["Sunday"]);