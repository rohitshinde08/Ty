#include<stdio.h>
#include<sys/wait.h>
#include<unistd.h>
void ChildProcess();
void ParentProcess();
int main()
{
    pid_t pid;
    pid=fork();
    if (pid==0)
    {
       sleep(1);
       ChildProcess();
    }
    else
    {
       ParentProcess();
    }
    return 0;
}
void ChildProcess()
{
     printf("\nMy id : %d\n",getpid());
     printf("my parent id : %d",getppid());
}
void ParentProcess()
{
     printf("\nMy id : %d\n",getppid());
     printf("my Child id : %d",getpid());
}

