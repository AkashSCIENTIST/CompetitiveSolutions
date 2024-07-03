# Enter your code here. Read input from STDIN. Print output to STDOUT
import numpy
arr = list(map(float, input().split(" ")))
numpy.set_printoptions(sign=' ')
my_array = numpy.array(arr)
print(numpy.floor(my_array))
my_array = numpy.array(arr)
print(numpy.ceil(my_array))
my_array = numpy.array(arr)
print(numpy.rint(my_array))
