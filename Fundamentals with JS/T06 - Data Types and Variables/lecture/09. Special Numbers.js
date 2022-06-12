function solve(num) {
  for (i = 1; i <= num; i++) {
    let tempNum = i;
    let sum = 0;

    while (tempNum > 0) {
      sum += tempNum % 10;
      tempNum = Math.trunc(tempNum / 10);
    }

    let isSpecial = "";

    if (sum == 5 || sum == 11 || sum == 7) {
      isSpecial = "True";
    } else {
      isSpecial = "False";
    }
    console.log(`${i} -> ${isSpecial}`);
  }
}

solve(15);
