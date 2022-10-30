# Kodunuzu bu dosya içine yazınız
=begin
Kodunuzun düzgün çalışması için
input metodunun içindeki metni boş bırakın
gets.chomp
yeterli...
=end

m1 = gets.chomp
m2 = gets.chomp

puts m2[0..1] + m1[2..-1] + " " + m1[0..1] + m2[2..-1]