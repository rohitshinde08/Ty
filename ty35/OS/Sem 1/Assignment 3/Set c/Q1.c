 #include<stdio.h>
 #include<stdlib.h>
 #include<time.h>
 struct process
 {
 	int id,at,wt,bt,ct,tat,rt;
 };
 int main()
 {
 	int n,q;
 	printf("Enter the number of processes...");
 	scanf("%d",&n);
 	struct process processes[n];
 	int completed[n];
 	for(int i=0; i<n; i++)
 	{
 		printf("Arrival time & Burst time of processes P%d\n:",(i+1));
 	        scanf("%d %d",&processes[i].at,&processes[i].bt);
 	        processes[i].id=i+1;
 	        processes[i].rt=processes[i].bt;
 	        processes[i].ct=0;
 	        processes[i].wt=0;
 	        processes[i].tat=0;
 	        completed[i]=0;
 	}
 	printf("Enter time quantum:");
 	scanf("%d",&q);
 	int currentt=0;
 	int completed_process=0;
 	printf("Gantt chart:\n");
 	while(completed_process<n)
 	{
 	for(int i=0; i<n; i++)
 	{
 		if(!completed[i] && processes[i].at<=currentt)
 		{
 			printf("|P%d|",processes[i].id);
 			if(processes[i].rt<q)
 			{
 				/*currentt+=q;
 				processes[i].rt-=q;
 				*/currentt+=processes[i].rt;
 				processes[i].ct=currentt;
 				processes[i].rt=0;
 				completed_process++;
 				completed[i]=1;
 			}
 			else
 			{ 
 			   /*currentt+=processes[i].rt;
 			   processes[i].wt=currentt-processes[i].bt;
 			   processes[i].rt=q;*/
 				currentt+=q;
 				processes[i].rt-=q;
 				
 			}
 			currentt+=2;
 	        	}
         	}
        }
        printf("\nProcess\tAT\tBT\tCT\tTAT\tWT\n");
        float ttat=0,twt=0;
        for(int i=0; i<n; i++)
        {
        	processes[i].tat=processes[i].ct-processes[i].at;
        	processes[i].wt=processes[i].tat-processes[i].bt;
        	ttat+=processes[i].tat;
        	twt+=processes[i].wt;       	      printf("\nP%d\t%d\t%d\t%d\t%d\t%d\n",processes[i].id,processes[i].at,processes[i].bt,processes[i].ct,processes[i].tat,processes[i].wt);
        }
        ttat=ttat/n;
        twt=twt/n;
        printf("Average turn around time:%f",ttat);
        printf("Average waiting time:%f",twt);       
 }
 
