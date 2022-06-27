function solveGarageArray(input) {
    let garages = [];

    for (const line of input) {
        let [garageNumber, carInfo] = line.split(' - ');
        let found = garages.find(g => g.garageNumber === garageNumber);

        if (!found) {
            garages.push({
                garageNumber: garageNumber,
                carInfo: []
            });
            found = garages.find(g => g.garageNumber === garageNumber);
        }
        found.carInfo.push(carInfo);
    }

    let output = '';

    garages.forEach(garage => {
        output += `Garage № ${garage.garageNumber}\n`;

        for (let currCar of garage.carInfo) {
            currCar = currCar.replace(/: /g, ' - ');
            output += `--- ${currCar}\n`;
        }
    });
    console.log(output);
}