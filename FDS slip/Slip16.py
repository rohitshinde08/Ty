Q1. Write a Python program 
1. To create a dataframe containing columns name, age and percentage. Add 10
rows to the dataframe. View the dataframe. 
2. To view basic statistical details of the data.

import pandas as pd
import matplotlib.pyplot as plt
df=pd.DataFrame(columns=["Name","Age","Percentage"])
df.loc[0]=["Sankalp",21,94]
df.loc[1]=["Manas",20,94]
df.loc[2]=["Om",19,94]
df.loc[3]=["Raj",22,94]
df.loc[4]=["Rahul",19,74]
df.loc[5]=["Aman",20,84]
df.loc[6]=["Shwan",20,82]
df.loc[7]=["Gauraj",23,90]
df.loc[8]=["Sarthak",21,72]
df.loc[9]=["Satyam",21,88]
print(df)
print(" stastical data ",df.describe())