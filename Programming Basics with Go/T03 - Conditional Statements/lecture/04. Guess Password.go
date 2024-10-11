package main

import "fmt"

func main() {
	var password string
	fmt.Scanln(&password)


	if password == "s3cr3t!P@ssw0rd" {
		fmt.Println("Welcome")
	} else {
		fmt.Println("Wrong password!")
	}
}