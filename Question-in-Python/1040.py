Nota1,Nota2,Nota3,Nota4 = map(float,input().split(' '))#--Entrada de dados

Media = ((Nota1*2)+(Nota2*3)+(Nota3*4)+(Nota4*1))/10

print('Media: %0.1f' % Media )

if (Media >= 7):
    print('Aluno aprovado.' )

elif(Media<5):
    print('Aluno reprovado.')

if (5.0<=Media<=6.9):
    print('Aluno em exame.')

    Nota5 = float(input())
    print('Nota do exame: %0.1f' % Nota5)
    Media2 = (Media+Nota5)/2

    if (Media2 >= 5.0):
            print('Aluno aprovado.')
    else:
        print('Aluno reprovado.')

    print('Media final: %0.1f' % Media2)