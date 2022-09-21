before_shuffle = input()
number_of_splits = int(input())

splitted = before_shuffle.split(" ")
cards_to_be_splitted = [card for card in splitted if card != splitted[0] and card != splitted[-1]]

for i in range(number_of_splits):

    first_half = []
    for i in range(int(len(cards_to_be_splitted) / 2)):
        first_half.append(cards_to_be_splitted[i])

    second_half = []
    for i in range(int(len(cards_to_be_splitted) / 2), len(cards_to_be_splitted)):
        second_half.append(cards_to_be_splitted[i])

    splitted_cards = []
    for i in range(len(first_half)):
        splitted_cards.append(second_half[i])
        splitted_cards.append(first_half[i])

    cards_to_be_splitted = splitted_cards

cards_to_be_splitted.insert(0, splitted[0])
cards_to_be_splitted.append(splitted[-1])

print(cards_to_be_splitted)