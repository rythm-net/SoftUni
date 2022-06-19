function houseParty(array) {
    let partyList = [];

    for (let i = 0; i < array.length; i++) {
        let command = array[i].split(" ");
        let name = command[0];
        command.shift();

        if (isHeOrSheGoing(command)) {
            if (isHeOrSheInTheList(partyList, name)) {
                console.log(`${name} is already in the list!`);
            } else {
                partyList.push(name);
            }
        } else {
            if (isHeOrSheInTheList(partyList, name)) {
                remove(partyList, name);
            } else {
                console.log(`${name} is not in the list!`);
            }
        }
    }

    if (partyList.length > 0) {
        for (let j = 0; j < partyList.length; j++) {
            console.log(partyList[j]);
        }
    }

    function remove(list, name) {
        let count = 0;
        for (let index of list) {
            if (name === index) {
                list.splice(count, 1);
            } else {
                count++;
            }
        }
    }

    function isHeOrSheInTheList(list, name) {
        for (let index of list) {
            if (index === name) {
                return true;
            }
        }
    }

    function isHeOrSheGoing(cmnd) {
        let string = "";
        for (let index of cmnd) {
            string += index;
        }
        return string == "isgoing!" ? true : false;
    }
}

houseParty([
    "Allie is going!",
    "George is going!",
    "John is not going!",
    "George is not going!",]);

houseParty([
    "Tom is going!",
    "Annie is going!",
    "Tom is going!",
    "Garry is going!",
    "Jerry is going!",]);