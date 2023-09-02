import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
import scipy.stats as s
df=pd.read_csv('Iris.csv')
print(df.sample(10))
print(df)
print(df.dtypes)
print('min and max value Sepal length')
print(max(df['SepalLengthCm']))
print(min(df['SepalLengthCm']))

print('min and max value Sepal length')
print(max(df['PetalLengthCm']))
print(min(df['PetalLengthCm']))
print('\n')
print(df.info())

print('Mean')
print('SepalLength mean',s.tmean(df['SepalLengthCm']).round(2))
print('SepalWidth mean',s.tmean(df['SepalWidthCm']).round(2))
print('SepalLength mean',s.tmean(df['SepalLengthCm']).round(2))
print('SepalWiddth mean',s.tmean(df['SepalWidthCm']).round(2))
print('\n')

print('Median')
print('SepalLength Median',np.median(df['SepalLengthCm']).round(2))
print('SepalLength Median',np.median(df['SepalWidthCm']).round(2))
print('SepalLength Median',np.median(df['SepalLengthCm']).round(2))
print('SepalLength Median',np.median(df['SepalWidthCm']).round(2))

