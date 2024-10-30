package main

import "fmt"

func main () {

	var startNumber, endNumber int
	fmt.Scanln(&startNumber) //5623
	fmt.Scanln(&endNumber) //8765

	var thousandsStartNumber int = startNumber / 1000 // -> 5
	var hundredsStartNumber int = startNumber / 100 % 10 // -> 6
	var tensStartNumber int = startNumber / 10 % 10  // -> 2
	var unitsStartNumber int = startNumber % 10   // -> 3

	var thousandsEndNumber int = endNumber / 1000  // -> 8
	var hundredsEndNumber int = endNumber / 100 % 10  // -> 7
	var tensEndNumber int = endNumber / 10 % 10  // -> 6
	var unitsEndNumber int = endNumber % 10   // -> 5

	//всички числа от startNumber до endNumber, които имат само нечетни цифри
	//генерираме 4-цифрени числа
	for thousands := thousandsStartNumber; thousands <= thousandsEndNumber; thousands++ { // хилядни -> [хилядни на startNumber до хилядни на endNumber]
		for hundreds := hundredsStartNumber; hundreds <= hundredsEndNumber; hundreds++ {  //стотици -> [стотици на startNumber до стотици на endNumber]
			for tens := tensStartNumber; tens <= tensEndNumber; tens++ { //десетици -> [десетици на startNumber до десетици на endNumber]
				for units := unitsStartNumber; units <= unitsEndNumber; units++ { //единици -> [единици на startNumber до единицн на endNumber]
					//принтираме всички числа само с нечетни цифри
					if thousands % 2 != 0 && hundreds % 2 != 0 && tens % 2 != 0 && units % 2 != 0 {
						fmt.Printf("%d%d%d%d ", thousands, hundreds, tens, units)
					} 
				}
			}
		}
	}






}