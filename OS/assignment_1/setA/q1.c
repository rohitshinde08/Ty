#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
void ChildProcess();
void ParentProcess();
int main()
{
    pid_t pid;
    pid=fork();
    if (pid==0)
       ChildProcess();
    else if (pid>0)
       ParentProcess();
    else 
       printf("Error");
    return 0;
}
void ChildProcess()
{
     printf("I am child process. ");
     printf("My id:%d\n",getpid());
}
void ParentProcess()
{
     printf("I am parent process. ");
     printf("My id:%d\n",getppid());
}

