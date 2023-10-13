import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
nums=np.array([0.5,0.7,1,1.2,1.3,2.1])
bins=np.array([0,1,2,3])
print("Nums:",nums)
print("Bins:",bins,"\n")
plt.hist(nums,bins,edgecolor="pink",alpha=0.4)
plt.show()

