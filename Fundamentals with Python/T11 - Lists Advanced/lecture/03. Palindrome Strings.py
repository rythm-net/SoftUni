words = input()
palindrome = input()

words = words.split(" ")
palindromes = []

for word in words:
    is_palindrome = True
    for i in range(int(len(word) / 2)):
        if word[i] != word[(i * -1) - 1]:
            is_palindrome = False
    if is_palindrome:
        palindromes.append(word)

count_palindrome = palindromes.count(palindrome)

print(palindromes)
print(f'Found palindrome {count_palindrome} times')