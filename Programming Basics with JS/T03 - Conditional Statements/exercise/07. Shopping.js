function shopping(input) {
    let budget = Number(input[0]);
    let VGACount = Number(input[1]);
    let CPUCount = Number(input[2]);
    let RAMCount = Number(input[3]);
    let VGAPrice = 250 * VGACount;
    let CPUPrice = (VGAPrice * 0.35) * CPUCount;
    let RAMPrice = (VGAPrice * 0.10) * RAMCount;
    let totalPrice = VGAPrice + CPUPrice + RAMPrice;

    if (VGACount > CPUCount) {
        totalPrice = totalPrice * 0.85;
    }

    let diff = Math.abs(budget - totalPrice);

    if (budget >= totalPrice) {
        console.log(`You have ${diff.toFixed(2)} leva left!`);
    } else {
        console.log(`Not enough money! You need ${diff.toFixed(2)} leva more!`);
    }
}