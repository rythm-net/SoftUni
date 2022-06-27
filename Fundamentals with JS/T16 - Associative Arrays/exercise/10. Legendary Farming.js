function LegendaryFarming(input) {
    let specialItems = {
        motes: 0,
        shards: 0,
        fragments: 0,
    };

    let junkItems = {};
    input = input.split(" ");

    for (let i = 0; i < input.length; i += 2) {
        let value = Number(input[i]);
        let name = input[i + 1];

        if (name.toLocaleLowerCase() === "motes" ||
            name.toLocaleLowerCase() === "fragments" ||
            name.toLocaleLowerCase() === "shards") {
            specialItems[name.toLocaleLowerCase()] += value;
        } else {
            if (junkItems.hasOwnProperty(name.toLocaleLowerCase()) === false) {
                junkItems[name.toLocaleLowerCase()] = 0;
            }
            junkItems[name.toLocaleLowerCase()] += value;
        }

        if (specialItems.motes >= 250) {
            console.log("Dragonwrath obtained!");
            specialItems.motes -= 250;
            break;
        }

        if (specialItems.shards >= 250) {
            console.log("Shadowmourne obtained!");
            specialItems.shards -= 250;
            break;
        }

        if (specialItems.fragments >= 250) {
            console.log("Valanyr obtained!");
            specialItems.fragments -= 250;
            break;
        }
    }

    let junkSorted = Object.entries(junkItems).sort((a, b) => a[0].localeCompare(b[0]));
    let specialSorted = Object.entries(specialItems).sort((a, b) => b[1] - a[1]);

    if(specialSorted[0][1] === specialSorted[1][1]) {
        if(specialSorted[0][0].localeCompare(specialSorted[1][0]) > 0) {
            let w = specialSorted[0];
            specialSorted[0] = specialSorted[1]
            specialSorted[1] = w;
        }
    }

    if(specialSorted[0][1] === specialSorted[2][1]) {
        if(specialSorted[0][0].localeCompare(specialSorted[2][0]) > 0) {
            let w = specialSorted[0];
            specialSorted[0] = specialSorted[2]
            specialSorted[2] = w;
        }
    }

    if(specialSorted[1][1] === specialSorted[2][1]) {
        if(specialSorted[1][0].localeCompare(specialSorted[2][0]) > 0) {
            let w = specialSorted[1];
            specialSorted[1] = specialSorted[2]
            specialSorted[2] = w;
        }
    }

    for(let [name, value] of specialSorted){
        console.log(`${name}: ${value}`);
    }

    for(let [name, value] of junkSorted){
        console.log(`${name}: ${value}`);
    }
}