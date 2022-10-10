title = input()
print(f'<h1>\n\t{title}\n</h1>')
content = input()
print(f'<article>\n\t{content}\n</article>')

command = input()

while command != "end of comments":
    comment = command
    print(f'<div>\n\t{comment}\n</div>')
    command = input()