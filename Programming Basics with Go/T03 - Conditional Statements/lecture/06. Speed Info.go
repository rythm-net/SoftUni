package main

import "fmt"

func main(){
	var speed float32
	fmt.Scanln(&speed)
	if speed <= 10 {
		fmt.Println("slow")
	} else if speed <= 50 {
		fmt.Println("average")
	} else if speed <= 150 {
		fmt.Println("fast")
	} else if speed <= 1000 {
		fmt.Println("ultra fast")
	} else {
		fmt.Println("extremely fast")
	}
}