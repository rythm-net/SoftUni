def GetFibonacci(number):
    if number<=1:
        return 1
    return GetFibonacci(number-1)+GetFibonacci(number-2)

def iterative_fib(number):
    fib0=1
    fib1=1
    result=0
    for _ in range (number-1):
        result=fib0+fib1
        fib0,fib1=fib1,result
    return result

n=int(input())

# print(GetFibonacci(n))

print(iterative_fib(n))