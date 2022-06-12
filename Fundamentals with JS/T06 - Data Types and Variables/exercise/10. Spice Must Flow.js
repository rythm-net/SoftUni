function spice(extractSpices) {
  let minedSpices = Number(extractSpices);
  let workersConsuming = 26;
  let yieldEveryDayDropped = 10;
  let result = 0;
  let countDays = 0;
  let leavingSpiece = 0;

  while (minedSpices >= 100) {
    countDays++;
    leavingSpiece = minedSpices - workersConsuming;
    result += leavingSpiece;
    minedSpices -= yieldEveryDayDropped;
    if (minedSpices < 100) {
      result -= workersConsuming;
      break;
    }
  }
  console.log(countDays);
  console.log(result);
}
spice(450);
