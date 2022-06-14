function solve(a, b, c) {
    let numberOfPages = a;
    let pagesReadInOneHour = b;
    let days = c;
    let neededHours = numberOfPages / pagesReadInOneHour;
    let neededHoursADay = neededHours / days;

    console.log(neededHoursADay);
}
solve(432, 15, 4);
