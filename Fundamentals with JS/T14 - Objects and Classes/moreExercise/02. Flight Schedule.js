function flightSchedule(arrays) {

    let allFlights = arrays[0]
    let changedStatuses = arrays[1]
    let flightStatus = arrays[2];
    let flightList = {};

    for (let flight of allFlights) {
        let [flightNum, destination, rest] = flight.split(" ")
        let fullDestination = '';

        if (rest !== undefined){
            fullDestination = destination + " " + rest
            flightList[flightNum] = {
                Destination: fullDestination, Status: 'Ready to fly'
            }
        } else {
            flightList[flightNum] = {
                Destination: destination, Status: 'Ready to fly'
            }
        }
    }

    for (let changed of changedStatuses) {
        let [flightNum, status] = changed.split(" ")

        if (flightList.hasOwnProperty(flightNum)) {
            flightList[flightNum].Status = status
        }

    }

    for (let fly in flightList) {

        if (flightList[fly].Status === String(flightStatus)) {
            console.log(flightList[fly]);
        }
    }
}