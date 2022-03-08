#1- Bir listeyi düzleştiren (flatten) fonksiyon yazın. Elemanları birden çok katmanlı listelerden ([[3],2] gibi) oluşabileceği gibi, non-scalar verilerden de oluşabilir
flatlist=[]
def flatten(liste):
    for s in liste:
        if type(s)==list:
            flatten(s)
        else:
            flatlist.append(s) 
    return flatlist   
print(flatten([[1,'a',['cat'],2],[[[3]],'dog'],4,5]))

