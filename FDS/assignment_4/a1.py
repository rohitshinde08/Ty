import numpy as np
import pandas as pd 
from matplotlib.pyplot import*

#1
'''x = np.random.randn(50)
y = np.random.randn(50)
plot(x,y)
show()'''

#2
'''x=np.random.randn(50)
y=np.random.randn(50)
size = 150*np.random.randn(50)
scatter(x,y, size, color="red", marker="*", alpha = 0.7)
show()'''

#3
'''n = 150*np.random.randn(50)
hist(n, bins=30, color="blue", alpha=0.7)
show()'''

#4
'''
data = [1,1,2,2,4,6,6.8,7.2,8,8.3,9,10,10,11.5]
boxplot(data, vert=False)
show()'''

#5
'''x = [10,12,14,16,18]
y = ['math','science','english','marathi','hindi']
e = [0.1,0.2,0.1,1,0.2]
bar(x,y)
show()
'''


#6
'''x = [10,12,14,16,18]
y = ['math','science','english','marathi','hindi']
e = [0.1,0.2,0.1,1,0.2]
pie(x, labels=y , explode=e)
show()
'''

#7
'''df = pd.read_csv('Iris.csv')
print(df)
print("Pie chart")
pie(df['Species'].value_counts(),autopct='%1.1f%%')
show()
'''

#8
'''
#from matplotlib.pyplot as plt
df = pd.read_csv('Iris.csv')
print(df)
print("BAr chart")
bar(df['Species'],df['Id'],color='magenta', alpha=0.6)
show()
'''



