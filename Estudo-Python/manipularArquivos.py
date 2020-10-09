def EscreveArquivo():
    arquivo = open("NovoArquivo.txt", "w+")

    arquivo.write("Linha gerado com a funcao EscreveArquivo \r\n")

    arquivo.close()


#EscreveArquivo()

def AlterarArquivo():
    arquivo = open("NovoArquivo.txt", "a+")

    arquivo.write("Linha gerado com a funcao AlteraArquivo \r\n")

    arquivo.close()

AlterarArquivo()