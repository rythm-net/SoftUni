function repainting(input) {
    let nylon = Number(input[0]);
    let paint = Number(input[1]);
    let thinner = Number(input[2]);
    let hours = Number(input[3]);
    let priceNylon = (nylon + 2) * 1.5;
    let pricePaint = (paint * 1.10) * 14.5;
    let priceThinner = thinner * 5;
    let totalStuffPrice = priceNylon + pricePaint + priceThinner + 0.40;
    let workPricePerHour = totalStuffPrice * 0.30;
    let totalWorkPrice = workPricePerHour * hours;
    let totalPrice = totalStuffPrice + totalWorkPrice;

    console.log(totalPrice);
}
// repainting(["10", "11", "4", "8"]);
repainting(["5", "10", "10", "1"]);