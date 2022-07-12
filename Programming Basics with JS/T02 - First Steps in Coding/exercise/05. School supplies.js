function supplyForSchool(input) {
    let pens = Number(input[0]);
    let markers = Number(input[1]);
    let detragent = Number(input[2]);
    let percentage = Number(input[3]);
    let sum = (pens * 5.80 + markers * 7.20 + detragent * 1.2);
    let discount = (sum * percentage / 100);
    let totalSum = (sum - discount);

    console.log(totalSum);
}
supplyForSchool(["2", "3", "4", "25"]);
supplyForSchool(["4", "2", "5", "13"])