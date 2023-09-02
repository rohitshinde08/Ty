#include<stdio.h>
#include<stdlib.h>
void main()
{
     int i,n;
     float awt=0, atat;
     printf("Enter the number of process :");
     scanf("%d",&n);
     
     int at[n],bt[n],wt[n],tat[n];
     printf("Enter the Arrival Time :");
     for (i=0;i<n;i++)
         scanf("%d",&at[i]);
     
     for (i=0;i<n;i++)
         bt[i]=rand()%10;
     int temp[10];
     temp[0]=0;
     for (i=1;i<n;i++)
         temp[i]=temp[i-1]+bt[i-1];
         
     for (i=1;i<n;i++)
     {
          wt[i]=temp[i]-at[i];
          awt=awt+wt[i];
          tat[i]=at[i]+bt[i];
          atat+=tat[i];
     }
     awt/=n;
     atat/=n;
     printf("\npro\tat\tbt\ttwt\ttat");
     for (i=0;i<n;i++)
     {
         printf("\nP%d\t%d\t%d\t%d\t%d",i+1,at[i],bt[i],wt[i],tat[i]);
     }
     printf("\navg waiting time :%f\n",awt,"\navg turn around time :%f\n\n",atat);
}
