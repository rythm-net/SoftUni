function day(input) {
    let workOrWeekend = (input[0]);

    switch(workOrWeekend){
        case "Monday":
        case "Tuesday":
        case "Wednesday":
        case "Thursday":
        case "Friday" : console.log("Working day"); break;
        case "Saturday" : console.log("Weekend"); break;
        case "Sunday" : console.log("Weekend"); break;
        default : console.log(''); break;
    }
}
day(["Tuesday"]);