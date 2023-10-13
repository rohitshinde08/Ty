import pandas as pd
import numpy as np
import scipy.stats as s
df=pd.read_csv("Iris.csv")
print("Random Samples of 10:",df.sample(10))
print("Max value of Numeric attribute:",df.max(axis=None))
print("min value of Numeric attribute:",np.min(df))
print(df.dtypes)
print("Count of distinct records:",df["Species"].value_counts())
'''#3'''
print("Mean:\n")
print("SepalLengthCm mean:",s.tmean(df["SepalLengthCm"]).round(2))
print("SepalWidthCm mean:",s.tmean(df["SepalWidthCm"]).round(2))
print("PetalLengthCm mean:",s.tmean(df["PetalLengthCm"]).round(2))
print("PetalWidthCm mean:",s.tmean(df["PetalWidthCm"]).round(2))
print("Median:\n")
print("SepalLengthCm median:",np.median(df["SepalLengthCm"]).round(2))
print("SepalWidthCm median:",np.median(df["SepalWidthCm"]).round(2))
print("PetalLengthCm median:",np.median(df["PetalLengthCm"]).round(2))
print("PetalWidthCm median:",np.median(df["PetalWidthCm"]).round(2))


