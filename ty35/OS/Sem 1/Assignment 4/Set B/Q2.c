#include<stdio.h>
struct frame
{
	int pno,freq;
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
int get_mfu_frame()
{
	int selfno=0,fno;
	for(fno=1; fno<n; fno++)
	{
	if(frames[fno].freq>frames[selfno].freq)
	{
		selfno=fno;
	}
	}
	return selfno;
}
int main()
{
	int p_request[]={12,15,12,18,6,8,11,12,19,12,19,12,6,8,12,15,19,8};
	int size=16;
	int pf=0;
	printf("\nHow many frames:");
	scanf("%d",&n);
	for(int i=0; i<n; i++)
	{
		frames[i].pno=-1;
		frames[i].freq=0;
	}
	printf("\nPage no  Page Frames  Page faults");
	printf("\n----------------------------------");
	for(int i=0; i<size; i++)
	{
		int j=page_found(p_request[i]);
		if(j==-1)
		{
		j=get_free_frames();
		if(j==-1)
		 j=get_mfu_frame();
		 pf++;
		 frames[j].pno=p_request[i];
		 frames[j].freq=1;
		 printf("\n%4d\t",p_request[i]);
		for(int fno=0; fno<n; fno++)
		{
		printf("%4d:%2d",frames[fno].pno,frames[fno].freq);
		printf(":YES");
		}
		}
		else
		{
			printf("\n%4d\t",p_request[i]);
			frames[j].freq++;
			for(int fno=0; fno<n; fno++)
			{
			printf("%4d:%2d",frames[fno].pno,frames[fno].freq);
			printf(":NO");
			}
		}
		
		}
		printf("\nNumber of page faults:%d\n",pf);
		
}
