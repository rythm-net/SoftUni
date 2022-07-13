function cinema(input) {
    let typeProject = input[0];
    let r = Number(input[1]);
    let c = Number(input[2]);
    let totalSeats = r * c;
    let income = 0;

    if (typeProject === "Premiere") {
        income = totalSeats * 12.00
    } else if (typeProject === "Normal") {
        income = totalSeats * 7.50
    } else if (typeProject === "Discount") {
        income = totalSeats * 5.00
    }
    console.log(`${income.toFixed(2)} leva`)
}