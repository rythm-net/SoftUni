function vacantion(a, b, c) {
    let countPeople = a;
    let typeGroup = b;
    let day = c;
    let price = 0;
    let total = 0;
    if (day === 'Friday') {
        if (typeGroup === 'Students') {
            price = 8.45;
        } else if (typeGroup === 'Business') {
            price = 10.9;
        } else if (typeGroup === 'Regular') {
            price = 15;
        }
    } else if (day === 'Saturday') {
        if (typeGroup === 'Students') {
            price = 9.8;
        } else if (typeGroup === 'Business') {
            price = 15.6;
        } else if (typeGroup === 'Regular') {
            price = 20;
        }
    } else if (day === 'Sunday') {
        if (typeGroup === 'Students') {
            price = 10.46;
        } else if (typeGroup === 'Business') {
            price = 16;
        } else if (typeGroup === 'Regular') {
            price = 22.5;
        }
    }
    total = countPeople * price;
    if (typeGroup === 'Students' && countPeople >= 30) {
        total *= 0.85;
    } else if (typeGroup === 'Business' && countPeople >= 100) {
        countPeople -= 10;
        total = countPeople * price;
    } else if (typeGroup === 'Regular' && (countPeople >= 10 && countPeople <= 20)) {
        total *= 0.95;
    }
    console.log(`Total price: ${total.toFixed(2)}`);
}
vacantion(40,
    "Regular",
    "Saturday")