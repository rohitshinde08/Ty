#include<stdio.h>
struct frame
{
	int pno;
}frames[20];
int n;
int page_found(int pno)
{
	int fno;
	for(fno=0; fno<n;fno++)
	{
		if(frames[fno].pno==pno)
		{
			return fno;
		}
		
		
	}
	return -1;
}
int get_free_frames()
{
int fno;
	for(fno=0; fno<n; fno++)
	{
		if(frames[fno].pno==-1)
		{
			return fno;
		}
	}
	return -1;	 
}
int get_fifo_frame()
{
	static int fno=-1;
	fno=(fno+1)%n;
	return fno;
}
int main()
{
	int p_request[]={12,15,12,18,6,8,11,12,19,12,6,8,12,15,19,8};
	int size=sizeof(p_request)/sizeof(int),pf=0,fno,j;
	printf("\nHow many frames?:");
	scanf("%d",&n);
	for(int i=0; i<n; i++)
	{
		frames[i].pno=-1;
	}
	printf("\nPage no\tpage frames\tpage faults");
	for(int i=0; i<size; i++)
	{
		j=page_found(p_request[i]);
		if(j==-1)
		{
			pf++;
			j=get_free_frames();
			if(j==-1)
			j=get_fifo_frame();
			//pf++;
			frames[j].pno=p_request[i];
			//frames[j].counter=curtime;
			printf("\n%4d\t",p_request[i]);
			for(fno=0; fno<n; fno++)
			{
				printf("%4d",frames[fno].pno);
				printf(":YES");
			}
		}
		else
		{
			//frames[j].counter=curtime;
			printf("\n%4d\t",p_request[i]);
			for(fno=0; fno<n; fno++)
			{
				printf("%4d",frames[fno].pno);
				printf(":NO");
			}
		
		}
	}	
	printf("\nNumbers of page faults=%d",pf);
}
