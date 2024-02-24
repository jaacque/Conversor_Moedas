def display_menu():
     print("\nMenu de opções: \n"
             "1 - Dolar para Real \n"
             "2 - Real para Dolar \n"
             "3 - Euro para Real \n"
             "4 - Real para Euro \n"
             "5 - Sair \n")

def dolar_real():
     value = float(input("Informe o valor em dolar: "))
     convertion = value * 4.94
     print("O valor convertido em real é de R${:.2f}" .format(convertion))

def real_dolar():
     value = float(input("Informe o valor em real: "))
     convertion = value / 4.94
     print("O valor convertido em dolar é de US${:.2f}" .format(convertion))

def euro_real():
     value = float(input("Informe o valor em euro: "))
     convertion = value * 5.34
     print("O valor convertido em real é de R${:.2f}" .format(convertion))
   
def real_euro():
     value = float(input("Informe o valor em real: "))
     convertion = value / 5.34
     print("O valor convertido em euro é de €{:.2f}" .format(convertion))

while True:
    display_menu()
    option = input("Informe a opção: ")

    if option == "1":
        dolar_real()
    elif option == "2":
        real_dolar()
    elif option == "3":
        euro_real()
    elif option == "4":
        real_euro()
    elif option == "5":
        print()
        print("*" * 16)
        print("Sessão encerrada")
        print("*" * 16)
        print()
        break
    else:
        print("Opção inválida. \nTente novamente.")