import random

l1=["engaded","closed"]
l2=["ACC","NGN","DSNP"]

filter=[]
for i in range(0,700):

    randomVal=""
    randomo_output=[]
    randomVal1=random.choice(l1)
    randomo_output.append(randomVal1)
    randomVal2=random.choice(l2)
    randomo_output.append(randomVal2)
   

    if randomo_output not in filter:

        filter.append(randomo_output)

    
for combinations in filter:
    print(combinations)


