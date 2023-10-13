#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<dirent.h>
char comm[100],*ptr;
char*args[10];
int tot_arg;
int list(char option,char dirname[])
{
	DIR *dp;
	struct dirent *dent;
	struct stat buff;
	char orgdir[100];
	int cnt,reply;
	switch(option)
	{
		case 'f':
		 	dp=opendir(dirname);
		 	if(dp==NULL)
		 	{
		 		printf("\nUnable to open dir!!");
		 		exit(0);
		 	}
		 	dent=readdir(dp);
		 	while(dent!=NULL)
		 	{
		 		printf("\n %s",dent->d_name);
		 		dent=readdir(dp);
		 	}
		 	printf("\n");
		 	break;
	      case 'n':
	      		cnt=0;
	      		dp=opendir(dirname);
	      		if(dp==NULL)
	      		{
	      			printf("\nUnable to Open dir!!!");
	      			exit(0);
	      		}
	      		dent=readdir(dp);
	      		while(dent!=NULL)
	      		{
	      			cnt++;
	      			dent=readdir(dp);
	      			
	      		}
	      		printf("\nTotal dir entries: %d\n",cnt);
	      		closedir(dp);
	      		break;
	      	case 'i':
	      		dp=opendir(dirname);
	      		if(dp==NULL)
	      		{
	      		printf("\nUnable to open dir!!!");
	      		exit(0);
	      		}
	      		dent=readdir(dp);
	      		while(dent!=NULL)
	      		{
	      		reply=strcat(dent->d_name,&buff);
	      		if(reply<0)
	      		  printf("\nError");
	      		else
	      		  printf("\n%s &d",dent->d_name,buff.stdin);
	      		  dent=readdir(dp);
	      		}
	      		closedir(dp);
	      		break;
	      		}
   return 0;	      		
}
int sep_arg()
{
	int i,j;
	i=j=tot_arg=0;args[tot_arg]=(char*)malloc(sizeof(char)*20);
	for(i=0; comm[i]!='\0'; i++)
	{
	if(comm[i]==' ')
	{
		args[tot_arg][j]='\0';
		tot_arg++;
		args[tot_arg]=(char*)malloc(sizeof(char)*2);
		j=0;
	}
	else
	{
		args[tot_arg][j]=comm[i];
		j++;
	}
     }
	args[tot_arg][j]='\0';
	return;
}
int getcomm()
{
	int len;
	ptr=fgets(comm,80,stdin);
	len=strlen(comm);
	comm[len-1]='\0';
	return;
}
int take_action()
{
	char str[100];
	pid_t pid;
	int status;
	ptr=comm;
	if(ptr==NULL)
	   exit(0);
	if(strlen(comm)<=1)
	   return;
        if(strcmp(args[0],"list"))
           list(*args[1][2]);
        else
           if((pid=fork())<0)
           	{
           		printf("Unable to create process....");
           		
           	}
           else
           {
              if(pid==0)
                {
               	execvp(args[0],args);
               	strcpy(str,"./");
               	strcat(str,args[0]);
               	execvp(str,args);
               	printf("\n %s:command not found",comm);
               	exit(0);
               	}
               else
               {
                 waitpid(pid,&status,0);
                 }
                 }
            return 0;
}
int main()
{
do
{
	printf("MyShell$");
	getcomm();
	sep_arg();
	take_action();
}while(1);
}








