package main

import "fmt"

func main () {
	var n int
	fmt.Scanln(&n)

	//всички числа от 1 до n
	//начало: 1
	//край: n
	//повтаряме: печатаме число
	//промяна: число * 2 + 1

	//for с 1 параметър (условие)
	//повтаряме: печатам числото
	//спирам: числото > n
	//продължавам: числото <= n
	var number int = 1
	for number <= n {
		fmt.Println(number)
		number = number * 2 + 1
	}


	//for цикъл с 3 параметъра
	/*for number := 1; number <= n; number = number * 2 + 1 {
		fmt.Println(number)
	}*/


}