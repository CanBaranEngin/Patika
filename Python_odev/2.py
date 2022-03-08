##2- Verilen listenin içindeki elemanları tersine döndüren bir fonksiyon yazın. Eğer listenin içindeki elemanlar da liste içeriyorsa onların elemanlarını da tersine döndürün. Örnek olarak:

def rev(liste):
    for s in liste:
        if type(s)==list:
            s.reverse()
        liste.reverse()   
    return liste
print(rev([[1, 2], [3, 4], [5, 6, 7]]))

