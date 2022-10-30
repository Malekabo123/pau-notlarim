# Kodunuzu bu dosya içine yazınız
=begin
Kodunuzun düzgün çalışması için
input metodunun içindeki metni boş bırakın
gets.chomp
yeterli...
=end

toplam = 0

while(girdi=gets.chomp) != ""
    sayi = girdi.to_i
    if sayi != 0
        toplam += 1000/sayi
    end
    
    #hata yakalama icin
    #begin
    #    toplam += 1000/sayi
    #rescue ZeroDivisionError
    #end
    
    
end

puts toplam