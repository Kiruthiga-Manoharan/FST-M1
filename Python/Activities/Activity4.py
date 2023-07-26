name1 = input("What is user1 name?")
name2 = input("What is user2 name?")
while True:
    user1_answer = input(name1 + ", Do you want to select rock, paper or scissors? ").lower()
    user2_answer = input(name2 + ", Do you want to select rock, paper or scissors? ").lower()
    if user1_answer==user2_answer:
        print("It's a tie")
    elif user1_answer=='rock':
        if user2_answer=='scissors':
            print("Rock wins")
        else:
            print("Paper wins!")
    elif user1_answer == 'scissors':
        if user2_answer == 'paper':
            print("Scissors win!")
        else:
            print("Rock wins!")
    elif user1_answer == 'paper':
        if user2_answer == 'rock':
            print("Paper wins!")
        else:
            print("Scissors win!")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")
    attempt2 = input("Do you want to play again? ").lower()
    if (attempt2=='yes'):
        pass
    elif (attempt2=='no'):
        raise SystemExit
    else:
        print("Invalid option")
        raise SystemExit