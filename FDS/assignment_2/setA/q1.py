import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
'''
#1
data=np.array([[0,1],[2,3]])
print(data)
print('maximum value of above data',np.max(data))
print('manimum value of above data',np.min(data))
'''
#2
'''
p1=np.array([1,2,3])
p2=np.array([4,5,6])
d=np.linalg.norm(p1-p2)
print(d)
'''
#3
'''
from scipy.stats import iqr
d={'score':[50,80,60,100],'name':['a','b','c','d']}
df=pd.DataFrame(d)
print(df)
r=max((df['score'])-min(df['score']))
print('\nvalue of range in distribution :',r)
col=df['score']
ms=col.mean()
print('average score: ',ms)
q3,q1=np.percentile(col,[100,50])
iqrval=q3-q1
print('inquartile range',iqrval)
'''
#4
'''
def distancesum(x,y,n):
    sum=0
    for i in range(n):
        for j in range(i+1,n):
            sum+=(abs(x[i]-x[j])+abs(y[i]-y[j]))
    return sum
x=[1,2,3,4]
y=[4,3,2,1]
n=len(x)
print('sum of Manhattan distance :', distancesum(x,y,n))'''
#5
'''
n=np.array([0.5,0.7,1,1.2,1.3,2.1])
b=np.array([0,1,2,3])
print('numbers :',n)
print('bins :',b)
print('\n')
plt.hist(n,b)
plt.show()
'''
#6
import scipy.stats as s
d={'percentage':[50,80,60,100],'name':['a','b','c','d'],'age':[20,50,18,40]}
df=pd.DataFrame(d)
print(df)
print('average age :',s.tmean(df['age']).round(2))
print('average percentage',s.tmean(df['percentage']).round(2))
print(df.describe())
