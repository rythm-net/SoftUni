function gladiator(
  lostFights,
  helmetPrice,
  swordPrice,
  shieldPrice,
  armorPrice
) {
  let fights = lostFights;
  let count = 1;
  let countHelmet = 0;
  let countSword = 0;
  let bothSwordAndHelmet1 = 0;
  let bothSwordAndHelmet2 = 0;
  let sum = 0;
  let shieldBreaks = 0;

  while (fights > 0) {
    countHelmet++;
    countSword++;

    if (countHelmet === 2) {
      bothSwordAndHelmet1++;
      countHelmet = 0;
      sum += helmetPrice;
    }

    if (countSword === 3) {
      bothSwordAndHelmet2++;
      countSword = 0;
      sum += swordPrice;
    }

    if (bothSwordAndHelmet1 === 3 && bothSwordAndHelmet2 === 2) {
      bothSwordAndHelmet2 = 0;
      bothSwordAndHelmet1 = 0;
      shieldBreaks++;
      sum += shieldPrice;
    }

    if (shieldBreaks === 2) {
      shieldBreaks = 0;
      sum += armorPrice;
    }
    fights--;
  }
  console.log(`Gladiator expenses: ${sum.toFixed(2)} aureus`);
}
gladiator(23, 12.5, 21.5, 40, 200);
