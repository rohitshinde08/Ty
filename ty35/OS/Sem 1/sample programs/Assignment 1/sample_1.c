#include<stdio.h>
#include<sys/types.h>
void ChildProcess()
{
	printf("I'm child process..\n");
}
void ParentProcess()
{
	printf("I'm Parent process..\n");
}
int main()
{
	int pid;
	pid=fork();
	if(pid==0)
	{
		ChildProcess();
	}
	else
	{
		ParentProcess();
	}
	return 0;
}

