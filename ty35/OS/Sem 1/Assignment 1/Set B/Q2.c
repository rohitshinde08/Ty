#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
int main()
{
	int pid;
	pid=getpid();
	printf("Current process id is:%d\n",pid);
	printf("Forking child process...\n");
	pid=fork();
	if(pid<0)
	{
		printf("\n process can not created.");
	}
	else
	{
		if(pid==0)
		{
			printf("\n Child process is sleeping...");
			sleep(5);
			printf("\n orphan child parent id:%d",getpid());
		}
		else
		{
			printf("\nParent process(%d)completed...\n",getppid());
		}
	}
return 0;
}
