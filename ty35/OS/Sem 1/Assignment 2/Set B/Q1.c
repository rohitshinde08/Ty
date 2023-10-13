#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<sys/types.h>
#include<unistd.h>
#include<dirent.h>
char *buff,*t1,*t2,*t3,ch;
int pid;
/*void list(char t2,char *t3)
{
	DIR *dir;
	struct dirent *entry;
	int cnt=0;
	dir=opendir(t3);
	if(dir==NULL)
	{
		printf("Directry %s not found\n",t3);
		return;
	}
	switch(t2)
	{
		case 'f':
		{
			while((entry=readdir(dir))!=NULL)
			{
				printf("%s\n",entry->d_name);
			}
		break;
		}
		case 'n':
		{
			while((entry=readdir(dir))!=NULL)
				{
				cnt++;
				}
			printf("Total no of entries:%d\n",cnt);
		
		break;
		}
		case 'i':
		{
			while((entry=readdir(dir))!=NULL)
			{
				printf("\n %s\t %d",entry->d_name,entry->d_ino);
			}
		 break;
		}
		default:
		{
			printf("Invalid argument....");
		}	
	}
closedir(dir);
}*/
int list(char *option,char *fname)
{
	int ccnt,wcnt,lcnt,wflag;
	int ch;
	FILE *fp;
	int i;
	fp=fopen(fname,"r");
	if(fp==NULL)
	{
		printf("\nUnable to open file");
		exit(0);
	}
	ccnt=wcnt=lcnt=0;
	wflag=0;
	ch=fgetc(fp);
	while(ch!=EOF)
	{
	ccnt++;
	if(ch==" "|| ch=='\t')
	{
	  if(wflag==0)
		{
			wcnt++;
			wflag=1;
		}
	}
	else  if(ch=='\n')
	{
		lcnt++;
		if(wflag==0)
		{
			wcnt++;
			wflag=1;
		}
		
	}
	else
	{
		wflag=0;
	}
	ch=fgetc(fp);
	}
	if(wflag==0)
	{
		wcnt++;
		lcnt++;
	}
	fclose(fp);
	if(strcmp(option,"c")==0)
	{
		printf("\nTotal characters=%d\n",ccnt);
		
	}
	else if(strcmp(option,"w")==0)
	{
		printf("\nTotal Words=%d\n",wcnt);
	}
	else if(strcmp(option,"l")==0)
	{
		printf("\nTotal Lines=%d\n",lcnt);
	}
	else
	{
	 printf("\nInvalid");
	
	}
	return 0;
  }

int main()
{
	while(1)
	{
	printf("MyShell$");
	fflush(stdin);
	t1=(char*)malloc(80);
	t2=(char*)malloc(80);

	t3=(char*)malloc(80);
	buff=(char*)malloc(80);
	fgets(buff,80,stdin);
	scanf(buff,"%s %s %s",t1,t2,t3);
	if(strcmp(t1,"pause")==0)
	{
		exit(0);
	}
	else if(strcmp(t1,"list")==0)
	{
		list(t2[0],t3);
	}
	else
	{
		pid=fork();
		if(pid<0)
		{
			printf("Child Process is not created...\n");
		}
		else if(pid==0)
		{
			execlp("/bin",NULL);
			if(strcmp(t1,"exit")==0)
			exit(0);
			
		}
		else 
		{
		        system(buff);
			exit(0);
		}
	}
	
	}
}





























