#include<iostream>
using namespace std;

//Do it in DEV-C++


class Complex {
    public:
    int real , imaginal;
    
    Complex(int re, int im){
        real = re;
        imaginal = im;
    }
    
    Complex operator-(Complex value){
        Complex temp(real-value.real , imaginal-value.imaginal);
        return temp;
    }
    
    Complex operator-(){
        Complex temp(-real , -imaginal);
        return temp;
    }
    
    Complex operator+(Complex value){
        Complex temp(real+value.real , imaginal+value.imaginal);
        return temp;
    }
    
    Complex operator*(Complex value){
        Complex temp(real*value.real-imaginal*value.imaginal , real*value.imaginal+imaginal*value.real);
        return temp;
    }
    
    friend ostream & operator<<(ostream & out, Complex c){
        out << "(" << c.real << "," << c.imaginal << "i)";
        return out;
    }
    
    int operator[](int i){
        if(i==0)
            return real;
        else if(i==1)
            return imaginal;
    }
};