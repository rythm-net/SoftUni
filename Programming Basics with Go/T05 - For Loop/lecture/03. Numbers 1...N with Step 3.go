
package main

import "fmt"

func main() {

	var n int
	fmt.Scanln(&n)

	for number := 1; number <= n; number += 3 {
		fmt.Println(number)
	}

}