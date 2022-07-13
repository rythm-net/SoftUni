function sumSec(input) {
    let firstTime = Number(input[0]);
    let secondTime = Number(input[1]);
    let thirdTime = Number(input[2]);
    let totalTimeInSec = firstTime + secondTime + thirdTime
    let minutes = Math.floor((totalTimeInSec / 60));
    let seconds = totalTimeInSec % 60;

    if (seconds < 10) {
        console.log(`${minutes}:0${seconds}`);
    } else {
        console.log(`${minutes}:${seconds}`);
    }
}
sumSec(["22", "7", "34"]);