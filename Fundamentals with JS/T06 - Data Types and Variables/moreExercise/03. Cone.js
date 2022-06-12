function cone(radius, height) {
  let formulaVol = ((1 / 3) * Math.PI * Math.pow(radius, 2) * height).toFixed(
    4
  );
  let formulaArea = (
    Math.PI *
    radius *
    (radius + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)))
  ).toFixed(4);

  console.log(`volume = ${formulaVol}`);
  console.log(`area = ${formulaArea}`);
}
cone(3, 5);
