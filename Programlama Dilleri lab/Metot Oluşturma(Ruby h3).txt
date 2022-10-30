# Bir sayının ters faktoryelini alan metot
def ters_faktoryel(sayi)
  i = 1
  carpim =1
  while carpim < sayi
    i+= 1
    carpim *= i
  end
  
  if carpim == sayi
      return i
  else 
      raise ArgumentError
  end
  
    #while sayi.is_a? Integer and sayi >= 1
        #for i in 1..sayi/2
    #        sayi /= i
    #    end
    #end
    #raise ArgumentError

    #return i
  
end

#bak ve söyle ardışıllığında belirilen adım sayısı kadar hesaplama yapan metot
def bak_ve_soyle(baslangic, adim)
    for i in 1..adim
    don = ""
    counter =1
    previous = nil
    baslangic.each_char do |c|
        if previous == c
            counter += 1
        elsif previous != nil
            don += "#{counter}#{previous}"
            counter = 1
        end
        previous = c
    end
    don += "#{counter}#{previous}"
    baslangic = don
    
    end
    
    return don
end