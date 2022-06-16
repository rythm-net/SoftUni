function orders(item, quantity) {
    let coffeePrice = 1.50
    let waterPrice = 1.00;
    let cokePrice = 1.40;
    let snacksPrice = 2.00;

    switch (item) {
        case "coffee":
            return (coffeePrice * quantity).toFixed(2);
        case "water":
            return (waterPrice * quantity).toFixed(2);
        case "coke":
            return (cokePrice * quantity).toFixed(2);
        case "snacks":
            return (snacksPrice * quantity).toFixed(2);
    }
}
console.log(orders("water", 5))
console.log(orders("coffee", 2))