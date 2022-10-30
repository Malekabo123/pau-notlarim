#include <iostream>
#include <vector>
using namespace std;

/*
Parametre olarak gelen matrisi kullanarak Pascal üçgenini oluşturan fonksiyonu yazınız.
Parametre referans olarak gönderilmiştir, dolayısıyla geriye bir şey döndürmeye gerek yoktur.
Bu örnek için ekrana değerler yazdırmanıza gerek yoktur, önemi de yoktur.
*/
void pascal(vector< vector< int > >& vec) {
    for (int i = 0 ; i < vec.size() ; ++i)
        vec[i][0] = 1; //make the first column = 1
        
    for (int i = 1 ; i < vec.size() ; ++i)
        for (int j = 1 ; j<=i ; ++j)
            vec[i][j] = vec[i-1][j] + vec[i-1][j-1]; //the element above it + the element in the left side of the element above it
    
}