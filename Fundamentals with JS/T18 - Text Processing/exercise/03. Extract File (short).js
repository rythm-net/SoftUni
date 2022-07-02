function solve (path){
    let name = path.split('\\').pop().split('.').slice(0,-1).join('.')
    let ext = path.split('\\').pop().split('.').pop()

    console.log(`File name: ${name}`);
    console.log(`File extension: ${ext}`)
}
solve("C:\\Users\\PC\\LinkedList.cs");