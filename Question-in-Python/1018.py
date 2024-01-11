Nota = int(input())#--Entrada de dados

print (Nota)

Nota100=Nota//100 #--Resultado da quantidade de nota
Nota = Nota%100 #--O resto que sobrou da conta de cima

print(str(Nota100)+" nota(s) de R$ 100,00")

Nota50= Nota//50
Nota  = Nota%50
print(str(Nota50)+" nota(s) de R$ 50,00")

Nota20 =Nota//20
Nota  = Nota%20

print(str(Nota20)+" nota(s) de R$ 20,00")

Nota10 = Nota//10
Nota  = Nota%10
print(str(Nota10)+" nota(s) de R$ 10,00")


Nota5=Nota//5
Nota = Nota%5
print(str(Nota5)+" nota(s) de R$ 5,00")

Nota2 = Nota//2
Nota = Nota%2
print(str(Nota2)+" nota(s) de R$ 2,00")

Nota1 = Nota//1
print(str(Nota1)+" nota(s) de R$ 1,00")