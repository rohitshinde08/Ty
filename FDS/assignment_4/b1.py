import numpy as np
import pandas as pd 
from matplotlib.pyplot import*
import seaborn as sns

#1
'''df = pd.read_csv('Iris.csv')
print(df)
scatter(x=df['PetalLengthCm'], y=df['PetalLengthCm'],color='red')
show()'''

#2
'''df = pd.read_csv('Iris.csv')
print(df)
scatter(x=df['SepalLengthCm'], y=df['SepalLengthCm'],color='red')
show()'''

#3
'''df = pd.read_csv('Iris.csv')
print(df)
data = df['SepalLengthCm']
data1 = df['PetalLengthCm']
data2 = df['PetalLengthCm']
data3 = df['SepalLengthCm']
sns.boxplot(x=df['Species'], y=df['PetalLengthCm'],palette='Blues')
show()'''
