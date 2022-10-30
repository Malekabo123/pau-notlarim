# Kodunuzu bu dosya içine yazınız
=begin
Kodunuzun düzgün çalışması için
input metodunun içindeki metni boş bırakın
gets.chomp
yeterli...
=end

withX = Array.new
notX = Array.new


while (girdi = gets.chomp) != ""
    if girdi.start_with? "x" 
        withX << girdi
    else
        notX << girdi
    end
end

withX.sort!   #to change the string itself, not taking a clone
notX.sort!

(withX + notX).each {|eleman| puts eleman}



