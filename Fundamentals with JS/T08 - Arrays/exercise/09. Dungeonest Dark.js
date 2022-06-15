function dungeonest(array) {
    let dungen = array[0].split("|");
    let health = 100;
    let coins = 0;
    let countRooms = 0;
    let allCoins = 0;

    for (let i = 0; i < dungen.length; i++) {
        let currentRoom = dungen[i].split(" ");
        let command = currentRoom[0];
        let numb = Number(currentRoom[1]);
        countRooms++;

        if (command === "potion") {
            if (health + numb > 100) {
                numb = 100 - health;
                health = 100;
            } else {
                health += numb;
            }
            console.log(`You healed for ${numb} hp.`);
            console.log(`Current health: ${health} hp.`);
        } else if (command === "chest") {
            coins = Number(numb);
            allCoins += Number(numb);
            console.log(`You found ${coins} coins.`);
        } else {
            health -= Number(numb);
            if (health > 0) {
                console.log(`You slayed ${command}.`);
            } else {
                console.log(`You died! Killed by ${command}.`);
                console.log(`Best room: ${countRooms}`);
                return;
            }
        }
    }
    console.log(`You've made it!`);
    console.log(`Coins: ${allCoins}`);
    console.log(`Health: ${health}`);
}
dungeonest(["cat 10|potion 30|orc 10|chest 10|snake 25|chest 110"]);