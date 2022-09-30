class Party:
    def __init__(self):
        self.people = []

party = Party()

while True:
    peoples = input()
    if peoples == "End":
        break
    else:
        party.people.append(peoples)

print(f'Going: {", ".join(party.people)}')
print(f'Total: {len(party.people)}')