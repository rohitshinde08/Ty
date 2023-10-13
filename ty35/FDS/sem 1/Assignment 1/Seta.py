import pandas as pd
import matplotlib.pyplot as plt
df=pd.DataFrame(columns=['Name','Age','percentage'])
df.loc[0]=['monu',12,98]
df.loc[1]=['tinu',14,68]
df.loc[2]=['pinku',17,88]
df.loc[3]=['chinku',11,48]
df.loc[4]=['ninu',17,45]
df.loc[5]=['mumu',14,58]
df.loc[6]=['ramu',14,78]
df.loc[7]=['sinzo',23,74]
df.loc[8]=['Dholu',16,38]
df.loc[9]=['Bholu',13,68]
#print(df)
#print("shape:",df.shape)
#print("Size:",df.size)
#print("Datatypes:",df.dtypes)
#print(df.info())
#print(df.describe())
df.loc[10]=['pinku',17,88] #duplicate values
df.loc[11]=['Arya',None,None] #missing values
df.loc[12]=['shreeraj',None,12] #missing values
df.loc[13]=['Bholu',13,68]#duplicate values
df.loc[14]=['sinzo',23,74]#duplicate values
df.loc[15]=[None,None,None]
print("No of Observations:",df.shape[0])
print("No of null values:",df.isnull())
print("No of duplicate values:",df.duplicated())
df["remarks"]=None
print("Data before modification:\n",df)
df.drop(columns='remarks',axis=1,inplace=True)
df=df.dropna()
print("Modified Data:\n",df)
#print("Q7:\n")
#df.plot(x="Name",y="percentage")
print("Q8:\n")
df.plot(kind="scatter",x="Name",y="percentage")
plt.show()
