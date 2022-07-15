function cinema(input) {
    let index = 0;
    let command = input[index];
    let studentCounter = 0;
    let standardCounter = 0;
    let kidCounter = 0;
    let totalTickets = 0;

    while (command !== 'Finish') {
        let name = command;
        index++;
        let freeSpaces = Number(input[index]);
        index++;
        let ticketType = input[index];
        let ticketCounter = 0;

        while (ticketType !== 'End') {
            ticketCounter++;

            switch(ticketType) {
                case 'student':
                    studentCounter++;
                    break;
                case 'standard':
                    standardCounter++;
                    break;
                case 'kid':
                    kidCounter++;
                    break;
            }

            if (ticketCounter >= freeSpaces) {
                break;
            }
            index++;
            ticketType = input[index];
        }

        totalTickets += ticketCounter;
        let resultSingleMovie = ticketCounter / freeSpaces * 100;
        console.log(`${name} - ${resultSingleMovie.toFixed(2)}% full.`);
        index++;
        command = input[index];
    }

    console.log(`Total tickets: ${totalTickets}`);
    console.log(`${(studentCounter / totalTickets * 100).toFixed(2)}% student tickets.`);
    console.log(`${(standardCounter / totalTickets * 100).toFixed(2)}% standard tickets.`);
    console.log(`${(kidCounter / totalTickets * 100).toFixed(2)}% kids tickets.`);
}
cinema(['Taxi', "10", "standard", "kid", "student", "student", "standard", "standard", "End",
        "Scary Movie", "6", "student", "student", "student", "student", "student", "student", "Finish"]);