from datetime import date
from datetime import time
from datetime import datetime
from datetime import timedelta


hoje = datetime.today()


def DataHoje():
    print(hoje.day, hoje.month,  hoje.year)
    # print(hoje.weekday())
    dias = ["seg", "ter", "qua", "qui", "sex", "sab", "dom"]
    print(dias[hoje.weekday()])

    data = datetime.now()
    tempo = datetime.time(data)
    print(tempo)
# DataHoje()

#print(hoje.strftime("Data e hora local: %c"))
#print(hoje.strftime("A hora atual é: %I:%M:%S %p"))


def deltaTempo():
    delta = timedelta(days=86, hours=6532, minutes=7645)
    print(delta)

    hoje = datetime.now()
    print("Data no futuro: ", hoje+delta)
    print("Data no passado: ", hoje-delta)


#deltaTempo()

def QuantosDiasFaltam(ano, mes, dia):
    hoje = date.today()
    dataProcurada = date(ano, mes, dia)
    quantosDias = dataProcurada - hoje

    mensagemRetorno = "Faltam " + str(quantosDias).replace("days, 0:00:00", "") + " dias para a data " + dataProcurada.strftime("%d/%m/%y")
    print(mensagemRetorno)

QuantosDiasFaltam(2020, 9, 10)
