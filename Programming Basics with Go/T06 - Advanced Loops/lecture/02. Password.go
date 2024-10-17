package main

import "fmt"

func main () {
	//потребителско име
	var username string
	fmt.Scanln(&username)
	//парола
	var password string
	fmt.Scanln(&password)

	//повтаряме: въвежда парола 
	//спираме: въведената парола == password
	//продължаваме: въведената парола != password

	var enteredPassword string
	fmt.Scanln(&enteredPassword)

	for enteredPassword != password {
		fmt.Scanln(&enteredPassword)
	}

	//enteredPassword == password
	fmt.Printf("Welcome %s!", username)
}

/*Nakov
1234
pass
1324
1234*/
