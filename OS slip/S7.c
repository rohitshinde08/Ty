#include <stdio.h>
#include <sys/wait.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <stdlib.h>
#include <string.h>

char comm[100] ,*ptr,*tot;
char *args[10];
int tot_arg;
int typeline(char *option,char *fname);
void take_action();
void sep_arg();
void getcomm();
int main()
{
	do
	{
		printf("Myshell$");
		getcomm();
		sep_arg();
		take_action();
	}
	while (1);
}
 
void sep_arg()
 {
 	int i,j,tok;
 	char *token;
 	i=j=tok=0;
 	token=strtok(comm," ");
 	while (token!=NULL)
 	{
 		args[tok]=(char*)malloc(20);
 		strcpy(args[tok++],token);
 		token=strtok(NULL," ");
 	}
 	return;
 }
 
 void getcomm()
 {
 	int len;
 	ptr=fgets(comm,80,stdin);
 	len=strlen(comm);
 	comm[len-1]='\0';
 	return;
 }
 
void take_action()
{
 	char str[100];
 	pid_t pid;
 	int status;
 	ptr=comm;
 	if (strlen(comm)<=1)
 		return;
        if (strcmp((args[0]),"typeline")==0)
            typeline(args[1],args[2]);
        else
        {
        	pid=fork();
        	if (pid==0)
        	{
        		execvp(args[0],args);
        		strcpy(str,"./");
        		strcat(str,args[0]);
        		execvp(str,args);
        		printf("\n %s :command is not found!",comm);
        		exit (0);
        	}
        	else
        		waitpid(pid,&status,0);
        }    
}

int typeline(char *option, char *fname) {
    int n = atoi(option);

    if (n <= 0) {
        printf("Invalid value for 'n'. Please specify a positive integer.\n");
        return 1;
    }

    FILE *file = fopen(fname, "r");
    if (file == NULL) {
        perror("fopen");
        return 1;
    }

    char **lines = (char **)malloc(n * sizeof(char *));
    if (lines == NULL) {
        perror("malloc");
        fclose(file);
        return 1;
    }

    for (int i = 0; i < n; i++) {
        lines[i] = (char *)malloc(100); 
        if (lines[i] == NULL) {
            perror("malloc");
            for (int j = 0; j < i; j++) {
                free(lines[j]);
            }
            free(lines);
            fclose(file);
            return 1;
        }
    }

    int lineCount = 0;
    while (fgets(lines[lineCount % n], 100, file) != NULL) {
        lineCount++;
    }

    fclose(file);

    if (lineCount < n) {
        n = lineCount;
    }

    int i = (lineCount % n) % n;
    for (int j = 0; j < n; j++) {
        printf("%s", lines[i]);
        i = (i + 1) % n;
    }

    for (int i = 0; i < n; i++) {
        free(lines[i]);
    }
    free(lines);

    return 0;
}
