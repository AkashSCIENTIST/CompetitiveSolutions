

#Write MyBook class
class MyBook(Book):
    def __init__(self,t,a,p):
        super().__init__(t,a)
        self.price = p
    def display(self):
        print('''Title: {}
Author: {}
Price: {}'''.format(self.title, self.author, self.price))

