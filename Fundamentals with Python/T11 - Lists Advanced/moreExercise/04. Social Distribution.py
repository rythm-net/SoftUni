population = input()
minimum_health = int(input())

population = population.split(", ")
population = [int(number) for number in population]

health_needed = [minimum_health - health for health in population if health < minimum_health]
health_needed = sum(health_needed)

health_for_distribution = [health - minimum_health for health in population if health > minimum_health ]
health_for_distribution = sum(health_for_distribution)

if health_needed > health_for_distribution:
    print("No equal distribution possible")
else:
    max_value = max(population)
    max_index = population.index(max_value)
    for i in range(len(population)):
        if population[i] < minimum_health:
            max_value = max(population)
            max_index = population.index(max_value)
            health_to_distribute = minimum_health - population[i]
            population[i] += health_to_distribute
            population[max_index] -= health_to_distribute

    print(population)