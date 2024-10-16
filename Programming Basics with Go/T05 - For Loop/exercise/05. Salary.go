package main

import "fmt"

func main() {
	var n, salary int
	fmt.Scanln(&n)
	fmt.Scanln(&salary)

	for tab := 1; tab <= n; tab++ {
		var site string
		fmt.Scanln(&site)
		
		switch site {
		case "Facebook":
			salary -= 150
			break
		case "Instagram":
			salary -= 100
			break
		case "Reddit":
			salary -= 50
			break
		}
		if salary <= 0 {
			fmt.Println("You have lost your salary.")
			break
		}
	}
	if salary > 0 {
		fmt.Println(salary)
	}
}
