#include<stdio.h>
void main()
{
   int i,len;
   char ch[20],temp;
   scanf("%s",ch);
   len=strlen(ch);
   for(i=0;i<len;i++)
   {
       if(i%2==0){
       temp=ch[i];
       ch[i]=ch[i+1];
       ch[i+1]=temp;
}}
    printf("%s",ch);
}
