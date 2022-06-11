function solve(num , prec){
    let OurNumber = num ;
    let precision = prec ;
    
    if(precision > 15 ){
        precision = 15 ;
    }

    let result = OurNumber.toFixed(precision) ;
    console.log(parseFloat(result));
}

solve (3.1415926535897932384626433832795,2)