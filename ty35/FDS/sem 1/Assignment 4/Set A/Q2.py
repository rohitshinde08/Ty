import numpy as np
import matplotlib.pyplot as plt
np.random.seed(45)
random_data=np.random.randint(1,100,50)
outliers=[150,175]
random_data=np.append(random_data,outliers)
fig,axs=plt.subplots(1,2,figsize=(12,6))
fig.suptitle("Box plot with outliers")
axs[0].boxplot(random_data[:-2],vert=False,patch_artist=True,boxprops=dict(facecolor="yellow"))
axs[0].set_title("Box plot(no outliers)")
axs[1].boxplot(random_data,vert=False,patch_artist=True,boxprops=dict(facecolor="yellow"))
axs[1].set_title("Box plot(with outliers)")
plt.tight_layout(rect=[0,0,1,0.85])
plt.show()
