#this was just so I could help a friend out with his math problems (he insisted on using Google but I said no)

import math

a = int(input("Enter the coefficients of a: "))
b = int(input("Enter the coefficients of b: "))
c = int(input("Enter the coefficients of c: "))

d = b**2-4*a*c

if d < 0:
    print ("This equation has no real solution")
elif d == 0:
    one = (-b+math.sqrt(b**2-4*a*c))/2*a
    print ("This equation has one solutions: "), d
else:
    pos = (-b+math.sqrt((b**2)-(4*(a*c))))/(2*a)
    neg = (-b-math.sqrt((b**2)-(4*(a*c))))/(2*a)
    print ("This equation has two solutions: ", pos, " or", neg)
