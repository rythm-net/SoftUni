function sumDigits(number) {
  let sum = 0;
  let string = "" + number;

  for (let i = 0; i < string.length; i++) {
    sum += Number(string[i]);
  }
  console.log(sum);
}
sumDigits(245678);
