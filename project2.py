import random

comp = random.randint(1,100)
attempts = 1
guess = int(input("guess the number it will between 1 to 100   :"))
while(True):
    if(guess>comp):
        guess = int(input("guess another number is too big   :"))
        attempts +=1
    elif(guess<comp):
        guess = int(input("guess another number is too small   :"))
        attempts +=1

    else:
       print(f"yeah thats the number! you guessed right in {attempts} attempts")
       break






