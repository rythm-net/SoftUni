function brake(input){
    let nameOfMovie = (input[0]);
    let episodeDuration = Number(input[1]);
    let brakeDuration = Number(input[2]);
    let timeForRest = brakeDuration / 4;
    let timeForLunch = brakeDuration / 8;
    let totalReservedTime = timeForLunch + timeForRest;
    let freeTimeOfBrake = brakeDuration - totalReservedTime;

    if (episodeDuration <= freeTimeOfBrake) {
        let diff = Math.abs((episodeDuration + totalReservedTime) - brakeDuration);
        console.log(`You have enough time to watch ${nameOfMovie} and left with ${Math.ceil(diff)} minutes free time.`);
    } else {
        let diff = Math.abs(brakeDuration - (episodeDuration + totalReservedTime));
        console.log(`You don't have enough time to watch ${nameOfMovie}, you need ${Math.ceil(diff)} more minutes.`)
    }
}
brake(["Game of Thrones", "65", "96"])