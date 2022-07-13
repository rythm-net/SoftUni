function ageAndSex(input) {
    let age = Number(input[0]);
    let sex = input[1];

    if (sex === "f") {
        if (age < 16) {
            console.log("Miss");
        } else {
            console.log("Ms.")
        }

    } else if (sex === 'm'){
        if (age < 16) {
            console.log('Master');
        } else {
            console.log('Mr.');
        }
    }
}