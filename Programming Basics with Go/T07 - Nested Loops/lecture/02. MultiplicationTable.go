package main

import "fmt"


func main5() {
	//първи множител -> [1;10]
	//втори множител -> [1;10]

	//за всяка стойност на първи множител -> повтаряме: всяка стойност на втория множител
	for first := 1; first <= 10; first++ {
		//всяка стойност на втория множител
		for second := 1; second <= 10; second++ {
			fmt.Printf("%d * %d = %d\n", first, second, first * second)
		}
	}
}