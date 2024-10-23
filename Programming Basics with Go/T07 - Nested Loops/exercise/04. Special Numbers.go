package main

import "fmt"

func main2() {

	var n int = 9
	

	//всички числа от 1111 до 9999 -> проверка дали е специално

	for thousands := 1; thousands <= 9; thousands++ { //хилядни
		for hundreds := 1; hundreds <= 9; hundreds++ { //стотици
			for tens := 1; tens <= 9; tens++ {       //десетици
				for units := 1; units <= 9; units++ { //единици
					//число
					//проверка на цифрите
					var check1 bool = n % units == 0
					var check2 bool = n % tens == 0
					var check3 bool = n % hundreds == 0
					var check4 bool = n % thousands == 0
					if check1 && check2 && check3 && check4 {
						fmt.Printf("%d%d%d%d ", thousands, hundreds, tens, units)
					}
				}
			}
		}
	}
}
