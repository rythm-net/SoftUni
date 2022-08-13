number_of_tabs = int(input())
salary = int(input())

for _ in range(number_of_tabs):
    current_tab_name = str(input())

    if current_tab_name == "Facebook":
        salary -= 150
    elif current_tab_name == "Instagram":
        salary -= 100
    elif current_tab_name == "Reddit":
        salary -= 50
    if salary <= 0:
        print("You have lost your salary.")
        break

if salary > 0:
    print(f"{salary}")