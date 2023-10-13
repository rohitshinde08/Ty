#include<stdio.h>
#include<stdlib.h>
#include<time.h>
 struct process
 {
 	int id,at,bt,p;
 };
 void swap(struct process *a,struct process *b)
 {
 	struct process temp=*a;
 	*a=*b;
 	*b=temp;
 }
 void prep(struct process processes[],int n)
 {
 	int curt=0,completed=0,wt[n],tat[n],rebt[n];
 	for(int i=0; i<n; i++)
 	{
 		rebt[i]=processes[i].bt;
 	}
 	while(completed<n)
 	{
 		int hp=-1;
 		int selprocess=-1;
 		for(int i=0; i<n; i++)
 		{
 			if(processes[i].at<=curt && rebt[i]>0)
 			{
 			 if(hp==-1||processes[i].p<processes[hp].p)
 			 {
 				hp=i;
 			}
 		}
 	}
 	if(hp==-1)
 	{
 		curt++;
 		continue;
 	}
 	rebt[hp]--;
 	if(rebt[hp]==0)
 	{
 		completed++;
 		tat[hp]=curt-processes[hp].at+1;
 		wt[hp]=tat[hp]-processes[hp].bt;
 		printf("P%d(%d-%d)",processes[hp].id,curt-tat[hp]+1,curt);
 	}
 	curt++;
     }
     printf("\nprocess\tTAT\tWT\n");
     for(int i=0; i<n; i++)
     {
      printf("P%d\t%d\t%d",processes[i].id,tat[i],wt[i]);
     }
     }

 int main()
 {
 	int n,q;
 	printf("Enter the number of processes...");
 	scanf("%d",&n);
 	struct process processes[n];
 	int completed[n];
 	for(int i=0; i<n; i++)
 	{
 		printf("Arrival time,Burst time & priority of process P%d\n:",(i+1));
 	        scanf("%d %d %d",&processes[i].at,&processes[i].bt,&processes[i].p);
 	}
 	for(int i=0; i<n; i++)
 	{
 	 for(int j=0; j<n-1; j++)
 	 {
 	  	if(processes[j].at>processes[j+1].at)
 	  	{
 	  		swap(&processes[j],&processes[j+1]);
 	  	} 	 
 	  }
 	}
 	printf("\nGantt chart:\n");
 	prep(processes,n);
 	return 0;
 }
