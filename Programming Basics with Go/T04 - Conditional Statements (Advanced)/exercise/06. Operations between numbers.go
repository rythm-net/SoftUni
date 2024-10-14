package main

import "fmt"

func main () {

	var n1, n2 int
	fmt.Scanln(&n1)
	fmt.Scanln(&n2)

	var operator string
	fmt.Scanln(&operator)


	switch operator {
		case "+":
			//събиране -> 1. сбор   2. проверка сбор
			var sum int = n1 + n2
			if sum % 2 == 0 {
				//четен сбор
				fmt.Printf("%d + %d = %d - even", n1, n2, sum)
			} else {
				//нечетен сбор
				fmt.Printf("%d + %d = %d - odd", n1, n2, sum)
			}
		case "-":
			//изваждане -> 1. разлика   2. проверка на разлика
			var diff int = n1 - n2
			if diff % 2 == 0 {
				//четна разлика
				fmt.Printf("%d - %d = %d - even", n1, n2, diff)
			} else {
				//нечетна разлика
				fmt.Printf("%d - %d = %d - odd", n1, n2, diff)
			}
		case "*":
			//умножение -> 1. произведение   2. проверка на произведение
			var product int = n1 * n2
			if product % 2 == 0 {
				//четно произведение
				fmt.Printf("%d * %d = %d - even", n1, n2, product)
			} else {
				//нечетно произведение
				fmt.Printf("%d * %d = %d - odd", n1, n2, product)
			}
		case "/":
			//деление -> частно (дробно число)
			if n2 == 0 {
				fmt.Printf("Cannot divide %d by zero", n1)
			} else {
				// n2 != 0
				var division float32 = float32(n1) / float32(n2)
				fmt.Printf("%d / %d = %.2f", n1, n2, division)
			}
	
		case "%":
			//деление с остатък -> остатък
			if n2 == 0 {
				fmt.Printf("Cannot divide %d by zero", n1)
			} else {
				// n2 != 0
				var reminder int = n1 % n2
				fmt.Printf("%d %% %d = %d", n1, n2, reminder)
			}
	}

}