function solve(availableStock, deliveredStock) {
    let storedProducts = {};
    let store;

    for (let index = 0; index < availableStock.length; index += 2) {
        let currentProduct = availableStock[index];
        storedProducts[currentProduct] = Number(availableStock[index + 1]);
    }

    for (let index = 0; index < deliveredStock.length; index += 2) {
        let currentProduct = deliveredStock[index];

        if (!storedProducts.hasOwnProperty(currentProduct)) {
            storedProducts[currentProduct] = 0;
        }
        storedProducts[currentProduct] += Number(deliveredStock[index + 1]);
    }

    for (let product in storedProducts) {
        console.log(`${product} -> ${storedProducts[product]}`)
    }
}
solve(["Chips", "5", "CocaCola", "9", "Bananas", "14", "Pasta", "4", "Beer", "2"],
    ["Flour", "44", "Oil", "12", "Pasta", "7", "Tomatoes", "70", "Bananas", "30"]);