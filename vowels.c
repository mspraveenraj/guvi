#include<stdio.h>
#include<conio.h>
void main()
{
    char c;
    scanf("%c",&c);
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        printf("Vowel");
    else printf("Consonant");
    getch();
}
