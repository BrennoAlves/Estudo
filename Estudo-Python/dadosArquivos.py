from os import path
import time

def DadosArquivos():
    ArquivoExiste = path.exists("NovoArquivo.txt")
    seDiretorio = path.isdir("NovoArquivo.txt")
    pathArquivo = path.realpath("NovoArquivo.txt")
    pathRelativo = path.realpath("NovoArquivo.txt")
    dataCriacao = time.ctime(path.getctime("NovoArquivo.txt"))
    dataModificar = time.ctime(path.getmtime("NovoArquivo.txt"))

    print(ArquivoExiste)
    print(seDiretorio)
    print(pathArquivo)
    print(pathRelativo)
    print(dataCriacao)
    print(dataModificar)

DadosArquivos()
