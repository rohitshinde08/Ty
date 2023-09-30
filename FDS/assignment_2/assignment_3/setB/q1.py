import pandas as pd
from sklearn import preprocessing
import numpy as np
import scipy.stats as s
df=pd.read_csv('winequality-red.csv')
data_scaler=preprocessing.MinMaxScaler(feature_range=(0,1))
data_scaled=data_scaler.fit_transform(df)
print("Rescaling : 0-1\n")
print(df)
x_train=np.array(df)
print("Original Data :",x_train)
print("Initial Mean :",s.tmean(x_train).round(2))
print("Initial standard daviation :",round(x_train.std(),2))
x_scale=preprocessing.scale(x_train)
x_scale.mean(axis=0)
x_scale.std(axis=0)
print("standard data :\n",x_scale.round(2))
print("scaled mean :\n",s.tmean(x_scale).round(2))
print("scaled sd:\n",round(x_scale.std(2)))

dn=preprocessing.normalize(df,norm='l1')
print("\n\n normalize data \n\n")
print(dn)
data_bin=preprocessing.Binarizer(threshold=1).transform(df)
print("\nBinarizer data :",data_bin)
