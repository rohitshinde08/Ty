#include<stdio.h>
#include<unistd.h>
void main()
{
     int pid,r;
     pid=fork();
     for (int i=1;;i++)
     {
         if (pid==0)
         {
            r=nice(-20);
            printf("Child gets higher priority %d\n",r);
            sleep(4);
         }
         else
         {
            r=nice(19);
            printf("Parent gets higher priority %d\n",r);
            sleep(4);
         }
     }
}
