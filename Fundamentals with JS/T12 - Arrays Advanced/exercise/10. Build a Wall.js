function buildingWall(array) {
    let myArray = array.slice(0).map(Number);
    let result = [];
    let priceOfCubicYards = 1900;
    let AllCubicYards = 0;

    while (Math.min(...myArray) != 30) {
        let count = 0;
        let cubicYards = 195;

        for (let i = 0; i < myArray.length; i++) {
            if (myArray[i] < 30) {
                myArray[i] += 1;
                count++;
            } else {
                continue;
            }
        }
        cubicYards *= count;
        result.push(cubicYards);
        AllCubicYards += cubicYards;
    }
    let sumOfPesos = AllCubicYards * priceOfCubicYards;

    console.log(result.join(", "));
    console.log(`${sumOfPesos} pesos`);
}
buildingWall([17, 22, 17, 19, 17]);