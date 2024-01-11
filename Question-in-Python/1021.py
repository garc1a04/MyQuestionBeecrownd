Nota = float(input()) 

Nota+=0.001 #--Muitas

#Notas de 100 a 2 reais

Nota100=int(Nota//100) #--Resultado do valor dessa Nota
R100= Nota%100 #-- O restante do valor retirado


Nota50= int(R100//50)
R50 = R100%50

Nota20 =int(R50//20)
R20 = R50%20



Nota10 = int(R20//10)
R10 = R20%10


Nota5=int(R10//5)
R5=R10%5

Nota2 = int(R5//2)
R2 = R5%2

#Fim das notas

#começo das moedas de 1 ate 0.01

Moeda1= int(R2//1)#--Resultado do valor dessa Moeda
R_moeda1=R2%1#--O restante do valor retirado

moeda50= int(R_moeda1//0.50)
R_moeda50=R_moeda1%0.50

Moeda25= int(R_moeda50//0.25)
R_moeda25=R_moeda50%0.25

moeda10 = int(R_moeda25//0.10)
R_moeda10=R_moeda25%0.10


moeda05= int(R_moeda10//0.05)
R_moeda05= R_moeda10%0.05

moeda01= int(R_moeda05//0.01)


#-- Saida de Dados --#
print ("NOTAS:")
print(f"{Nota100} nota(s) de R$ 100.00")
print(f"{Nota50} nota(s) de R$ 50.00")
print(f"{Nota20} nota(s) de R$ 20.00")
print(f"{Nota10} nota(s) de R$ 10.00")
print(f"{Nota5} nota(s) de R$ 5.00")
print(f"{Nota2} nota(s) de R$ 2.00")
print("MOEDAS:")
print(f"{Moeda1} moeda(s) de R$ 1.00")
print(f"{moeda50} moeda(s) de R$ 0.50")
print(f"{Moeda25} moeda(s) de R$ 0.25")
print(f"{moeda10} moeda(s) de R$ 0.10")
print(f"{moeda05} moeda(s) de R$ 0.05")
print(f"{moeda01} moeda(s) de R$ 0.01")