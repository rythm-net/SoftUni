function areaOfFigures(input) {
    let figure = (input[0]);

    if (figure === "square") {
        let side = Number(input[1]);
        console.log((side * side).toFixed(3));

    } else if (figure === "rectangle") {
        let sideA = Number(input[1]);
        let sideB = Number(input[2]);
        console.log((sideA * sideB).toFixed(3));

    } else if (figure === "circle") {
        let radius = Number(input[1]);
        console.log((Math.PI * Math.pow(radius, 2)).toFixed(3));

    } else if (figure === "triangle") {
        let side = Number(input[1]);
        let heigh = Number(input[2]);
        console.log(((side * heigh) / 2).toFixed(3));
    }
}
areaOfFigures(["square", "5"]);