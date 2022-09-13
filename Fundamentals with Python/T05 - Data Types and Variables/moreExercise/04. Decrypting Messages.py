key = int(input())
number_of_letters = int(input())

for i in range(number_of_letters):
    letter = input()

    print(chr(ord(letter) + key), end = "")