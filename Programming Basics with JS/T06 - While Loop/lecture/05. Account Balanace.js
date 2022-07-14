function account(input) {
    let total = 0;
    let i = 0;
    let deposit;

    while(input[i] !== 'NoMoreMoney') {
        deposit = Number(input[i]);
        if (deposit < 0) {
            console.log('Invalid operation!');
            break;
        }
        console.log(`Increase: ${deposit.toFixed(2)}`);
        total += deposit;
        i++;
    }
    console.log(`Total: ${total.toFixed(2)}`);
}
account(["5.51", "69.42", "100", "NoMoreMoney"]);
account(["120", "45.55", "-150"]);