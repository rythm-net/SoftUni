function lilly(input) {
    let age = Number(input[0]);
    let laundryPrice = Number(input[1]);
    let toyPrice = Number(input[2]);
    let toys = 0;
    let money = 0;
    let total = 0;

    for (let i = 1; i <= age; i++) {
        if (i % 2 === 0) {
            money += 10;
            total += money - 1;
        } else {
            toys++;
        }
    }

    let toysSold = toys * toyPrice;
    let savedMoney = total + toysSold;

    if (savedMoney >= laundryPrice) {
        console.log(`Yes! ${(savedMoney - laundryPrice).toFixed(2)}`);
    } else {
        console.log(`No! ${(laundryPrice - savedMoney).toFixed(2)}`);
    }
}
lilly(['10', '170.00', '6']);
lilly(['21', '1570.98', '3']);