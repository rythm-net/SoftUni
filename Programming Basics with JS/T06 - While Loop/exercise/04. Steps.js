function steps(input) {
    let target = 10000;
    let totalSteps = 0;
    let steps;
    let i = 0;

    while (input[i] !== 'Going home') {
        steps = Number(input[i]);
        totalSteps += steps;

        if (totalSteps >= target) {
            console.log(`Goal reached! Good job!`);
            console.log(`${totalSteps - target} steps over the goal!`);
            break;
        }
        i++;
    }

    if (input[i] === 'Going home') {
        steps = Number(input[i + 1]);
        totalSteps += steps;

        if (totalSteps >= target) {
            console.log(`Goal reached! Good job!`);
            console.log(`${totalSteps - target} steps over the goal!`);
        } else {
            console.log(`${target - totalSteps} more steps to reach goal.`);
        }
    }
}
steps(["1000", "1500", "2000", "6500"]);