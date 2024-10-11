package main

import "fmt"

func main () {

	//1. входни данни - точки (цяло число)
	//2. бонус спрямо големината на числото
	//3. допълнителен бонус
	//4. отпечатвам
	//4.1. бонус
	//4.2. точки + бонус

	var points int
	fmt.Scanln(&points)

	var bonus float32 = 0 //първоначалния бонус = 0

	//бонус спрямо големина
	if points <= 100 {
		//по-малки от 100
		bonus = 5
	} else if points > 1000 {
		//по-големи от 1000
		bonus = 0.1 * float32(points)
	} else {
		//между 100 и 1000
		bonus = 0.2 * float32(points)
	}

	//допълнителен бонус
	//четно
	if points % 2 == 0 {
		bonus = bonus + 1  //bonus += 1
	} else if (points % 10 == 5) { //завършва на 5
		bonus = bonus + 2  //bonus += 2
	}

	fmt.Println(bonus)
	fmt.Println(float32(points) + bonus)

}