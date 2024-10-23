package main


import "fmt"


func main () {

	var floors, rooms int
	fmt.Scanln(&floors) //брой на етажите
	fmt.Scanln(&rooms) //брой на стаите

	//етаж -> последен(L), четен(O), нечетен(A)

	//всеки етаж от последния към първия
	for floor := floors; floor >= 1; floor-- {
		//всяка стая -> 0 до последната (бр. стаите - 1)
		for room := 0; room <= rooms - 1; room++ {
			//слагаме бележка: {тип на стаята}{етаж}{номер на стаята}
			if floor == floors {
				//големи апартаменти
				fmt.Printf("L%d%d ", floor, room)
			}else if floor % 2 == 0 {
				//офиси
				fmt.Printf("O%d%d ", floor, room)
			} else if floor % 2 != 0 {
				//апартаменти
				fmt.Printf("A%d%d ", floor, room)
			}
		}
		fmt.Println()
	}




}