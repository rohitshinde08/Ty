Q1. Generate a random array of 50 integers and display them using a line chart, 
scatter plot, histogram and box plot. Apply appropriate color, labels and styling 
options. 
import numpy as np
import matplotlib.pyplot as plt
x=np.random.rand(50)
y=np.random.rand(50)
#plt.plot(x,y)
#plt.hist(x,color="m",linewidth=2,edgecolor="b",bins=30,alpha=0.6)
#plt.boxplot(x)
plt.scatter(x,y,color="m",marker="*")
plt.show()