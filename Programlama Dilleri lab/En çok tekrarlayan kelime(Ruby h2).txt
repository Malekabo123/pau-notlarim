# Kodunuzu bu dosya içine yazınız
=begin
Kodunuzun düzgün çalışması için
input metodunun içindeki metni boş bırakın
gets.chomp
yeterli...
=end

girdi = gets.chomp

girdi = girdi.gsub(".", "")
girdi = girdi.gsub(",", "")
girdi = girdi.gsub("’", "")
girdi = girdi.gsub("-", " ")

girdi = girdi.downcase

girdi = girdi.split(" ")

h = Hash.new

(girdi).each do |word|
    if h.has_key? word
        h[word] += 1
    else
        h[word] = 1
    end
end


h = h.sort_by {|_key, value| [value , _key]}.reverse.to_h


for i in h.keys.first(5)
    puts i + " " + h[i].to_s
end

