# calculate the standard deviation of a list of numbers

import math

def main():
    # get the numbers from the user
    numbers = getNumbers()
    # calculate the mean
    mean = getMean(numbers)
    # calculate the standard deviation
    stdDev = getStdDev(numbers, mean)
    # print the results
    printResults(numbers, mean, stdDev)

def getNumbers():
    # create an empty list
    numbers = []
    # read the first value
    xStr = input("Enter a number (<Enter> to quit) >> ")
    # continue reading values until a blank line is entered
    while xStr != "":
        # convert the string to a number
        x = float(xStr)
        # add the number to the list
        numbers.append(x)
        # read the next value
        xStr = input("Enter a number (<Enter> to quit) >> ")
    # return the list of numbers
    return numbers

def getMean(numbers):
    # calculate the mean
    sum = 0.0
    for num in numbers:
        sum = sum + num
    return sum / len(numbers)

def getStdDev(numbers, mean):
    # calculate the standard deviation
    sumDevSq = 0.0
    for num in numbers:
        dev = num - mean
        sumDevSq = sumDevSq + dev * dev
    return math.sqrt(sumDevSq / (len(numbers) - 1))

def printResults(numbers, mean, stdDev):
    # print the results
    print("The numbers are:", numbers)
    print("The mean is:", mean)
    print("The standard deviation is:", stdDev)

# call the main function
main()
