# Taş-kağıt-makas
# Kodunuzu bu dosya içine yazınız
=begin
Kodunuzun düzgün çalışması için
input metodunun içindeki metni boş bırakın
gets.chomp
yeterli...
=end

sayi = gets.chomp.to_i

sum = 0
for i in (1..sayi/2)
    if sayi%i == 0
        sum += i
    end
end

if sayi == sum
    puts "mükemmel"
else
    puts "mükemmel değil"
end   
        
        
        
        