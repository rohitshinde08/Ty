#include<stdio.h>
#include<stdlib.h>


void main()
{
     int i,n;
     float avwt=0,avtat=0;
     printf("\n Enter number of processes : ");
     scanf("%d",&n);
     int p[n],at[n],bt[n],wt[n],tat[n],ct[n],t[n];
     
     printf("\n Enter process  : ");
     for (i=0;i<n;i++)
         scanf("%d",&p[i]);
     
     
     printf("\n Enter arival time  : ");
     for (i=0;i<n;i++)
     {
         scanf("%d",&at[i]);
         t[i]=at[i];
     }
         
      printf("\n\n Enter burst time  : ");
     for (i=0;i<n;i++)
         scanf("%d",&bt[i]);
         
       printf("\n Before sorting   : \n");
       printf("\npro\tAt\tBt  : \n");
       for (i=0;i<n;i++)
     {
         printf("\np[%d]\t%d\t%d\n",p[i],at[i],bt[i]);
     }
     //sorting processess acording to their burst time 
     int j,temp;
     
     for (i=0;i<n;i++)
          for (j=0;j<n-1-i;j++){
              if ((at[j] > at[j+1]) && (bt[j] > bt[j+1]))
              {
                 temp=bt[j];
                 bt[j]=bt[j+1];
                 bt[j+1]=temp;
                 
                 temp=p[j];
                 p[j]=p[j+1];
                 p[j+1]=temp;
                 
                 temp=at[j];
                 at[j]=at[j+1];
                 at[j+1]=temp;
              }
           }
           
     int start[n];
     start[0]=0;
     for (i=1;i<n;i++)
     {
         start[i]=start[i-1]+bt[i-1];
         
        
     }
      
     for (i=0;i<n;i++)
     {
         wt[i]=start[i]-t[i];
         avwt+=wt[i];
     }
     avwt/=n;   
    
     for (i=0;i<n;i++)
     {
         tat[i]=wt[i]+bt[i];
         ct[i]=tat[i]+t[i];
         avtat+=tat[i];
     }
      
     avtat/=n;
    
     // Gantt chart 
     printf("\n\n------------------------------------------------------------  :\n");
     printf("\n\t\t  *****Gntt Chart*****   :\n\n");
     for (i=0;i<n;i++)
     {
              printf("     %d <p[%d]> %d " ,start[i],p[i],ct[i]);
     }
     printf("\n\n------------------------------------------------------------  :\n");
          
     printf("\n\n After  sorting   :\n");
     printf("\npro\tAt\tBt\tWt\tTat  : \n");
     for (i=0;i<n;i++)
     {
         printf("\np[%d]\t%d\t%d\t%d\t%d\n",p[i],at[i],bt[i],wt[i],tat[i]);
     }
     printf("\n Average waiting time : %f ",avwt);
     printf("\n Average turn around  time : %f ",avtat);
 }
