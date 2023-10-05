import pandas as pd
from sklearn.preprocessing import OneHotEncoder
from sklearn.preprocessing import LabelEncoder
df=pd.read_csv('Data.csv')
#df=df.DataFrame(columns['Country','age','salary','Purchase'])
print(df.describe())
print("Rows and Columns :\n",df.shape)
print("\nFirst 3 rows\n",df.head(3))

valueMean=df["Age"].mean()
df["Age"].fillna(valueMean,inplace=True)
print("\nMising values\n")
value=df["Salary"].mean()
df["Salary"].fillna(value,inplace=True)
print(df)

print("\n\n")
df["Purchased"]=LabelEncoder().fit_transform(df["Purchased"])
print(df)
enc=OneHotEncoder(handle_unknown="ignore")
enc_df=pd.DataFrame(enc.fit_transform(df[['Country']]).toarray())
print(enc_df)
