#include<stdio.h> 
#include<unistd.h>
#include<sys/wait.h>
int n, a[10];
void bubble();
void insertion();
int main()
{
    int i;
    printf("Enter the array size : ");
    scanf("%d",&n);
    
    printf("Enter the elements : ");
    for (i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    
    int pid=fork();
    if (pid==0)
    {
       printf("Child process id %d\n",getpid());
       insertion();
       printf("The array elements are :");
       for (i=0;i<n;i++)
           printf(" %d ",a[i]);
       printf("\n");
    }
    else
    {
       wait(NULL);
       printf("Parent process id %d\n",getppid());
       bubble();
       printf("The array elements are :");
       for (i=0;i<n;i++)
           printf(" %d ",a[i]);
       printf("\n");
    }
}
void bubble()
{
     int i,j,temp;
     for (i=0;i<n;i++)
     {
         for (j=i+1;j<n;j++)
         {
             if (a[i]>a[j])
             {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
             }
         }
     }
}
void insertion()
{
     int i,j,k;
     for (i=1;i<n;i++)
     {
         k=a[i];
         j=j-1;
         while (j>=0 && a[j]>k)
         {
               a[j+1]=a[j];
               j--;
         }
         a[j+1]=k;
     }
} 
