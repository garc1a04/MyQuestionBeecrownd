import math

A,B,C = map(float,input().split(' '))#--Entrada de Dados

if (A>0):
    Delta=(B**2)-(4*A*C)
    if (Delta > 0):
        
        E = math.sqrt(Delta) #--Aqui vc pode usar a biblioteca math ou elevar delta por 1/2 :)
        
        R1 = (-B+E)/(2*A)

        R2 = (-B-E)/(2*A)

        print("R1 = %0.5f" % R1)    
        print("R2 = %0.5f" % R2)
    
    else:
        print("Impossivel calcular")
else:
    print("Impossivel calcular")