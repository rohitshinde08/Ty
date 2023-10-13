#include<stdio.h>
#include<stdlib.h>
struct proc_onfo
{
	int atime;
	int cpub;
}proc[20];
struct rqnode
{
 int pid,cpub;
 struct rqnode*link;
}*first=NULL,*curr,*prev,*last;
struct ganttchart
{
	int stime,pid,etime;
}gchart[20];
int i,n,ctime,gi=0,wtime[20],ttime[20];
void getprocs()
{
printf("Enter Number of procsses(n):");
scanf("%d",&n);
printf("P-ID \t A-TIME");

}
void start();
void addprocq();
void attachtoq(int);
void dispgchart();
void disptimes();
void main()
{
	getprocs();
	ctime=0;
	start();
	dispgchart();
        disptimes();
}
