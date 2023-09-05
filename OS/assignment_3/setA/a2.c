#include<stdio.h>
#include<stdlib.h>
void main()
{
     int i,n;
     float awt=0, atat=0;
     int temp,j,p[10];
     printf("Enter the number of process :");
     scanf("%d",&n);
     
     int at[n],bt[n],wt[n],tat[n];
     printf("Enter the Arrival Time :");
     for (i=0;i<n;i++)
         scanf("%d",&at[i]);

     printf("enter brust time :");
     for (i=0;i<n;i++)
         scanf("%d",&bt[i]);     
     for (i=1;i<=n;i++)
         p[i]=i;
     for (i=1;i<n;i++)
     {
          for (j=i+1;j<n;j++)
          {
              if (bt[i]>bt[j])
              {
                 temp=bt[i];
                 bt[i]=bt[j];
                 bt[j]=temp;
                 
                 temp=p[i];
                 p[i]=p[j];
                 p[j]=temp;
                 
                 temp=at[i];
                 at[i]=at[j];
                 at[j]=temp;
                 
              }
          }
     }
     int s[10];
     s[0]=0;
     printf("0");
     for (i=1;i<n;i++)
     {
         s[i]=s[i-1]+bt[i-1];
         printf("\t%d",s[i]);
     }
     for (i=0;i<n;i++)
     {
         wt[i]=s[i]-at[i];
        // wt[0]=0;
         awt+=wt[i];
     }
     for (i=0;i<n;i++)
     {
         tat[i]=wt[i]+bt[i];
         //wt[0]=0;
         atat+=tat[i];
     }
     awt/=n;
     atat/=n;
     printf("\npro\tat\tbt\ttwt\ttat");
     for (i=0;i<n;i++)
     {
         printf("\nP%d\t%d\t%d\t%d\t%d",i+1,at[i],bt[i],wt[i],tat[i]);
     }
     printf("\navg waiting time :%f\navg turn around time :%f\n\n",awt,atat);
     
}
