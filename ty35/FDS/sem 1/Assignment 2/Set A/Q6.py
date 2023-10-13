import numpy as np
import scipy.stats as s
import pandas as pd
d={"Name":["pinku","chinku","tinku","rinku"],"Age":[22,45,32,14],"percentage":[66,87,98,56]}
df=pd.DataFrame(d)
print(df)
print("Avg of age:",s.tmean(df["Age"]).round(2))
print("Avg of percentage:",s.tmean(df["percentage"]).round(2))
print(df.describe())
