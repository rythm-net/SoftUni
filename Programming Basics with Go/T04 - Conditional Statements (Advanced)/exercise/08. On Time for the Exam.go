package main

import "fmt"

func main () {

	var examHour, examMiuntes int
	fmt.Scanln(&examHour)
	fmt.Scanln(&examMiuntes)

	var arriveHour, arriveMinute int
	fmt.Scanln(&arriveHour)
	fmt.Scanln(&arriveMinute)

	//време на изпит (час и минути) -> минути
	var examInMinutes int = examHour * 60 + examMiuntes
	//време на пристигане (час и минути) -> минути
	var arriveInMinutes int = arriveHour * 60 + arriveMinute

	if arriveInMinutes > examInMinutes {
		//закъсняваме
		fmt.Println("Late")
		//закъснението
		var late int = arriveInMinutes - examInMinutes
		if late < 60 {
			fmt.Printf("%d minutes after the start", late)
		} else {
			//закъснението >= 60 мин
			var lateHour int = late / 60
			var lateMinutes int = late % 60
			fmt.Printf("%d:%02d hours after the start", lateHour, lateMinutes)
		}
	} else if arriveInMinutes == examInMinutes || examInMinutes - arriveInMinutes <= 30 {
		//на време
		fmt.Println("On time")
		//на време с по-малко от 30 мин
		if examInMinutes - arriveInMinutes <= 30 {
			fmt.Printf("%d minutes before the start", examInMinutes - arriveInMinutes)
		}
	} else if examInMinutes - arriveInMinutes > 30 {
		//по-рано
		fmt.Println("Early")
		//подраняване
		var early int = examInMinutes - arriveInMinutes
		if early < 60 {
			fmt.Printf("%d minutes before the start", early)
		} else {
			//подраняване >= 60 мин
			var earlyHour int = early / 60
			var earlyMinutes int = early % 60
			fmt.Printf("%d:%02d hours before the start", earlyHour, earlyMinutes)
		}
	}



}