#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

struct Process
{
       int name,at,bt,tat,wt,rt;
};

void main()
{
    int i,n,timeq;
    printf("Enter number of processes : ");
    scanf("%d",&n);
    struct Process p[n];
    for (i=0;i<n;i++)
    {
         p[i].name=i+1;
    }
    
    for (i=0;i<n;i++)
    {
        printf("\n Enter Arrival time and Burst time for process P%d : ",i+1);
        scanf("%d%d",&p[i].at,&p[i].bt);
        p[i].rt=p[i].bt;
    }
    printf("\n Enter Time Quantum : ");
    scanf("%d",&timeq);
    int time=0,io_wait=2,completed=0;
    printf("\n\n Gantt Chart :\n--------------------\n");
    while (completed < n)
    {
        bool found=false;   
        for (i=0;i<n;i++)
        {
            if (p[i].at <= time && p[i].rt > 0)
            {
               found=true;
               if (p[i].rt > timeq)
               {
                  printf("| P%d ",p[i].name);
                  time += timeq;
                  p[i].rt -= timeq;
               }
               else
               {
                  printf("| P%d ",p[i].name);
                  time += p[i].rt;
                  p[i].rt=0;
                  p[i].tat=time-p[i].at;
                  p[i].wt=p[i].tat-p[i].bt;
                  completed++;
               }
            }
            else if (p[i].at > time)
            {
                    printf("-");
                    time +=io_wait;
            }
        }
        if (!found)
           time++;
    }
    printf("\n Process\tAT\tBT\tTAT\tWT\n");
    printf("\n----------------------------------------\n");
    float avgtat=0,avgwt=0;
    for (i=0;i<n;i++)
    {
         printf(" P%d    |\t%4d  |\t%4d  |\t%4d  |\t%4d |\n",p[i].name,p[i].at,p[i].bt,p[i].tat,p[i].wt);
         avgwt=avgwt + p[i].wt;
         avgtat=avgtat + p[i].tat;
    }
    printf("\n\n Average Turn Around Time : %f",avgtat/n);       
    printf("\n Average Waiting Time : %f\n",avgwt/n);     
}
   