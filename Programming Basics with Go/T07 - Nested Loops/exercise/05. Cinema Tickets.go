package main

import "fmt"

func main() {
	var countStudent int = 0
	var countStandard int = 0
	var countKid int = 0
	for true {
		var nameTillFinish string
		fmt.Scanln(&nameTillFinish)
		if nameTillFinish == "Finish" {
			break
		}
		var countAll int = 0
		var places int
		fmt.Scanln(&places)
		for true {
			var typeTillEnd string
			fmt.Scanln(&typeTillEnd)
			if typeTillEnd == "End" {
				break
			}
			switch typeTillEnd {
			case "student":
				countStudent++
				break
			case "standard":
				countStandard++
				break
			case "kid":
				countKid++
				break
			}
			countAll++
			if countAll >= places {
				break
			}

		}
		var percentFull float32 = float32(countAll) * 100 / float32(places)
		fmt.Printf("%s - %.2f%% full.\n", nameTillFinish, percentFull)
		countAll = 0
	}
	var total int = countKid + countStandard + countStudent
	var percentStudent float32 = float32(countStudent) * 100 / float32(total)
	var percentStandard float32 = float32(countStandard) * 100 / float32(total)
	var percentKid float32 = float32(countKid) * 100 / float32(total)
	fmt.Printf("Total tickets: %d\n", total)
	fmt.Printf("%.2f%% student tickets.\n", percentStudent)
	fmt.Printf("%.2f%% standard tickets.\n", percentStandard)
	fmt.Printf("%.2f%% kids tickets.", percentKid)
}