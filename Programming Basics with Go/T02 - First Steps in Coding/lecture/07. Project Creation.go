package main

import "fmt"

func greeting1() {
	
	var architectName string
	fmt.Scanln(&architectName)
	var countProjects int
	fmt.Scanln(&countProjects)

	fmt.Printf("The architect %s will need %d hours to complete %d project/s.", architectName, countProjects * 3, countProjects)


}