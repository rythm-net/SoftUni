function solve(input) {
    let heros = [];

    for (let element of input) {
        let info = element.split(" / ");
        let hero = info[0];
        let level = info[1];
        let items = info[2].split(", ").join(", ");
        let currentHero = {
            hero,
            level,
            items,
        };
        heros.push(currentHero);
    }
    heros.sort((a, b) => a.level - b.level);

    for (const hero of heros) {
        console.log(`Hero: ${hero.hero}`);
        console.log(`level => ${hero.level}`);
        console.log(`items => ${hero.items}`);
    }
}
solve([
    "Isacc / 25 / Apple, GravityGun",
    "Derek / 12 / BarrelVest, DestructionSword",
    "Hes / 1 / Desolator, Sentinel, Antara",]);