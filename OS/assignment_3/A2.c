#include<stdio.h>
#include<stdlib.h>
void main()
{
     int i,n;
     float awt=0, atat=0;
     printf("Enter the number of process :");
     scanf("%d",&n);
     
     int at[n],bt[n],wt[n],tat[n];
     printf("Enter the Arrival Time :");
     for (i=0;i<n;i++)
         scanf("%d",&at[i]);

     printf("enter brust time :");
     for (i=0;i<n;i++)
         scanf("%d",&bt[i]);     
     //for (i=0;i<n;i++)
       //  bt[i]=rand()%10;
     int temp[10],j,p[10];
     temp[0]=0;
     //for (i=1;i<n;i++)
       //  temp[i]=temp[i-1]+bt[i-1];
     for (i=1;i<n;i++)
     {
          for (j=0;j<n;j++)
          {
              if (bt[j]>bt[j+1])
              {
                 temp=bt[j];
                 bt[j]=bt[j+1];
                 bt[j+1]=temp;
                 temp=p[j];
                 p[j]=p[j+1];
                 p[j+1]=temp;
              }
          }
     }
     int s[10];
     s[0]=0;
     for (i=0;i<n;i++)
         s[i]=s[i]+bt[i];
     for (i=0;i<n;i++)
     {
         
         scanf("%d",&at[i]);
     awt/=n;
     atat/=n;
     printf("\npro\tat\tbt\ttwt\ttat");
     for (i=0;i<n;i++)
     {
         printf("\nP%d\t%d\t%d\t%d\t%d",i+1,at[i],bt[i],wt[i],tat[i]);
     }
     printf("\navg waiting time :%f\n",awt,"\navg turn around time :%f\n\n",atat);
}
