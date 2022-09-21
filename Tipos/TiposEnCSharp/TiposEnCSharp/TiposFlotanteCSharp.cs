/*
    Programa que muestra los valores para el mínimo y máximo valor de
    los tipos primitivos double y decimal en C#
    Muestra que el tipo decimal si puede representar 0.1


    Tema: Tipos primitivos de punto flotante: float, double and decimal

    Fuentes base: https://docs.microsoft.com/en-us/dotnet/csharp/language-reference/builtin-types/floating-point-numeric-types
                    (Documnetación de tipos en Visual C# 2022)
                  https://zetcode.com/csharp/decimal/
                    (ejemplo. modificado)
                  https://www.w3schools.com/cs/cs_comments.php
                    (comentarios)

    version 14/Sep/2022
    author  Roberto Méndez Méndez
*/

Console.WriteLine("Tipos de punto flotante en C#!");
Console.WriteLine("\tdouble \t\t\t decimal");
Console.WriteLine("Max :  " + Double.MinValue + "\t" + Decimal.MinValue);
Console.WriteLine("Max :  " + Double.MaxValue + "\t" + Decimal.MaxValue);

Console.WriteLine("\n Ejemplo de que con el tipo decimal \n si se puede " +
                      "representar el valor de 0.1 \n");
double x = 0.1 + 0.1 + 0.1;
double y = 0.3;

Console.WriteLine("\nCon 0.1 tipo double");
Console.WriteLine("0.1 + 0.1 + 0.1 = " + x);
Console.WriteLine("¿0.1 + 0.1 + 0.1 = 0.3? " + (x == y));

decimal u = 0.1m + 0.1m + 0.1m;
decimal v = 0.3m;

Console.WriteLine("Con 0.1 tipo decimal");
Console.WriteLine("0.1 + 0.1 + 0.1 = " + u);
Console.WriteLine("¿0.1 + 0.1 + 0.1 = 0.3? " + (u == v));