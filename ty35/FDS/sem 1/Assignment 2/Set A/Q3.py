import pandas as pd
from scipy.stats import iqr
import numpy as np
d={"score":[80,85,90,75],"name":["monu","sonu","bholu","golu"]}
df=pd.DataFrame(d)
print(df)
r=max(df["score"])-min(df["score"])
print("Range in distribution is:",r)
col=df["score"]
meanscore=col.mean()
print("Avg of score:",meanscore)
q3,q1=np.percentile(col,[72,25])
iqr=q3-q1
print("Intrquertile range:",iqr)
