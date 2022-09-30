class Inventory:

    def __init__(self, capacity: int):
        self._capacity = capacity
        self.items = []

    def add_item(self, item: str):
        if len(self.items) < self._capacity:
            self.items.append(item)
        else:
            return "not enough room in the inventory"

    def get_capacity(self):
        return self._capacity

    def __repr__(self):
        items = ', '.join(self.items)
        capacity_left = self._capacity - len(self.items)
        return f"Items: {items}.\nCapacity left: {capacity_left}"

inventory = Inventory(2)
inventory.add_item("potion")
inventory.add_item("sword")
inventory.add_item("bottle")

print(inventory.get_capacity())
print(inventory)