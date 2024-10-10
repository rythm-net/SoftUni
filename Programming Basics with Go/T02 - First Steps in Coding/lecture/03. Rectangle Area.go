package main

import "fmt"

func main() {
	//1. страните на правоъгълника -> 2 променливи -> стойността се въвежда
	//2. лицето = широчина * дължина
	//3. отпечатвам лицето
	var a int
	var b int
	fmt.Scanln(&a)
	fmt.Scanln(&b)
	
	var area int = a * b
	fmt.Println(area)

}