#I made this from a Python challenges website where there were a ton of little projects to complete

import random

score = 0

wants_to_play = True

def play_game():
    global die_roll
    die_roll = random.randint(1, 6)
    global first_question
    first_question = int(input("What do you think the roll will be?"))
    check_correct()
    check_for_want()

def check_correct():
    if first_question == die_roll:
        print("correct!")
    else:
        print("not correct!")

def check_for_want():
    global answer
    answer = input("Do you want to try again?")
    if answer == "yes":
        print("ok!")
    else:
        global wants_to_play
        wants_to_play = False


while wants_to_play == True:
    play_game()




