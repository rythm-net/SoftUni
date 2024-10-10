package main

import "fmt"

func main() {
	var dogsCount float32
	fmt.Scanln(&dogsCount)

	var catsCount float32
	fmt.Scanln(&catsCount)

	totalSum := dogsCount * 2.50 + catsCount * 4
	fmt.Printf("%f lv.", totalSum)
}