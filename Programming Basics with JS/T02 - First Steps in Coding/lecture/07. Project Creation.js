function project(input){
    let timeForOne = 3;
    let firstname = (input[0]);
    let cProjects = (input[1]);
    let hoursForXProjects = timeForOne * cProjects;

    console.log("The architect " + firstname + " will need " + hoursForXProjects + " hours to complete " + cProjects + " project/s.");
}
project(["George", "4"])