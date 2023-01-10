# Written by: Dan Jandel C. De Ramos

maleAmount = int(input("Enter the amount of male students in the class: "))
femaleAmount = int(input("Enter the amount of female students in the class: "))

total = maleAmount + femaleAmount

malePercent = (float(maleAmount/total)*100)
femalePercent = (float(femaleAmount/total)*100)

format_malePercent = "{:.2f}".format(malePercent)
format_femalePercent = "{:.2f}".format(femalePercent)

print("Total Number of Students:", total)
print("Male Students:", maleAmount, "/", total)
print("Female Students:", femaleAmount,"/", total)
print("Percentage of Male Students:", format_malePercent, "%")
print("Percentage of Female Students:", format_femalePercent, "%")