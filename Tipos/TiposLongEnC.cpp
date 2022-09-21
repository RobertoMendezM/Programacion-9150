/*
    Programa que muestra los valores para el mínimo y màximo valor de
    los tipos primitivos de punto flotante y enteros

    Tema: Tipos primitivos de punto flotante y enteros

    Fuentes base: *Uzayr (2022). Mastering C++ Programming Language, CRC Press
                   pág 134 (editado)
                  ** https://docs.microsoft.com/en-us/cpp/cpp/fundamental-types-cpp?view=msvc-170
                     (Documnetación de tipos en Visual C++ 2022)

    version 14/Sep/2022
    author  Roberto Méndez Méndez
*/

#include <iostream>


using namespace std;

int main()
{
    cout << "Tipos de Datos en C++!\n";

    cout << "\tfloat \t\t"<< "double \t\t" << "long double" << endl;
    cout << "Min : " << FLT_MIN << "\t" << DBL_MIN << "\t" << LDBL_MIN << endl;
    cout << "Max : " << FLT_MAX << "\t" << DBL_MAX << "\t" << LDBL_MAX << endl;

    cout << endl << "\tint \t\t" << "long \t\t" << "long long" << endl;
    cout << "Min : " << INT_MIN << "\t" << LONG_MIN << "\t" << LLONG_MIN << endl;
    cout << "Max : " << INT_MAX << "\t" << LONG_MAX << "\t" << LLONG_MAX << endl;

    cout << endl << "\tint32 \t\t" << "int64" << endl;
    cout << "Min : " << INT32_MIN << "\t" << INT64_MIN << endl;
    cout << "Max : " << INT32_MAX << "\t" << INT64_MAX << endl;
}
