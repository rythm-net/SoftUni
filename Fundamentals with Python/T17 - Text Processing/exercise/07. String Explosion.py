text = input()

new_text = ""
letters_to_skip = []

for i in range(len(text)):
    if i in letters_to_skip:
        if text[i] == ">":
            new_text += text[i]
            strength = int(text[i+1])
            for x in range(strength + 1):
                letters_to_skip.append(i+1+x)
    else:
        if text[i] == ">":
            strength = int(text[i+1])
            for x in range(strength):
                letters_to_skip.append(i+1+x)
        new_text += text[i]

print(new_text)