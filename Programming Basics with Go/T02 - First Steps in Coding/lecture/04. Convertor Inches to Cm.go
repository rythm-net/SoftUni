package main

import "fmt"

func main () {
	//1. получаваме инчове -> променлива (float32)
	//2. изчисля см = инчове * 2.54
	//3. отпечатвам см
	var inches float32
	fmt.Scanln(&inches)

	var cm float32 = inches * 2.54
	fmt.Println(cm)

}