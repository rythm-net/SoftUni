first_text = input()
second_text = input()
new_string = ''

for index in range(len(first_text)):
   new_string += second_text[index]

   if not first_text[index] == second_text[index]:
       print(new_string,end = '')

       for i in range(index + 1, len(first_text)):
           print(first_text[i],end = '')
       print()