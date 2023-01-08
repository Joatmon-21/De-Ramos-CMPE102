# Written by: Dan Jandel C. De Ramos

sugar = 0.03125
butter = 0.02083
flour = 0.05730

cookies = int(input("Enter the amount of cookies you wish to bake: "))

sugarTotal = float(sugar*cookies)
butterTotal = float(butter*cookies)
flourTotal = float(flour*cookies)

format_sugarTotal = "{:.2f}".format(sugarTotal)
format_butterTotal = "{:.2f}".format(butterTotal)
format_flourTotal = "{:.2f}".format(flourTotal)

print("Ingredients needed for", cookies, "pieces of cookies")
print("Sugar:", format_sugarTotal,"Cups")
print("Butter:", format_butterTotal,"Cups")
print("Flour:", format_flourTotal,"Cups")