def is_leap(year):
    leap = False
    
    if year%4 == 0:
        leap = True
        
    if year == 2100:
        leap = False
    
    return leap

