student_ticket_counter = 0
standard_ticket_counter = 0
kid_ticket_counter = 0
total_ticket_counter = 0
command = input()

while command != "Finish":
    movie_name = command
    free_place = int(input())
    total_places = free_place
    sold_tickets = 0

    while free_place > 0:
        ticket_type = input()
        if ticket_type == "End":
            break
        elif ticket_type == "student":
            student_ticket_counter += 1
        elif ticket_type == "standard":
            standard_ticket_counter += 1
        elif ticket_type == "kid":
            kid_ticket_counter += 1

        free_place -= 1
        sold_tickets += 1
        total_ticket_counter += 1

print(f'{movie_name} - {sold_tickets / total_places * 100:.2f}% full.')
command = input()
print(f'Total tickets: {total_ticket_counter}')
print(f'{(student_ticket_counter / total_ticket_counter * 100):.2f}% student tickets.')
print(f'{(standard_ticket_counter / total_ticket_counter * 100):.2f}% standard tickets.')
print(f'{(kid_ticket_counter / total_ticket_counter * 100):.2f}% kids tickets.')