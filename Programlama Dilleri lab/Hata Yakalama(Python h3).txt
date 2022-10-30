"""
Kullanıcıdan girdileri alırken ekrana bir şey yazdırmayın.
input('') şeklinde kullanın.
Ekrana istenen değer haricinde başka bir şey yazdırmayın.
"""
girdi = input('')
toplam = 0

while girdi != "":
    try:
        girdi=int(float(girdi))
        toplam += 1000//girdi
    except:
        pass
    
    girdi = input('')

        
        
print(int(toplam))        