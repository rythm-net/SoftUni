function clock() {

    for (let h = 0; h <= 23; h++) {
        for (let m = 0; m <= 59; m++) {
            if (h < 10) {
                if (m < 10) {
                    console.log(`0${h}:0${m}`);
                } else {
                    console.log(`0${h}:${m}`);
                }
            } else {
                if (m < 10) {
                    console.log(`${h}:0${m}`);
                } else {
                    console.log(`${h}:${m}`);
                }
            }
        }
    }
}
clock()