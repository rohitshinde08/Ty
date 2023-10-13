#include<stdio.h>
#include<sys/types.h>
int main()
{
	pid_t pid;
	pid=fork();
	int retnice=nice(2),i;
	if(pid==0)
	{
		retnice=nice(-5);
		printf("Child gets higher CPU priority %d\n",retnice);
	}
	else
	{
		retnice=nice(4);
		printf("parent gets higher CPU priority %d\n",retnice);
		sleep(1);
	}
	return 0;
}

