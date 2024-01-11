Segundos = int(input())

Hora=Segundos//60**2 #--Resultado das horas

Segundo = Segundos-(Hora*60**2) #-- pega os restantes dos segundos

Minutos = Segundo//60 #--Resultado dos minutos
segundo = Segundo-Minutos*60 #--Resultado final dos segundos


print('{0}:{1}:{2}'.format(Hora,Minutos,segundo))
"""
a função .format(), ela formata em ordem dentro de chaves
sendo 0 o primeiro
"""