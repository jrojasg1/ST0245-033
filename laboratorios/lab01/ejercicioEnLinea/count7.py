# -*- coding: utf-8 -*-
"""count7.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1Mx6Tk6tL4w3y_vg5BblZ4i3SOtXBidXu
"""

def count11(n):    
  cont = 0
  i = 0
  if len(n)==0:
    return cont
  else:
    if n[i:i+1] == "7":
      cont +=1
  return cont + count11(n[i+1:])


count11("777576197")