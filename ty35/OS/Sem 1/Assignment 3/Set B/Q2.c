#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#define MAX 10
typedef struct{
	int pid,arrival_time,cpu_burst,priority,turnaround_time,waiting_time;
}Process;
void swap(Process *a,Process *b)
{
	Process temp =*a;
	*a=*b;
	*b=temp;
}
void sortp(Process processes[],int n){
	for(int i=0; i<n-1; i++){
	 for(int j=0; j<n-i-1; j++)
	 {
	        if(processes[j].priority>processes[j+1].priority){
		swap(&processes[j],&processes[j+1]);
            }
	}
     }	
}
void calculate_turnaround_time(Process processes[],int n)
{
	int total_waiting_time=0;
	for(int i=0; i<n; i++)
	{
		processes[i].turnaround_time=processes[i].waiting_time+processes[i].cpu_burst;
		//total_waiting_time+=processes[i].waiting_time;
	}
	double avg_waiting_time=(double)total_waiting_time/n;
	printf("\n Avg waiting time:%.2lf\n",avg_waiting_time);
}
void calculate_waiting_time(Process processes[],int n){
          processes[0].waiting_time=0;
          for(int i=1; i<n; i++)
          {
          	processes[i].waiting_time=processes[i-1].waiting_time+processes[i-1].cpu_burst;
          }
}
void generate_random_cpu(Process processes[],int n)
{
	srand(time(NULL));
	for(int i=0; i<n; i++)
	{
		processes[i].cpu_burst=rand()%10+1; 
	}
}
int main(){
	int n; Process processes[MAX];
	printf("Enter Number of Processes:");
	scanf("%d",&n);
	if(n<=0 || n>MAX){
	printf("Invalid no of processes");
	return 1;
	}
	printf("Enter arrival time,CPU burst and priority for each process:\n");
	for(int i=0; i<n; i++){
		processes[i].pid=i+1;
		printf("Process %d:",i+1);
		scanf("%d %d %d",&processes[i].arrival_time,&processes[i].cpu_burst,&processes[i].priority);
	}
	generate_random_cpu(processes,n);
	sortp(processes,n);
	calculate_waiting_time(processes,n);
	calculate_turnaround_time(processes,n);
	printf("\nGantt chart:\n");
	for(int i=0; i<n; i++){
		printf("| P%d ",processes[i].pid);
	}
	printf("|\n");
	printf("\nPi\tAt\tBt\t  Priority\tTAT\tWT\n");
	for(int i=0; i<n; i++)
	{
	printf("P%d\t%d\t%d\t\t%d\t%d\t%d\n",processes[i].pid,processes[i].arrival_time,processes[i].cpu_burst,processes[i].priority,processes[i].turnaround_time,processes[i].waiting_time);
	}
	//calculate_turnaround_time(processes,n);
	return 0;
}





