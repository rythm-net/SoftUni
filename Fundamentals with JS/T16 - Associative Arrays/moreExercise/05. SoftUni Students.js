function solve(arr) {
    let listOfCourses = {};

    for (let element of arr) {
        if (!element.includes(`[`)) {
            let [courseName, capacity] = element.split(`: `);

            if (!listOfCourses.hasOwnProperty(courseName)) {
                listOfCourses[courseName] = {
                    capacity: Number(capacity),
                    students: [],  //here
                }
            } else {
                listOfCourses[courseName].capacity += Number(capacity);
            }

        } else if (element.includes(`with email`)) {
            element = element.split(`[`);
            let userName = element.shift();
            element = element[0].split(`]`);

            let creditCount = Number(element.shift());
            let temp = element[0].split(` `);
            let email = temp[3];
            let courseName = element[0].split(` joins `)[1];

            if (listOfCourses.hasOwnProperty(courseName) && listOfCourses[courseName].capacity > 0) {
                listOfCourses[courseName].students.push({userName: userName, creditCount: creditCount, email: email,
                })
                listOfCourses[courseName].capacity--;
            }
        }
    }

    let sortedByCapacity = Object.entries(listOfCourses).sort((a, b) =>
        Object.keys(b[1].students).length - Object.keys(a[1].students).length);

    for (let element of sortedByCapacity) {
        console.log(`${element[0]}: ${element[1].capacity} places left`);

        element[1].students.sort((a, b) => b.creditCount - a.creditCount).forEach(x =>
            console.log(`--- ${x.creditCount}: ${x.userName}, ${x.email}`));
    }
}