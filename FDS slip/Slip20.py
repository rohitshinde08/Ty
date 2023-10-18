Q1.Write a Python program
1. To find the maximum and minimum value of a given flattened array. 
2. To Create one dataframe of data values. Find out mean, range and IQR for this 
data.

PROGRAM-1
import numpy as np
data=np.array([[0,1],[2,3]])
print(data)
print("Expeceted Output :\n")
print("Original Flattened array :\n")
print("maximum value of the array:",np.max(data))
print("minimum value of the array:",np.min(data))

PROGRAM-2

import pandas as pd
from scipy.stats import iqr
import numpy as np
d={"score":[80,92,78,83,88],"Name":["Ravi","Suraj","Meena","Rajesh","Sankalp"]}
df=pd.DataFrame(d)
print(df)
r=max(df["score"])-min(df["score"])
print("Value of range in distribution:",r)
col=df["score"] 
mean_of_score=col.mean()
print("Average of score:",mean_of_score)
q3,q1=np.percentile(col,[72,25])
iqrvalue=q3-q1
print("Interquartile range:",iqrvalue)
