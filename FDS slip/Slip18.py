Q1.Write a python program
1. Create a dataset in CSV format having Attributes as (Name,salary, age)
2. Describe the dataset 
3. Shape of the dataset 
4. Display first 3 rows from dataset

import pandas as pd
df=pd.read_csv("data.csv");
print("Describing the data\n")
print(df.describe())
print("..............................................")
print("Shape of the dataset:",df.shape)
print("..............................................")
print("Display first 3 rows from dataset:\n",df.head(3))
print("..............................................")
print(df.isnull())