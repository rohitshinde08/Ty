#include<stdio.h>

struct Process
{
       int at,bt,tat,wt,pid,pt,bt1;
};

void main()
{
    int n,i,j,k=0,temp[20];
    int avgwt=0,avgtat=0;
    printf("\n Enter the number of processes : ");
    scanf("%d",&n);
    struct Process p[n];
    for (i=0;i<n;i++)
    {
         printf("\n Enter Arrival Time for process P%d : ",i);
         scanf("%d",&p[i].at);
         printf("\n Enter Burst Time for process P%d : ",i);
         scanf("%d",&p[i].bt);
         printf("\n Enter Priority for process P%d : ",i);
         scanf("%d",&p[i].pt);
      
         p[i].pid=i;
         p[i].bt1=p[i].bt;
         temp[i]=p[i].bt;
    }
    p[9].pt=1000;
    int t,count=0,short_p=9;
    for (t=0;count!=n;t++)
    {
        short_p=9;
        for (i=0;i<n;i++)
        {
            if (p[short_p].pt > p[i].pt && p[i].at <= t && p[i].bt > 0)
            {
                short_p=i;
            }
        }
        p[short_p].bt--;
        if (p[short_p].bt==0)
        {
           count++;
           p[short_p].wt=t+1-p[short_p].at-temp[short_p];
           p[short_p].tat=t+1-p[short_p].at;
           avgwt=avgwt+p[short_p].wt;
           avgtat=avgtat+p[short_p].tat;
        }
     }
//     printf("\n----------------------------------------\n");
/*     printf("\n Gantt Chart :\n--------------------\n");
     for (i=0;i<n;i++)
        printf("| P%d ",p[i]);
     printf("|\n-------------------------\n");
    for (i=0;i<n+1;i++)
        printf("  %d  ",temp[i]);*/
     printf("\n Process| AT | BT  |  WT |  TAT  ");
     printf("\n----------------------------------------\n");
     for (i=0;i<n;i++)
          printf("  P%d|\t%d|\t%d|\t%d|\t%d|\n",p[i].pid,p[i].at,p[i].bt,p[i].wt,p[i].tat);
     printf("\n Average Waiting Time = %d",avgwt/n);
     printf("\n Average TurnAround Time = %d\n",avgtat/n); 
}

        
    
