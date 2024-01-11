X = int(input()) #--Entrada de dados

A = X//365 #--Quantidade de Anos
R = X%365 #--Restante dos dias
M = R//30 #--Quantidade de meses
D = R%30 #--O restante de dias

print(f'{A} ano(s)\n{M} mes(es)\n{D} dia(s)')