#include<stdio.h>
#include<stdlib.h>
void bubble(int a[20],int n)
{
 int i,j,temp;
	for(i=0; i<n; i++)
	{
		for(j=0; j<n-1; j++)
			if(a[j]>a[j+1])
			{
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			}
	}
}
void insertion(int a[20],int n)
{
	int i,j,temp;
	for(i=1; i<n; i++)
	{
		temp=a[i];
		j=i-1;
		while(j>0 && temp<=a[j])
		{
			a[j+1]=a[j];
			j=j-1;
		}
		a[j+1]=temp;
	}
	
}
void f()
{
	int a[30],a1[30],n,i;
	printf("\nEnter size of Array:");
	scanf("%d",&n);
	printf("\nEnter elements of Array:");
	for(i=0; i<n; i++)
	{
		scanf("%d",&a[i]);
	}
        int pid=fork();
        if(pid==0)
        {
        	sleep(5);
        	printf("\nChild process\n");
        	printf("\nChild proces Id:%d",getpid());
        	insertion(a,n);
        	printf("\nElements sorted using insertion sort:\n");
        	for(i=0; i<n; i++)
        		printf("%d \t",a[i]);
        	printf("\n");
        	printf("\nParent process Id=%d\n",getpid());
        }
        else
        {
                printf("\nParent process\n");
        	printf("\nParent process Id:%d",getpid());
        	bubble(a,n);
        	printf("\nElements sorted using bubble sort:\n");
        	for(i=0; i<n; i++)
        		printf("%d \t",a[i]);
        	printf("\n");
        	
        }
   }
int main()
{
	f();
	return 0;
}
       
