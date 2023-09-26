#include<stdio.h>
int main()
{
    int at[10],bt[10],temp[10],i,s,count=0,time,limit;
    double wt=0,tat=0,end;
    int avgwt=0,avgtat=0;
    printf("\n Enter the number of processes : ");
    scanf("%d",&limit);
    printf("\n Enter Details of %d Processes: ",limit);
    
    for (i=0;i<limit;i++)
    {
         printf("\n Enter arrival time and first CPU burst for process P%d : ",i);
         scanf("%d%d",&at[i],&bt[i]);
         temp[i]=bt[i];
    }
    bt[9]=9999;
    for (time=0;count!=limit;time++)
    {
        s=9;
        for (i=0;i<limit;i++)
        {
            if (at[i]<=time && bt[i]<bt[s] && bt[i]>0)
            {
               s=i;
            }
        }
        bt[s]--;
        if (bt[s]==0)
        {
           count++;
           end=time+1;
           wt=wt+end-at[s]-temp[s];
           tat=tat+end-at[s];
         }
     } 
     avgwt=wt/limit;
     avgtat=tat/limit;
     printf("\n\n Average Turn Around Time : %d",avgtat);       
     printf("\n Average Waiting Time : %d\n",avgwt);   
    /* printf("\n");
     printf("\n\n Gantt Chart :\n\n--------------------\n");
     for (i=0;i<limit;i++)
         printf("| P%d ",i);
     printf("|\n-------------------------\n");
     for (i=0;i<limit+1;i++)
         printf("  %d  ",temp[i]);
     printf("\n\n");
     printf("\n Process|Arrival Time|Burst Time|Waiting Time|TurnAround Time");
     printf("\n-----------------------------\n");
     for (i=0;i<limit;i++)
         printf("\n P%d  |%7d  |%6d  |%7d  |%8d  ",temp[i],at[i],bt[i],wt[i],tat[i]);
   */
}      
        
        
        
        
        
        
        
        
        
