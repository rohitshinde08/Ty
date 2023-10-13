#include<stdio.h>
#include<stdbool.h>
#define max 100
struct page
{
	int num;
	int freq;
};
void opt(int rs[],int n,int frames);
int main()
{
	int rs[]={12,15,12,18,6,8,11,12,19,12,19,12,6,8,12,15,19,8};
	int n;
	printf("How many frames?:");
	scanf("%d",&n);
	opt(rs,sizeof(rs)/sizeof(rs[0]),n);
	return 0;
}
void opt(int rs[],int n,int frames)
{
	struct page memory[max];
	int pf=0;
	int next_use[max];
	for(int i=0; i<frames; i++)
	{
		memory[i].num=-1;
		memory[i].freq=0;
	}
	printf("\nPage no   Page frames  Page Fault\n");
	for(int i=0; i<n; i++)
	{
		int page=rs[i];
		bool page_found=false;
		//Find the page in frames
		for(int j=0; j<frames; j++)
		{
			if(memory[j].num==page)
			{
				page_found=true;
				memory[j].freq++;
				break;
			}
		}
		if(!page_found)
		{
			int replace_index=-1;
			for(int j=0; j<frames; j++)
			{
				if(memory[j].num==-1)
				{
					replace_index=j;
					break;
				}
				if(next_use[j]>next_use[replace_index] || replace_index==-1)
				{
					replace_index=j;
				}
			}
		memory[replace_index].num=page;
		memory[replace_index].freq=i+1;
	        pf++;
		}
		printf("\n%4d\t",page);
		for(int j=0; j<frames; j++)
		{
			printf("%3d:%2d",memory[j].num,memory[j].freq);
		}
		printf(":%s",page_found?"NO":"YES");
		}
		printf("\nNo of page faults:%d\n",pf);
		
}
