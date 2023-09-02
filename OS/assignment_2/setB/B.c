#include<stdio.h>
#include<unistd.h>
#include<sys/wait.h>
#include<sys/types.h>
#include<stdlib.h>
#include<string.h>
#include<sys/stat.h>
#include<fcntl.h>
#include<dirent.h>
#define MAX_INPUT_SIZE 1024
#define MAX_TOKENS 100
void maketoks(char *s,char *tok[])
{
     int i=0;
     char *p;
     p=strtok(s," ");
     while (p!=NULL)
     {
           tok[i++]=p;
           p=strtok (NULL," ");
     }
     tok[i]=NULL;
}
void list_files(const char *dn,char op)
{
     
     DIR *dp;
     //printf("dir is %s",dirname)
     struct dirent *entry;
     int dc=0,fc=0;
     dp=opendir(dn);
     if (dp==NULL)
     {
        perror("error opening directory");
        return;
     }
     switch (op)
     {
            case 'f':while ((entry = readdir(dp)))
                     {
                           if (entry->d_type==DT_REG)
                              printf("%s\n",entry->d_name); 
                     }
                     break;
            case 'n':while ((entry = readdir(dp)))
                     {
                           if (entry->d_type==DT_DIR)dc++;
                           if (entry->d_type==DT_REG)fc++;
                     }
                     printf("%d Dir(s)\t%d file(s)\n",dc,fc); 
                     break;
            case 'i':while ((entry = readdir(dp)))
                     {
                           //if (entry->d_type==DT_DIR)
                           if (entry->d_type==DT_REG)
                           printf("%s\t%d\n",entry->d_name,entry->d_fileno);
                     } 
                     break;
            closedir(dp);
     }
}
int main()
{
    char buff[80],*args[10];
    int pid;
    while (1)
    {     
          printf("\nmyshells ");
          fflush(stdin);
          fgets(buff,80,stdin);
          buff[strlen(buff)-1]='\0';
          maketoks(buff,args);
          if (strcmp(args[0],"list")==0)
              list_files(args[2],args[1][0]);
          else
          {
              pid=fork();
              if (pid>0)
                 wait(NULL);
              /*else
              {
                  if (execvp(args[0],args)==-1)
                     printf("\nBad command\n");
              }*/
          }
    }
    return 0;
}
