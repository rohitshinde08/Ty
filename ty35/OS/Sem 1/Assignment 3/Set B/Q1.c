#include<stdio.h>
int main()
{
	int at[10],bt[10],temp[10];
	int i,s,count=0,time,limit;
	double wt=0,tat=0,end;
	float avg_wt,avg_tat;
	printf("Enter Total Processes:");
	scanf("%d",&limit);
	for(i=0;i<limit; i++)
	{
	printf("Enter arrival time of P%d:",i+1);
	scanf("%d",&at[i]);
	printf("Enter Burst time of P%d:",i+1);
	scanf("%d",&bt[i]);
	}
	bt[9]=9999;
	for(time=0; count!=limit; time++)
	{
	 s=9;
	 for(i=0; i<limit; i++)
	 {
	 	if(at[i]<=time && bt[i]<bt[s] && bt[i]>0)
	 	{
	 		s=i;
	 	}
	 }
	 bt[s]=-i;
	 if(bt[s]==0)
	 {
	 	count++;
	 	end=time+1;
	 	wt=wt+end-at[s]-temp[s];
	 	tat=tat+end-at[s];
	 }
       }
       printf("\n Avg wt:",wt/limit);
       printf("\n Avg tat:",tat/limit);
}

