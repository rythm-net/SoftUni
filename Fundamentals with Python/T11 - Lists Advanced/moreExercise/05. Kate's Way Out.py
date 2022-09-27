n = int(input())

maze = {}
keys = range(n)
values = []

for k in keys:
    values = list(input())
    maze[k] = values

for r in range(n):
    for c in range(len(values)):
        if maze[r][c] == 'k':
            r_position = r
            c_position = c

moves = 0
exit_maze = False

while True:
    if 0 <= r_position - 1 < n and maze[r_position - 1][c_position] == ' ':
        maze[r_position - 1][c_position] = 'k'
        moves += 1
        r_position = r_position - 1
    elif 0 <= c_position + 1 < len(values) and maze[r_position][c_position + 1] == ' ':
        maze[r_position][c_position + 1] = 'k'
        moves += 1
        c_position = c_position + 1
    elif 0 <= r_position + 1 < n and maze[r_position + 1][c_position] == ' ':
        maze[r_position + 1][c_position] = 'k'
        moves += 1
        r_position = r_position + 1
    elif 0 <= c_position - 1 < len(values) and maze[r_position][c_position - 1] == ' ':
        maze[r_position][c_position - 1] = 'k'
        moves += 1
        c_position = c_position - 1
    else:
        break

if r_position == 0 or r_position == n-1 or c_position == 0 or c_position == len(values) - 1:
    moves += 1
    exit_maze = True

if exit_maze:
    print(f'Kate got out in {moves} moves')
else:
    print('Kate cannot get out')