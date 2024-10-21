package main

import (
	"fmt"
)

func main() {

	var change float32 = 0.59
	//fmt.Scanln(&change) //лв и стотинки

	var changeInSt int = int(change * 100) //ресто (ст)

	//спираме: changeInSt <= 0
	//продължаваме: changeInSt > 0
	var count int = 0 //бр. монетите

	for changeInSt != 0 {
		//връщаме ресто
		// двулевка -> 200 ст
		if changeInSt >= 200 {
			//връщаме с монета от 2 лв
			count++
			changeInSt -= 200
		} else if changeInSt >= 100 {
			//връщаме с монета от 1 лв
			count++
			changeInSt -= 100
		} else if changeInSt >= 50 {
			//връщаме с монета от 50 ст
			count++
			changeInSt -= 50
		} else if changeInSt >= 20 {
			//връщаме с монета от 20 ст
			count++
			changeInSt -= 20
		} else if changeInSt >= 10 {
			//връщаме с монета от 10 ст
			count++
			changeInSt -= 10
		} else if changeInSt >= 5 {
			//връщаме с монета от 5 ст
			count++
			changeInSt -= 5
		} else if changeInSt >= 2 {
			//връщаме с монета от 2 ст
			count++
			changeInSt -= 2
		} else if changeInSt >= 1 {
			//връщаме с монета от 1 ст
			count++
			changeInSt -= 1
		}
	}

	fmt.Print(count)


}