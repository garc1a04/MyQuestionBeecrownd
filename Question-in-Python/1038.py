Codigo,Quantidade = map(int,input().split(' ')) #--Entrada de dados

if (Codigo == 1):
    Valor = (4.00*Quantidade)

if (Codigo == 2):
    Valor = (4.50*Quantidade)

if (Codigo == 3):
    Valor = (5.00*Quantidade)

if (Codigo == 4):
    Valor = (2.00*Quantidade)

if (Codigo == 5):
    Valor = (1.50*Quantidade)

print("Total: R$ %0.2f" %Valor)#--Saida de dados