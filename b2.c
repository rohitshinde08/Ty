#include<stdio.h>
int main()
{
    int n,i,j,bt[20],p[20],wt[20],tat[20],pr[20],total=0,pos,temp;
    int avgwt,avgtat;
    printf("\n Enter the number of processes : ");
    scanf("%d",&n);
   
    for (i=0;i<n;i++)
    {
         printf("\n Enter Burst Time for process P%d : ",i+1);
         scanf("%d",&bt[i]);
         printf(" Priority : ");
         scanf("%d",&pr[i]);
         p[i]=i+1;
    }
    for (i=0;i<n;i++)
    {
        pos=i;
        for (j=i+1;j<n;j++)
        {
            if (pr[j]<pr[pos])
                pos=j;
        }
        temp=pr[i];
        pr[i]=pr[pos];
        pr[pos]=temp;
        
        temp=p[i];
        p[i]=p[pos];
        p[pos]=temp;      
    }
    wt[0]=0;
    for (i=1;i<n;i++)
    {
        wt[i]=0;
        for (j=0;j<i;j++)
            wt[i]=wt[i]+bt[j];
        total=total+wt[i];    
    }
    avgwt=(float)total/n;
    total=0;
    printf("\n Process| BT  |  WT |  TAT  | Priority");
    for (i=0;i<n;i++)
    {
         tat[i]=bt[i]+wt[i];
         total=total+tat[i];
         printf("\n  P[%d]\t%3d\t%d\t%d\t%d",p[i],bt[i],wt[i],tat[i],pr[i]);
    }
    avgtat=(float)total/n;
    printf("\n Average Waiting Time = %d",avgwt);
    printf("\n Average TurnAround Time = %d\n",avgtat); 
} /*
        printf("\n");
        printf("\n\n Gantt Chart :\n\n--------------------\n");
        for (i=0;i<n;i++)
        printf("| P%d ",i);
        printf("|\n-------------------------\n");
        for (i=0;i<n+1;i++)
            printf("  %d  ",temp[i]);
        printf("\n\n");
        printf("\n Process|Arrival Time|Burst Time|Waiting Time|TurnAround Time");
        printf("\n-----------------------------\n");
        for (i=0;i<n;i++)
            printf("\n P%d  |%7d  |%7d  |%8d  ",p[i],bt[i],wt[i],tat[i]);
        avgtat=avgtat/n;
        avgwt=avgwt/n;
        printf("\n\n Average Turn Around Time : %f",avgtat);       
        printf("\n Average Waiting Time : %f\n",avgwt);   
        }
}      
        */
        
        
        
        
        
        
        
        
