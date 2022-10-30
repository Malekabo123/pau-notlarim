# Kodunuzu bu dosya içine yazınız
=begin
Kodunuzun düzgün çalışması için
input metodunun içindeki metni boş bırakın
gets.chomp
yeterli...
=end

m = gets.chomp

puts m[0] + m[1..-1].gsub(m[0], "*")