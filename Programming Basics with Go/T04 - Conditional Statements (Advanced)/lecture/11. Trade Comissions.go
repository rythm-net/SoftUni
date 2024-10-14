package main

import "fmt"

func main() {
	var town string
	fmt.Scanln(&town)

	var sells float32
	fmt.Scanln(&sells)

	var commission float32 = 0

	switch town {
	case "Sofia":
		if sells >= 0 && sells <= 500 {
			commission = 5
		} else if sells > 500 && sells <= 1000 {
			commission = 7
		} else if sells > 1000 && sells <= 10000 {
			commission = 8
		} else if sells > 10000 {
			commission = 12
		}
		break
	case "Varna":
		if sells >= 0 && sells <= 500 {
			commission = 4.5
		} else if sells > 500 && sells <= 1000 {
			commission = 7.5
		} else if sells > 1000 && sells <= 10000 {
			commission = 10
		} else if sells > 10000 {
			commission = 13
		}
		break
	case "Plovdiv":
		if sells >= 0 && sells <= 500 {
			commission = 5.5
		} else if sells > 500 && sells <= 1000 {
			commission = 8
		} else if sells > 1000 && sells <= 10000 {
			commission = 12
		} else if sells > 10000 {
			commission = 14.5
		}
		break
	}

	if commission == 0 {
		fmt.Println("error")
	} else {
		fmt.Printf("%.2f", sells * commission / 100)
	}
}
