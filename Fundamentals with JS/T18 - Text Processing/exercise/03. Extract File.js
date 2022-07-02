function solve(path) {
    let tokens = path.split("\\");
    let filename = tokens[tokens.length - 1];

    let index = filename.lastIndexOf('.')
    let name = filename.substring(0,index);
    let ext = filename.substring(index+1)

    console.log (`File name: ${name}`)
    console.log(`File extension: ${ext}`)
}
solve("C:\\Users\\PC\\LinkedList.cs");