#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int main()
{
int n;
printf("Enter the Number of proceses:");
scanf("%d",&n);
int at[n],bt[n],wt[n],tat[n],ct[n];
float wtavg=0,tatavg=0;
srand(time(NULL));
for(int i=0; i<n; i++)
{
	printf("Arrival time for process %d:",i+1);
	scanf("%d",&at[i]);
	printf("Fist burst time for process %d:",i+1);
	scanf("%d",&bt[i]);
}
ct[0]=at[0]+bt[0]+2;
for(int i=1; i<n; i++)
{
	int io_delay=(at[i]>ct[i-1]) ? at[i]-ct[i-1]:0;
	ct[i]=ct[i-1]+io_delay+bt[i];
}
for(int i=0; i<n; i++)
{
	int io_delay=(at[i]>ct[i-1])?at[i]-ct[i-1]:0;
	tat[i]=ct[i]-at[i];
	wt[i]=tat[i]-bt[i]-io_delay;
	wtavg+=wt[i];
	tatavg+=tat[i];
}
wtavg/=n;
tatavg/=n;
printf("Gantt chart:\n");
for(int i=0; i<n; i++)
{
	printf("P%d\t",i+1);
	
}
printf("\n");
for(int i=0; i<n; i++)
{
	printf("%d\t",at[i]);	
}
printf("%d\n",ct[n-1]);
printf("\nP\tAT\tBT\tCT\tWT\tTAT\n");
for(int i=0; i<n; i++)
{
printf("p%d\t%d\t%d\t%d\t%d\t%d\n",i+1,at[i],bt[i],ct[i],wt[i],tat[i]);
}
printf("Average Waiting time:%.2f\nAverage Turn around time:%.2f",wtavg,tatavg);
return 0;
}
