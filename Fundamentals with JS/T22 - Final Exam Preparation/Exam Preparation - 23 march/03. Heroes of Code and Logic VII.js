function solve(input) {
    let n = input.shift()
    let list = {}

    for (let i = 0; i < n; i++) {
        let [name, hp, mp] = input.shift().split(' ')

        if (!list.hasOwnProperty(name)) {
            list[name] = { hp: 0, mp: 0 }
        }
        list[name].hp += Number(hp)
        list[name].mp += Number(mp)
    }

    while (input[0] !== 'End') {
        let [command, par1, par2, par3] = input.shift().split(' - ')

        if (command == 'CastSpell') {
            if (list[par1].mp >= Number(par2)) {
                list[par1].mp -= Number(par2)
                console.log(`${par1} has successfully cast ${par3} and now has ${list[par1].mp} MP!`);
            } else {
                console.log(`${par1} does not have enough MP to cast ${par3}!`);
            }

        } else if (command == 'TakeDamage') {
            list[par1].hp -= Number(par2)
            if (list[par1].hp <= 0) {
                console.log(`${par1} has been killed by ${par3}!`);
                delete list[par1]
            } else {
                console.log(`${par1} was hit for ${par2} HP by ${par3} and now has ${list[par1].hp} HP left!`);
            }

        } else if (command == 'Recharge') {
            let diff = 0
            if (+par2 > (200 - list[par1].mp)) {
                diff = 200 - list[par1].mp
            } else {
                diff = Number(par2)
            }
            console.log(`${par1} recharged for ${diff} MP!`)
            list[par1].mp += diff

        } else if (command == 'Heal') {
            let diff = 0
            if (+par2 > (100 - list[par1].hp)) {
                diff = 100 - list[par1].hp
            } else {
                diff = Number(par2)
            }
            console.log(`${par1} healed for ${diff} HP!`);
            list[par1].hp += diff
        }
    }

    for (let name in list) {
        console.log(`${name}`)
        console.log(`  HP: ${list[name].hp}`)
        console.log(`  MP: ${list[name].mp}`)
    }
}
solve([
    '2',
    'Solmyr 85 120',
    'Kyrre 99 50',
    'Heal - Solmyr - 30',
    'Recharge - Solmyr - 50',
    'TakeDamage - Kyrre - 66 - Orc',
    'CastSpell - Kyrre - 15 - ViewEarth',
    'End'])