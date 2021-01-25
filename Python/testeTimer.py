from datetime import date
from datetime import time
from datetime import datetime
from datetime import timedelta


hoje = datetime.today()
hora = hoje.strftime

print(hoje.strftime("%c"))
