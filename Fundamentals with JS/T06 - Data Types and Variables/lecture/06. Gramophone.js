function solve(a, b, c) {
    let bandName = a;
    let albumName = b;
    let songName = c;
    let time = (albumName.length * bandName.length * songName.length) / 2;
    let rotations = time / 2.5;

    console.log(`The plate was rotated ${Math.ceil(rotations)} times.`);
}
solve("Rammstein", "Sehnsucht", "Engel");