function foodDelivery(input) {
    let cChicken = Number(input[0]);
    let cFish = Number(input[1]);
    let cVeggie = Number(input[2]);
    let priceChicken = (10.35 * cChicken);
    let priceFish = (12.40 * cFish);
    let priceVeggie = (8.15 * cVeggie);
    let totalPriceOfMenu = (priceChicken + priceFish + priceVeggie);
    let priceDessert = (20 / 100) * totalPriceOfMenu;
    let totalPriceOfOrder = totalPriceOfMenu + priceDessert + 2.50;

    console.log(totalPriceOfOrder);
}
// foodDelivery(["2", "4", "3"]);
foodDelivery(["9", "2", "6"]);