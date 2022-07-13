function swimmingRec(input){
    let recordInSec = Number(input[0]);
    let distanceInMeters = Number(input[1]);
    let timeInSecForOneM = Number(input[2]);
    let delay = Math.floor(distanceInMeters / 15);
    let delayInSec = delay * 12.5;
    let timeIvan = (distanceInMeters * timeInSecForOneM + delayInSec).toFixed(2);

    if (timeIvan < recordInSec){
        console.log(`Yes, he succeeded! The new world record is ${timeIvan} seconds.`)
    } else {
        let diff = (timeIvan - recordInSec).toFixed(2);
        console.log(`No, he failed! He was ${diff} seconds slower.`)
    }
}