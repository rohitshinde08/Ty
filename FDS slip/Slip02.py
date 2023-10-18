Q1.
1. Create a dataset emp.csv having attributes (salary, age)
2. Describe the dataset 
3. Shape of the dataset 
4. Display first 3 rows from dataset 
5. Handling Missing Value: Replace missing value of salary, age column with 
mean of that column

import pandas as pd
df=pd.read_csv("emp.csv")
print("Describing the data\n")
print(df.describe())
print("..............................................")
print("Shape of the dataset:",df.shape)
print("..............................................")
print("Display first 3 rows from dataset:\n",df.head(3))
print("..............................................")
print(df.isnull())
print("Missing values:",df.fillna(0,inplace=True))
print(df)
print("..............................................")
df.fillna(0)
print(df)
print("..............................................")
mean_age=df['Age'].mean()
print("Mean Of Age:",mean_age)
print("..............................................")
mean_salary=df['Salary'].mean()
print("Mean Of Salary:",mean_salary)
print("..............................................")
df['Age'].fillna(mean_age,inplace=True)
df['Salary'].fillna(mean_salary,inplace=True)
print(df)