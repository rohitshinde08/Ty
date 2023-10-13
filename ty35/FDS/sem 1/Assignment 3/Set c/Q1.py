import pandas as pd
ds=pd.read_csv("Student_bucketing.csv")
df=pd.DataFrame(ds)
print(df)
print("First five rows of Dataset:")
print(df.head(5))
print("")
