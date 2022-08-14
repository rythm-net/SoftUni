searched_book = input()
checked_books = 0
book = input()

while book != "No More Books":
    if searched_book == book:
        print(f"You checked {checked_books} books and found it.")
        break
    checked_books += 1
    book = input()

else:
    print("The book you search is not here!")
    print(f"You checked {checked_books} books.")