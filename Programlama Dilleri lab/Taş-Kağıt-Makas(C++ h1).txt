/* Taş-kağıt-makas
   Kodunuzu bu dosya içine yazınız
*/
#include<iostream>
#include<string>
using namespace std;

int main() {
    string o1,o2;
    cin >> o1 >>o2;
    
    if(o1==o2)
        cout << "berabere";
    else if(o1=="taş" && o2=="makas" || o1=="kağıt" && o2=="taş" || o1=="makas" && o2=="kağıt")
        cout << "birinci oyuncu kazandı";
    else
        cout << "ikinci oyuncu kazandı";
    
    return 0;
}