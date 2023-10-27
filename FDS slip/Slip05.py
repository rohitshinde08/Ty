Q1.
Dataset Name: winequality-red.csv
Write a program in python to perform following task 
1. Import Dataset from above link. 
2. Rescaling: Normalised the dataset using MinMaxScaler class

from pandas import*
from numpy import*
from sklearn import preprocessing
import scipy.stats as s
df=read_csv("winequality-red.csv")
print(df)
print("Rescaling Data")
print("\nData scaled between 0 to 1")
data_scaler=preprocessing.MinMaxScaler(feature_range=(0,1))
data_scaled=data_scaler.fit_transform(df)
print("\nMin Max Scaled data")
print("------------------------------")
print(data_scaled.round(2))