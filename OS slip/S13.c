#include<stdio.h>
int main()
{
	int n,i;
	printf("Enter number of processes : ");
	scanf("%d",&n);
	int at[n],bt[n],temp[n+1],tat[n],wt[n],avgtat=0,avgwt=0;
	for (i=0;i<n;i++)
	{
		printf("Enter the at and bt P%d : ",i);
		scanf("%d%d",&at[i],&bt[i]);
	}
	temp[0]=wt[0]=tat[0]=0;
	avgtat=avgwt=0;
	for (i=1;i<n+1;i++)
	{
		temp[i]=bt[i-1]+temp[i-1];
		wt[i]=temp[i]-at[i];
	}
	for (i=0;i<n;i++)
	{
		tat[i]=wt[i]+bt[i];
		avgwt=avgwt+wt[i];
		avgtat=avgtat+tat[i];
	}
	printf("\n");
	printf("\n\nGantt Chart");
	printf("\n------------\n");
	for (i=0;i<n;i++)
	{
		printf("| P%d \t",i);}
		printf("\n------------\n");
		for (i=0;i<n+1;i++)
			printf("%d\t",temp[i]);
		printf("\n\n");
		printf("\nProcess | Arrival time | Burst time | waiting time | TAT time ");
		printf("\n--------------\n");
		for (i=0;i<n;i++)
			printf("\n P %d | %7d | %6d | %7d | %8d",i,at[i],bt[i],wt[i],tat[i]);
		avgtat=avgtat;
		avgwt=avgwt;
		printf("\nAverage Turn around time : %d ",avgtat/n);
		printf("\nAverage Waiting Time : %d ",avgwt/n);
}