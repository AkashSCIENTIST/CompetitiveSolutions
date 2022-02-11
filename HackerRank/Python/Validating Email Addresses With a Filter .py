import re

def fun(s):
  return re.match("^[\\w-]+@[0-9a-zA-Z]+\\.[a-z]{1,3}$",s)

