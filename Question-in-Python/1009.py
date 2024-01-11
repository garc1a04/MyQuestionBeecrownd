NomeVendedor= (input())#--Entrada de dados
SalarioFixo = float(input())
VendasEfetuadas = float(input())

bonus= VendasEfetuadas*0.15

SalarioFinal = bonus+ SalarioFixo

print("TOTAL = R$ %0.2f" % SalarioFinal)#--Saida de dados