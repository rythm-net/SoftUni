chicken_menu_count = int(input())
fish_menu_count = int(input())
veg_menu_count = int(input())

chicken_menu_price = 10.35
fish_menu_price = 12.40
veg_menu_price = 8.15

chicken_total = chicken_menu_count * chicken_menu_price
fish_total = fish_menu_count * fish_menu_price
veg_menu_total = veg_menu_count * veg_menu_price

desert = (chicken_total + fish_total + veg_menu_total) * 0.20
delivery = 2.50

total = chicken_total + fish_total + veg_menu_total + desert + delivery

print(total)