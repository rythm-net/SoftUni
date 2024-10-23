package main


import "fmt"

func main2() {

	var n int
	fmt.Scanln(&n)

	var count int = 0 //брой на валидните комбинации

	//х1 -> [0; n]
	//х2 -> [0; n]
	//х3 -> [0; n]

	for x1 := 0; x1 <= n; x1++ {
		for x2 := 0; x2 <= n; x2++ {
			for x3 := 0; x3 <= n; x3++ {
				//комбинация
				if x1 + x2 + x3 == n {
					//валидна комбинация
					count++
				}
			}
		}
	}

	fmt.Println(count)




}