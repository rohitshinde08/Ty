#include<stdio.h>
#include<sys/wait.h>
#include<unistd.h>
#include<sys/types.h>
#include<sys/stat.h>
#include<fcntl.h>
#include<stdlib.h>
#include<string.h>

void make_toks(char *s,char *tok[])
{
     int i=0;
     char *p;
     
     p = strtok(s," ");
     while (p!=NULL)
     {
           tok[i++]=p;
           p=strtok(NULL," ");
     }
     tok[i]=NULL;
}

int main()
{
    char buff[80],*args[10];
    int pid;
    
    while(1)
    {
         printf("myshell$");
         fflush(stdin);
         fgets(buff,80,stdin);
         buff[strlen(buff)-1]='\0';
         make_toks(buff,args);
    }
    return 0;
}
