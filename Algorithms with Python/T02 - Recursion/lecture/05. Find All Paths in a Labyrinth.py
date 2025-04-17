def find_all_paths(row, col, lab, direction, path):
    if 0 > row or row >= len(lab) or 0 > col or col >= len(lab[0]) or lab[row][col] == '*' or lab[row][col] == 'v':
        return

    path.append(direction)

    if lab[row][col] == 'e':
        print(''.join(path))
    else:
        # mark cell
        lab[row][col] = 'v'
        find_all_paths(row - 1, col, lab, 'U', path)
        find_all_paths(row + 1, col, lab, 'D', path)
        find_all_paths(row, col - 1, lab, 'L', path)
        find_all_paths(row, col + 1, lab, 'R', path)
        # unmark cell
        lab[row][col] = '-'
    path.pop()


rows = int(input())
cols = int(input())
lab = []

for _ in range(rows):
    lab.append(list(input()))

find_all_paths(0, 0, lab, direction='', path=[])