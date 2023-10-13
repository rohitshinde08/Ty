import matplotlib.pyplot as plt
from sklearn.datasets import load_iris
iris=load_iris()
data=iris.data
petal_length=data[:,2]
petal_width=data[:,3]
plt.figure(figsize=(10,5))
plt.scatter(petal_length,petal_width,c=iris.target)
plt.title("Reletionship between petal length and petal width")
plt.xlabel("petal length(cm)")
plt.ylabel("petal width(cm)")
plt.colorbar(ticks=[0,1,2],label='species')
plt.grid(True)
plt.show()
