from sklearn.datasets import load_iris
import matplotlib.pyplot as plt
iris=load_iris()
data=iris.data
features=iris.feature_names
species=iris.target_names
for i,feature in enumerate(features):
     plt.figure(figsize=(10,5))
     plt.boxplot([data[iris.target==j,i] for j in range(3)])
     plt.xticks([1,2,3],species)
     plt.title("boxplot for (feature)")
     plt.xlabel("species")
     plt.ylabel("cm")
     plt.grid(True)
     plt.show()
