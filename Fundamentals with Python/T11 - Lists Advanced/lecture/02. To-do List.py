todos = []

while True:
    todo = input()
    if todo == "End":
        break
    else:
        todo = todo.split("-")
        todo_importance = int(todo[0])
        todo_note = todo[1]
        todos.append([todo_importance, todo_note])

def sorting_by_importance(e):
    return e[0]

todos.sort(key=sorting_by_importance)
new_todos = []

for todo in todos:
    new_todo = todo[1]
    new_todos.append(new_todo)

print(new_todos)