function vacation(input) {
    let moneyNeeded = Number(input[0]);
    let currentMoney = Number(input[1]);
    let text = '';
    let money = 0;
    let dayCount = 0;
    let spendDays = 0;
    let i = 2;
    let j = 3;

    while (currentMoney < moneyNeeded) {

        if (spendDays === 5) {
            console.log(`You can't save the money.`);
            console.log(`${dayCount}`);
            return;
        }
        text = input[i];
        money = Number(input[j]);

        if (text === 'spend') {
            currentMoney -= money;
            if (currentMoney < 0) {
                currentMoney = 0;
            }
            spendDays++;

        } else if (text === 'save') {
            currentMoney += money;
            spendDays = 0;
        }
        dayCount++;
        i += 2;
        j += 2;
    }
    console.log(`You saved the money for ${dayCount} days.`);
}
vacation(["2000", "1000", "spend", "1200", "save", "2000"]);
vacation(["110", "60", "spend", "10", "spend", "10", "spend", "10", "spend", "10", "spend", "10"]);
vacation(["250", "150", "spend", "50", "spend", "50", "save", "100", "save", "100"]);