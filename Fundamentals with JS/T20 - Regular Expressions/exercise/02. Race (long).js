function race(array) {
    let nameOfRacers = array.shift().split(', ');
    let racersObj = {}
    let places = {1:'1st', 2:'2nd', 3:'3rd'}
    let raceName = ''
    let tempKms = 0;
    let counter = 0;

    for (const str of array) {
        if (str === 'end of race') {
            break;
        }
        let strArr = str.split('')

        for (let i = 0; i < strArr.length; i++) {
            let regex = /^[A-Za-z]+$/g;

            if (regex.test(strArr[i])) {
                raceName += strArr[i]
            }

            else if (Number.isInteger(Number(strArr[i]))) {
                tempKms += Number(strArr[i]);
            }

            if (i + 1 == strArr.length) {
                if (nameOfRacers.includes(raceName)) {
                    if (!racersObj.hasOwnProperty(raceName)) {
                        racersObj[raceName] = tempKms;
                        raceName = '';
                        tempKms = 0;
                    } else {
                        racersObj[raceName] += tempKms;
                        raceName = '';
                        tempKms = 0;
                    }
                } else {
                    raceName = '';
                    tempKms = 0;
                }
            }
        }
    }

    let sort = Object.entries(racersObj).sort((a, b) => b[1] - a[1])
    let a = 1;

    for (const str of sort) {
        counter += 1;

        if(places.hasOwnProperty(counter)){
            console.log(`${places[counter]} place: ${str[0]}`);
        }

        if (counter === 3) {
            break;
        }
    }
}