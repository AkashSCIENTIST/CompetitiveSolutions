def sort012(arr, n):
	
    temp = ([0] * arr.count(0)) + ([1] * arr.count(1)) + ([2] * arr.count(2))
    arr[:] = temp
