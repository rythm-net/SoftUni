morse_code = input().split(" ")
morse_code_table = {
    ".-": 'A',
    "-...": 'B',
    "-.-.": 'C',
    "-..": 'D',
    ".": 'E',
    "..-.": 'F',
    "--.": 'G',
    "....": 'H',
    "..": 'I',
    ".---": 'J',
    "-.-": 'K',
    ".-..": 'L',
    "--": 'M',
    "-.": 'N',
    "---": 'O',
    ".--.": 'P',
    "--.-": 'Q',
    ".-.": 'R',
    "...": 'S',
    "-": 'T',
    "..-": 'U',
    "...-": 'V',
    ".--": 'W',
    "-..-": 'X',
    "-.--": 'Y',
    '--..': 'Z',
    '|': " "
}

for word in morse_code:
    if word in morse_code_table:
        print(morse_code_table[word], end="")