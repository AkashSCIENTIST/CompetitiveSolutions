#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    // Complete the code.
    int n1,n2;
    cin >> n1 >> n2;
    for (int n=n1; n <= n2;n++){
        switch(n){
        case 0 : cout << "zero\n"; break;
        case 1 : cout << "one\n";break;
        case 2 : cout << "two\n";break;
        case 3 : cout << "three\n";break;
        case 4 : cout << "four\n";break;
        case 5 : cout << "five\n";break;
        case 6 : cout << "six\n";break;
        case 7 : cout << "seven\n";break;
        case 8 : cout << "eight\n";break;
        case 9 : cout << "nine\n";break;
        default : (n%2)?(cout << "odd\n"):(cout << "even\n");
    }
    }
}
