function solve(input) {
    let targetCities = {}

    while (input[0] !== 'Sail') {
        let [town, people, gold] = input.shift().split('||')
        people = Number(people)
        gold = Number(gold)

        if (!targetCities.hasOwnProperty(town)) {
            targetCities[town] = { people: 0, gold: 0 }
        }

        targetCities[town].people += people
        targetCities[town].gold += gold
    }

    while (input[0] !== 'End') {
        let [command, par1, par2, par3] = input.shift().split('=>')

        if (command == 'Plunder') {
            targetCities[par1].people -= par2
            targetCities[par1].gold -= par3
            console.log(`${par1} plundered! ${par3} gold stolen, ${par2} citizens killed.`);

            if (targetCities[par1].people == 0 || targetCities[par1].gold == 0) {
                delete targetCities[par1]
                console.log(`${par1} has been wiped off the map!`);
            }

        } else if (command == 'Prosper') {
            if (Number(par2) < 0) {
                console.log(`Gold added cannot be a negative number!`);
            } else {
                targetCities[par1].gold += Number(par2)
                console.log(`${par2} gold added to the city treasury. ${par1} now has ${targetCities[par1].gold} gold.`);
            }
        }
    }
    let existed = Object.entries(targetCities)

    if (existed.length==0) {
        console.log(`Ahoy, Captain! All targets have been plundered and destroyed!`);
    } else {
        console.log(`Ahoy, Captain! There are ${existed.length} wealthy settlements to go to:`);

        for(let town in targetCities)
            console.log(`${town} -> Population: ${targetCities[town].people} citizens, Gold: ${targetCities[town].gold} kg`)
    }
}
solve(["Nassau||95000||1000",
    "San Juan||930000||1250",
    "Campeche||270000||690",
    "Port Royal||320000||1000",
    "Port Royal||100000||2000",
    "Sail",
    "Prosper=>Port Royal=>-200",
    "Plunder=>Nassau=>94000=>750",
    "Plunder=>Nassau=>1000=>150",
    "Plunder=>Campeche=>150000=>690",
    "End"])