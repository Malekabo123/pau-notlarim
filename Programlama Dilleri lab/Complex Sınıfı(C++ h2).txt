#include<iostream>
using namespace std;


class Complex {
    public:
    int real, imaginal;
    Complex(int re , int im){
        real = re;
        imaginal = im;
    }
    
    void yazdir(){
        cout << "(" << real << "," << imaginal << "i)" << endl;
    }
    
    Complex arti(Complex value){
        Complex temp(real + value.real , imaginal + value.imaginal);
        return temp;
    }
    
    Complex eksi(Complex value){
        Complex temp(real - value.real , imaginal - value.imaginal);
        return temp;
    }
    
    Complex carpi(Complex value){
        Complex temp(real*value.real - imaginal*value.imaginal , real*value.imaginal + imaginal*value.real);
        return temp;
    }
    
    Complex eksi(){
        Complex temp(-real , -imaginal);
        return temp;
    }
};