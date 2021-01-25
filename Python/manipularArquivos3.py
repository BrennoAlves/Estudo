import os
from os import path
import shutil
from shutil import make_archive
from zipfile import ZipFile

def CriaZipModo1():
    shutil.make_archive("ArquivoCompactado", "zip", "/home/dex/Documentos/Repositorio/Automação-PyAutoGUI/Estudo-Python/" )

CriaZipModo1()