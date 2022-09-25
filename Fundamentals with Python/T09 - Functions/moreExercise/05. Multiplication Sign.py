input_data = list(int(input()) for x in range(3))

def find_positive_or_negative(numbers):
    negative = []
    zero_found = False
    for x in numbers:
        if x < 0:
            negative.append(1)
        elif x == 0:
            zero_found = True

    if zero_found:
        return 'zero'
    elif len(negative) % 2 == 0:
        return "positive"
    elif len(negative) % 2 != 0:
        return "negative"

print(find_positive_or_negative(input_data))