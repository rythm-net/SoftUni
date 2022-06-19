function gladiatorInventory(arrayOfCommands) {
    let equipments = arrayOfCommands.shift().split(" ");

    for (let i = 0; i < arrayOfCommands.length; i++) {
        let [command, equipment] = arrayOfCommands[i].split(" ");

        switch (command) {
            case "Buy":
                if (!equipments.includes(equipment)) equipments.push(equipment);
                break;

            case "Trash":
                if (equipments.includes(equipment)) {
                    trash(equipments, equipment);
                }
                break;

            case "Repair":
                if (equipments.includes(equipment)) {
                    repair(equipments, equipment);
                }
                break;

            case "Upgrade":
                let upgraded = equipment.split("-");
                let element = upgraded[0];

                if (equipments.includes(element)) {
                    let index = equipments.indexOf(element);
                    let upgradedTo = upgraded.join(":");
                    equipments.splice(index + 1, 0, upgradedTo);
                }
                break;
        }
    }
    console.log(equipments.join(" "));

    function trash(array, equipment) {
        let index = array.indexOf(equipment);
        array.splice(index, 1);
    }

    function repair(array, equipment) {
        let index = array.indexOf(equipment);
        let element = array.splice(index, 1);
        array.push(element[0]);
    }
}
gladiatorInventory([
    "SWORD Shield Spear",
    "Trash Bow",
    "Repair Shield",
    "Upgrade Helmet-V",]);