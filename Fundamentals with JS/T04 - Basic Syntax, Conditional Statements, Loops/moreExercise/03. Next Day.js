function n(y, m, d) {
    let newDat = new Date(y, m - 1, d + 1);
    let newY = newDat.getFullYear(y);
    let newM = newDat.getMonth(m) + 1;
    let newD = newDat.getDate(d);
    console.log(newD, newM, newY);
}
n(2021, 1, 14);

function nextDay(year, month, day) {
    let nextDay = new Date(year, month - 1, day + 1);
    let newYear = nextDay.getFullYear();
    let newMonth = nextDay.getMonth() + 1;
    let newDate = nextDay.getDate();
    console.log(`${newYear}-${newMonth}-${newDate}`);
}
nextDay(2020, 3, 24);