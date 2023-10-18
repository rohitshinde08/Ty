Q1. Create a dataset data.csv having two categorical column (the country column, and the purchased column).
Apply Label encoding on purchased column

from sklearn.preprocessing import LabelEncoder
labelencoder=LabelEncoder()
df['Country']=labelencoder.fit_transform(df['Country'])
#print("\n\nOne Hot \n",df)
labelencoder=LabelEncoder()
df['Purchased']=labelencoder.fit_transform(df['Purchased'])
print("\n\nLevel encoding \n",df)

import pandas as pd
from sklearn.preprocessing import OneHotEncoder
enc=OneHotEncoder(handle_unknown='ignore')
enc_df=pd.DataFrame(enc.fit_transform(df[['Country']]).toarray())
print("One Hot Encoding : ",enc_df)

df=df.join(enc_df)
print(df)