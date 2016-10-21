#include<stdio.h>
#include<conio.h>
void main()
{
    int s,revs=0,str;
    scanf("%d",&s);
    str=s;
    while(str!=0){
    revs=revs*10;
    revs=revs+str%10;
    str/=10;
    }
    if(s==revs)
        printf("Palindrome");
    else printf("Not Palindrome");
    getch();
}
