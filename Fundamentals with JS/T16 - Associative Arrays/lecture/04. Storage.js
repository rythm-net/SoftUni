function solve(input) {
    let result = new Map();

    for (let line of input) {
        let [product, quantity] = line.split(" ");
        quantity = Number(quantity);

        let existing = 0;

        if (result.has(product)) {
            existing = result.get(product);
        }
        result.set(product, existing + quantity);
    }

    for (let [product, quantity] of result) {
        console.log(product, "->", quantity);
    }
}
solve(["tomatoes 10", "coffee 5", "olives 100", "coffee 40"]);