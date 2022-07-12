function fishTank(input){
    let lenght = (input[0]);
    let wide = (input[1]);
    let heigh = (input[2]);
    let percent = (input[3]);
    let totalInCM2 = lenght * wide * heigh;
    let totalInLiters = totalInCM2 / 1000;
    let space = percent / 100;
    let totalWaterNeed = totalInLiters * (1 - space);

    console.log(totalWaterNeed);
}
// fishTank(["85 ", "75 ", "47 ", "17 "])
fishTank(["105 ", "77 ", "89 ", "18.5 "])