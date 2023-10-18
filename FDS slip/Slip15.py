Q1.
1. Generate an array of 5 integers and display them using box plot Apply appropriate color, labels and
styling options. 
2. Add two outliers to the above data and display the box plot. 

PROGRAM-1
import numpy as np
import matplotlib.pyplot as plt
x=np.random.rand(5)
y=np.random.rand(5)
plt.boxplot(x,color="m",linewidth=2,edgecolor="b",bins=30,alpha=0.6)
plt.show()

PROGRAN-2
import numpy as np
import matplotlib.pyplot as plt
x=np.random.rand(50)
arr1=np.append(x,[2,3])
plt.boxplot(arr1)
plt.show()