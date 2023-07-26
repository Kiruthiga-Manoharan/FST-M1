numbers = list(input("Enter a sequence of numbers separated by comma: ").split(","))
sum=0
for number in numbers:
    sum = sum+int(number)
print(sum)