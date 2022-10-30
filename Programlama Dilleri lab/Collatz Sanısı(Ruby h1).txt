# Taş-kağıt-makas
# Kodunuzu bu dosya içine yazınız
=begin
Kodunuzun düzgün çalışması için
input metodunun içindeki metni boş bırakın
gets.chomp
yeterli...
=end

sayi = gets.chomp.to_i
i=0

while sayi!= 1
    if sayi%2 == 0
        sayi /= 2
        i += 1
    else 
        sayi = 3*sayi+1
        i += 1
    end
end

puts i