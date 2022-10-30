"""
Bu programda kullanıcıdan input('') fonksiyonu ile girdi almanıza gerek yoktur.
Hesaplama için gelen değerler argümanlardadır(n ve *args gibi)
"""
def asal(n):
    liste = []
    for i in range(2,n):
        asal = True
        for bolen in range(2,i):
            if i%bolen==0:
              asal = False
              break
        if asal==True:
            liste.append(i)
    return liste


def mukemmel(n):
    toplam =0
    for i in range(1,n):
        if n % i ==0:
            toplam += i
            
    if toplam == n:
        return True
        
    else:
        return False
        
        
def asalmi(n):
    for i in range(2,n):
        if n%i==0:
          return False
    return True       

def asal_liste(*args):
    return list(map(asalmi,args))