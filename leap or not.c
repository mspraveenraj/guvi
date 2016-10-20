#include <stdio.h>
#include <conio.h>
void main()
{
    int yr;
    scanf("%d",&yr);
    if(yr%4==0)
        printf("Leap year");
    else printf("Not Leap year");
    getch();
}
