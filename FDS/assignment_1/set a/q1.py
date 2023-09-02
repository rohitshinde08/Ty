import pandas as pd 
import matplotlib.pyplot as plt 
df=pd.DataFrame(columns=['name','age','percentage'])
df.loc[0]=['varad',20,91]
df.loc[1]=['rohit',20,92]
df.loc[2]=['omkar',20,90]
df.loc[3]=['pranit',20,87]
df.loc[4]=['tejas',20,56]
df.loc[5]=['vaibhav',20,75]
df.loc[6]=['kunal',20,79]
df.loc[7]=['chaitanya',20,86]
df.loc[8]=['shubham',20,90]
df.loc[9]=['atharva',20,87]
print('No. of rows and columns in dataframe is :',df.shape)
print('\ndatatype :',df.dtypes)
print('\nFeatures :',df.info())
print('\nBasic statistical data :',df.describe())
df.loc[10]=['harshal',20,87]
df.loc[11]=['yash',20,92]
df.loc[12]=['mahesh',20,90]
df.loc[13]=['harshal',20,87]
df.loc[14]=[None,None,None]
df['remarks']=None
print('No. of rows and columns in dataframe is :',df.shape)
print('\nmissing values are',df.isnull())
print('\nDuplicates values are :',df.duplicated())
df.drop(columns=['remarks'],axis=1,inplace=True)
df=df.dropna()
plt.scatter(df.name,df.percentage)
plt.show()
