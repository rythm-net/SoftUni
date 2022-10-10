text = input()

work_string = ""
unique_symbols = []
final_string = ""
repeater = ''

for i in range(len(text)):
    if not text[i].isdigit():
        work_string += text[i]
        if text[i].upper() not in unique_symbols:
            unique_symbols.append(text[i].upper())
    else:
        if i < len(text) - 1:
            if text[i+1].isdigit() :
                repeater += text[i]
            else:
                repeater += text[i]
                repeater = int(repeater)

                final_string += work_string.upper() * repeater
                work_string = ""
                repeater = ''
        else:
            repeater += text[i]
            repeater = int(repeater)
            final_string += work_string.upper() * repeater
            work_string = ""
            repeater = ''

print(f'Unique symbols used: {len(unique_symbols)}')
print(final_string)