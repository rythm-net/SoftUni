# TODO before start the app, please run
# pip install tkcalendar
# in your terminal with activated venv for the project


from tkinter import messagebox

from tkcalendar import DateEntry
from tkinter.ttk import *
from tkinter import *
from tkinter.scrolledtext import *
import os
import json


mapper = {1: "Minor", 2: "Medium", 3: "High"}

def clear_view(tk):
    for el in tk.grid_slaves():
        el.destroy()


def get_id(tasks):
    ids = sorted(tasks, key=lambda x: x['id'], reverse=True)
    if ids:
        last_id = ids[0]['id'] + 1
        return last_id
    return 1


def create_task(name, date, description, priority, is_completed, task=None):

    with open('db.txt', 'r+') as file:
        if os.path.getsize('db.txt'):
            all_tasks = json.load(file)
        else:
            all_tasks = []
        if not task:
            task_id = get_id(all_tasks)
        else:
            task_id = task
        task = {'id': task_id, 'name': name, 'date': date, 'description': description, 'priority': priority,
                                        'is_completed': is_completed}

        all_tasks.append(task)
        file.seek(0)
        file.truncate(0)
        json.dump(all_tasks, file)
    clear_view(tk)
    main_view(tk)


def create_task_view(tk):
    clear_view(tk)
    Label(tk, text="Enter your task name: ").grid(row=0, column=0, padx=20, pady=20)
    name = Entry(tk)
    name.grid(row=0, column=1, padx=20, pady=20)
    Label(tk, text="Due date: ").grid(row=1, column=0, padx=20, pady=20)
    date = DateEntry(tk)
    date.grid(row=1, column=1, padx=20, pady=20)
    Label(tk, text="Description: ").grid(row=2, column=0, padx=20, pady=20)
    description = ScrolledText(tk, width=20, height=10)
    description.grid(row=2, column=1, padx=20, pady=20)
    Label(tk, text="Select priority: ").grid(row=3, column=0, padx=20, pady=20)
    selected = IntVar()
    rad1 = Radiobutton(tk, text='Low', value=1, variable=selected)
    rad2 = Radiobutton(tk, text='Medium', value=2, variable=selected)
    rad3 = Radiobutton(tk, text='High', value=3, variable=selected)
    rad1.grid(column=1, row=3)
    rad2.grid(column=2, row=3)
    rad3.grid(column=3, row=3)
    Label(tk, text="Check if completed: ").grid(row=4, column=0, padx=20, pady=20)
    chk_state = BooleanVar()
    chk_state.set(False)  # set check state
    chk = Checkbutton(tk, text='Choose', var=chk_state)
    chk.grid(column=1, row=4)
    all_fields = [name, date, description, selected, chk_state]
    Button(tk, text="Create new task", bg="green", fg="white", command=lambda: create_task(name.get(), date.get(), description.get("1.0", END), selected.get(), chk_state.get())).grid(row=5, column=0)
    Button(tk, text="Cancel", bg="black", fg="white", command=lambda: main_view(tk)).grid(row=5, column=1, padx=100,
                                                                                          pady=100)


def triger_edit(tk, selected, all_tasks, all_fields):
    m = messagebox.askquestion("Edit", "Are you sure you want to edit?")
    if m == "yes":
        all_tasks.remove(selected)
        task = {'id': selected['id'], 'name': all_fields[0], 'date': all_fields[1], 'description': all_fields[2], 'priority': all_fields[3],
                'is_completed': all_fields[4]}

        all_tasks.append(task)
        with open('db.txt', 'w+') as file:
            file.seek(0)
            file.truncate(0)
            json.dump(all_tasks, file)
        main_view(tk)



def edit_task(task):
    task_id = int(re.match(r"{'id': (?P<id>\d+)", task).groupdict()['id'])
    with open('db.txt', 'r+') as file:
        all_tasks = json.load(file)
        selected = list(filter(lambda x: x['id'] == task_id, all_tasks))[0]
    clear_view(tk)
    Label(tk, text="Enter your task name: ").grid(row=0, column=0, padx=20, pady=20)
    name = Entry(tk)
    name.delete(0, END)
    name.insert(0, selected['name'])
    name.grid(row=0, column=1, padx=20, pady=20)
    Label(tk, text="Due date: ").grid(row=1, column=0, padx=20, pady=20)
    date = DateEntry(tk)
    date.delete(0, END)
    date.insert(0, selected['date'])
    date.grid(row=1, column=1, padx=20, pady=20)
    Label(tk, text="Description: ").grid(row=2, column=0, padx=20, pady=20)
    description = ScrolledText(tk, width=20, height=10)
    description.insert(INSERT, selected['description'])
    description.insert(END, "")
    description.grid(row=2, column=1, padx=20, pady=20)
    Label(tk, text=f"Select priority, current is {mapper[selected['priority']] if selected['priority'] else None}").grid(row=3, column=0, padx=20, pady=20)
    s = IntVar()
    rad1 = Radiobutton(tk, text='Low', value=1, variable=s)
    rad2 = Radiobutton(tk, text='Medium', value=2, variable=s)
    rad3 = Radiobutton(tk, text='High', value=3, variable=s)

    rad1.grid(column=1, row=3)
    rad2.grid(column=2, row=3)
    rad3.grid(column=3, row=3)
    Label(tk, text="Check if completed: ").grid(row=4, column=0, padx=20, pady=20)
    Label(tk, text="Check if completed: ").grid(row=4, column=0, padx=20, pady=20)
    chk_state = BooleanVar()
    chk_state.set(selected["is_completed"])  # set check state
    chk = Checkbutton(tk, text='Choose', var=chk_state)
    chk.grid(column=1, row=4)

    Button(tk, text="Edit task", bg="yellow", fg="black", command=lambda: triger_edit(tk, selected, all_tasks, [name.get(), date.get(), description.get("1.0", END), s.get(), chk_state.get()])).grid(row=5, column=0)
    Button(tk, text="Cancel", bg="black", fg="white", command=lambda: main_view(tk)).grid(row=5, column=1, padx=100, pady=100)



def delete_task(task):
    task_id = int(re.match(r"{'id': (?P<id>\d+)", task).groupdict()['id'])
    with open('db.txt', 'r+') as file:
        all_tasks = json.load(file)
        selected = list(filter(lambda x: x['id']==task_id, all_tasks))[0]
        m = messagebox.askquestion("Action: Delete!","Are you sure you want to remove this task?")
        if m == "yes":
            all_tasks.remove(selected)
        file.seek(0)
        file.truncate(0)
        json.dump(all_tasks, file)
    list_tasks_view(tk)


def list_tasks_view(tk):
    clear_view(tk)
    dd = Combobox(tk, width=100)
    with open('db.txt', 'r') as file:
        try:
            all_tasks=json.load(file)
        except:
            all_tasks = []
    dd['values'] = all_tasks
    dd.grid(row=0, column=0)
    Label(tk, text="Select a task and action: ").grid(row=1, column=0, padx=20, pady=20)
    Button(tk, text="Edit task", bg="yellow", fg="black", command=lambda: edit_task(dd.get())).grid(row=2, column=0)
    Button(tk, text="Delete task", bg="red", fg="white", command=lambda: delete_task(dd.get())).grid(row=2, column=1)
    Button(tk, text="Cancel", bg="black", fg="white", command=lambda: main_view(tk)).grid(row=3, column=0, padx=100,
                                                                                          pady=100)



def main_view(tk):
    clear_view(tk)
    Button(tk, text="List all tasks", bg="blue", fg="white", command=lambda: list_tasks_view(tk)).grid(row=1, column=0, padx=100, pady=100)
    Button(tk, text="Create new task", bg="green", fg="white", command=lambda: create_task_view(tk)).grid(row=1, column=1, padx=100, pady=100)



if __name__ == "__main__":
    global tk
    tk = Tk()
    tk.geometry("700x600")
    main_view(tk)
    tk.mainloop()