#include<stdio.h>
struct frame
{
	int pno,counter;
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
int get_lru_frame()
{
	int lrufno=0,fno;
	for(fno=1; fno<n; fno++)
	{
	if(frames[fno].counter<frames[lrufno].counter)
	{
		lrufno=fno;
	}
	}
	return lrufno;
}
int main()
{
	int p_request[]={12,15,12,18,6,8,11,12,19,12,6,8,12,15,19,8};
	int size=sizeof(p_request)/4,curtime,pf=0,fno,j;
	printf("\nHow many frames?:");
	scanf("%d",&n);
	for(int i=0; i<n; i++)
	{
		frames[i].pno=-1;
	}
	printf("\nPage no\tpage frames\tpage faults");
	curtime=0;
	for(int i=0; i<size; i++)
	{
		j=page_found(p_request[i]);
		if(j==-1)
		{
			j=get_free_frames();
			if(j==-1)
			j=get_lru_frame();
			pf++;
			frames[j].pno=p_request[i];
			frames[j].counter=curtime;
			printf("\n %4d\t",p_request[i]);
			for(fno=0; fno<n; fno++)
			{
				printf("%4d:%2d",frames[fno].pno,frames[fno].counter);
				printf(":YES");
			}
		}
		else
		{
			frames[j].counter=curtime;
			printf("\n%4d\t",p_request[i]);
			for(fno=0; fno<n; fno++)
			{
				printf("%4d:%2d",frames[fno].pno,frames[fno].counter);
				printf(":NO");
			}
		
		}
		curtime++;
	}	
	printf("\nNumbers of page faults=%d",pf);
}
