function calculator(n1, operator, n2) {
  let numberOne = "" + n1;
  let numberTwo = "" + n2;
  let sum = numberOne + operator + numberTwo;
  let result = eval(sum);

  result = Number(result);
  console.log(result.toFixed(2));
}

calculator(5, "+", 10);
