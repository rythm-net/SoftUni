function solve(input) {
    let totalPrice = 0;
    let currPrice = 0;

    for (let line of input) {
        let pattern = /%([A-Z][a-z]*)%.*?<(\w+)>.*?\|(\d+)\|.*?(-?\d+(?:\.\d+)?)\$/gm;
        let match = pattern.exec(line);

        if (match != null) {
            currPrice = Number(match[3])*Number(match[4])
            console.log(`${match[1]}: ${match[2]} - ${currPrice.toFixed(2)}`)
            totalPrice+=currPrice
        }
    }
    console.log(`Total income: ${totalPrice.toFixed(2)}`)
}
solve([
    "%George%<Croissant>|2|10.3$",
    "%Peter%<Gum>|1|1.3$",
    "%Maria%<Cola>|1|2.4$",
    "end of shift",]);
solve(['%InvalidName%<Croissant>|2|10.3$',
    '%Peter%<Gum>1.3$',
    '%Maria%<Cola>|1|2.4',
    '%Valid%<Valid>valid|10|valid20$',
    'end of shift'])