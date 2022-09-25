numbers = input()
numbers = numbers.split(", ")

def palindrome(number):
    is_palindrome = True

    for index in range(int(len(number) / 2)):
        if number[index] != number[((index * -1) - 1)]:
            is_palindrome = False

    return is_palindrome

for number in numbers:
    print(palindrome(number))