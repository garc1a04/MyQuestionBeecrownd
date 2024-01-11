A = float(input())

if (0 <= A<=100):

    if (0<= A <=25):
        print('Intervalo [0,25]')

    elif (25 < A <= 50):
        print("Intervalo (25,50]")

    elif (50 < A <= 75):
        print('Intervalo (50,75]')

    elif (75 < A <= 100):
        print('Intervalo (75,100]')

else:
    print('Fora de intervalo')