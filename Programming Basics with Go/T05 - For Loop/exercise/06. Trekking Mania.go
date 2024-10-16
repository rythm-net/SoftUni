package main

import "fmt"

func main() {
	var groups int
	fmt.Scanln(&groups)

	var groupMusala int = 0
	var groupMonblan int = 0
	var groupKilimanjaro int = 0
	var groupK2 int = 0
	var groupEverest int = 0

	for group := 1; group <= groups; group++ {
		var countPeople int
		fmt.Scanln(&countPeople)
		if countPeople <= 5 {
			groupMusala += countPeople
		} else if countPeople <= 12 {
			groupMonblan += countPeople
		} else if countPeople <= 25 {
			groupKilimanjaro += countPeople
		} else if countPeople <= 40 {
			groupK2 += countPeople
		} else {
			groupEverest += countPeople
		}
	}
	var all int = groupEverest + groupK2 + groupKilimanjaro + groupMusala + groupMonblan
	var percentMusala float32 = float32(groupMusala) * 100 / float32(all)
	var percentMonblan float32 = float32(groupMonblan) * 100 / float32(all)
	var percentKilimanjaro float32 = float32(groupKilimanjaro) * 100 / float32(all)
	var percentK2 float32 = float32(groupK2) * 100 / float32(all)
	var percentEverest float32 = float32(groupEverest) * 100 / float32(all)
	
	fmt.Printf("%.2f%%\n", percentMusala)
	fmt.Printf("%.2f%%\n", percentMonblan)
	fmt.Printf("%.2f%%\n", percentKilimanjaro)
	fmt.Printf("%.2f%%\n", percentK2)
	fmt.Printf("%.2f%%", percentEverest)
}
