function workingHours(input) {
    let hour = Number(input[0]);
    let day = input[1];
    let isValid = hour >= 10 && hour <= 18;

    if (isValid) {
        switch(day) {
            case "Monday" :
            case "Tuesday" :
            case "Wednesday" :
            case "Thursday" :
            case "Friday" :
            case "Saturday" : console.log("open"); break;
            default : console.log("closed")
        }
    } else {
        console.log("closed");
    }
}