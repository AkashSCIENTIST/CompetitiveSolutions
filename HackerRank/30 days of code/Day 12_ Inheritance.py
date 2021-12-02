

class Student(Person):
    #   Class Constructor
    #   
    #   Parameters:
    #   firstName - A string denoting the Person's first name.
    #   lastName - A string denoting the Person's last name.
    #   id - An integer denoting the Person's ID number.
    #   scores - An array of integers denoting the Person's test scores.
    #
    # Write your constructor here
    def __init__(self,f,l,i,s):
        self.firstName = f
        self.lastName = l
        self.idNumber = i
        self.scores = s
    

    #   Function Name: calculate
    #   Return: A character denoting the grade.
    #
    # Write your function here
    def calculate(self):
        s = sum(self.scores)/len(self.scores)
        
        if (s >= 90 and s <= 100):
            return "O"
        elif (s >= 80 and s < 90):
            return "E"
        elif (s >= 70 and s < 80):
            return "A"
        elif (s >= 55 and s < 70):
            return "P"
        elif (s >= 40 and s < 55):
            return "D"
        else:
            return "T"

