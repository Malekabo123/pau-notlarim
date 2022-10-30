/* Collatz sanısı
   Kodunuzu main fonksiyonunun içine yazınız.
*/

#include<iostream>
using namespace std;

int main() {
    long sayi; //long because it can surpass the int boundries
    int sayac =0;
    cin >> sayi;
    
    while (sayi >1)
        if(sayi%2 == 0){
            sayi = sayi/2;
            sayac++;
        }
        else {
            sayi = 3*sayi+1;
            sayac++;
        }
        
    cout << sayac;
    return 0;
}