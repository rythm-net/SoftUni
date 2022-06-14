function triangleArea(n1, n2, n3) {
    let a = Number(n1);
    let b = Number(n2);
    let c = Number(n3);

    let s = (a + b + c) / 2;
    let area = Math.sqrt(s * ((s - a) * (s - b) * (s - c)));

    console.log(area);
}
triangleArea("2", "3.5", "4");