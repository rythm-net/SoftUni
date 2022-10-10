# 90/100
# see 10-winning_ticket-03.py

tickets = input().split(", ")

for i in range(len(tickets)):
    tickets[i] = tickets[i].replace(" ", "")

winning_symbols = ["$", "@", "#", "^"]

for ticket in tickets:

    max_counter_left = 0
    max_counter_right = 0
    winning_symbol = []

    if len(ticket) == 20:
        first_half = ticket[0:10:1]
        second_half = ticket[10:21:1]
        current_counter_left = 0
        current_counter_right = 0

        for i in range(len(first_half)):
            if first_half[i] in winning_symbols:
                current_counter_left += 1
                winning_symbol.append(first_half[i])
            if i < len(first_half) - 1:
                if first_half[i + 1] not in winning_symbols:
                    if current_counter_left > max_counter_left:
                        max_counter_left = current_counter_left
                        current_counter_left = 0
            else:
                if first_half[i - 1] in winning_symbols:
                    if current_counter_left > max_counter_left:
                        max_counter_left = current_counter_left

        for i in range(len(second_half)):
            if second_half[i] in winning_symbols:
                current_counter_right += 1
            if i < len(second_half) - 1:
                if second_half[i + 1] not in winning_symbols:
                    if current_counter_right > max_counter_right:
                        max_counter_right = current_counter_right
                        current_counter_right = 0
            else:
                if second_half[i - 1] in winning_symbols:
                    if current_counter_right > max_counter_right:
                        max_counter_right = current_counter_right

        winning_symbol = (max(set(winning_symbols), key=winning_symbol.count))

        if max_counter_right >= 6 and max_counter_left >= 6:
            if max_counter_left == 10 and max_counter_right == 10:
                print(f'ticket "{ticket}" - {max_counter_left}{winning_symbol} Jackpot!')
            elif max_counter_left < max_counter_right or max_counter_left == max_counter_right:
                print(f'ticket "{ticket}" - {max_counter_left}{winning_symbol}')
            elif max_counter_left > max_counter_right:
                print(f'ticket "{ticket}" - {max_counter_right}{winning_symbol}')
        else:
            print(f'ticket "{ticket}" - no match')
    else:
        print("invalid ticket")