/* Mükemmel sayı
   Kodunuzu main fonksiyonunun içine yazınız.
*/

#include<iostream>
using namespace std;

int main() {
    int sayi;
    int toplam = 0 ;

    cin >> sayi;
    
    for (int i = 1 ;i<sayi ; i++)
        if (sayi%i == 0)
            toplam += i;
            
    if (toplam == sayi)
        cout << "mükemmel";
    else
        cout << "mükemmel değil";
    
    return 0;
}