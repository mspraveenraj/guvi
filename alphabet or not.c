#include <stdio.h>
#include <conio.h>
void main()
{
    char c;
    scanf("%c",&c);
    if( (c>='a' && c<='z') || (c>='A' && c<='Z'))
        printf("Alphabet");
    else printf("Not Alphabet");
    getch();
}