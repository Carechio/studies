def factorial num
    if num == 0
        return 1
    else 
        return num * factorial(num - 1)
    end
end

def reverse string
    reversed = String.new
    for i in 1..string.length
        reversed += string[string.length - i, 1];
    end
    return reversed
end

def sort array
    begin
        troca = false
        for i in 0..array.length - 2
            if array[i] > array[i + 1]
                aux = array[i]
                array[i] = array[i + 1]
                array[i + 1] = aux
                troca = true
            end
        end
    end until troca == false
    return array
end

def upcase string
    alfabeto = { 'a' => "A", 'b' => "B", 'c' => "C", 'd' => "D", 'e' => "E",
        'f' => "F", 'g' => "G", 'h' => "H", 'i' => "I", 'j' => "J", 'k' => "K",
        'l' => "L", 'm' => "M", 'n' => "N", 'o' => "O", 'p' => "P", 'q' => "Q", 
        'r' => "R", 's' => "S", 't' => "T", 'u' => "U", 'v' => "V", 'w' => "W", 
        'x' => "X", 'y' => "Y", 'z' => "Z" }
    alfabeto.each do |low, up|
        string.gsub!(low, alfabeto[low])
    end
    return string
end