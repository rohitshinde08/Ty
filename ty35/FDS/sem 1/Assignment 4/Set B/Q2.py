import matplotlib.pyplot as plt
from sklearn.datasets import load_iris
iris=load_iris()
data=iris.data
sepal_length=data[:,0]
sepal_width=data[:,1]
plt.figure(figsize=(10,5))
plt.scatter(sepal_length,sepal_width,c=iris.target)
plt.title("Reletionship between sepal length and sepal width")
plt.xlabel("sepal length(cm)")
plt.ylabel("sepal width(cm)")
plt.colorbar(ticks=[0,1,2],label='species')
plt.grid(True)
plt.show()
