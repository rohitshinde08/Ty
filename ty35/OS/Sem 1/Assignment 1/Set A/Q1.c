#include<stdio.h>
#include<sys/types.h>
#include<stdio.h>
#include<sys/types.h>
void ChildProcess()
{
	printf("\nI'm child process..\n");
}
void ParentProcess()
{
	printf("\nI'm Parent process..\n");
}
int main()
{
	pid_t pid;
	pid=fork();
	if(pid==0)
	{
		printf("Process ID:%d\t",pid);
		ChildProcess();
	}
	else
	{
		printf("Process ID:%d\t",pid);
		ParentProcess();
	}
	return 0;
}

