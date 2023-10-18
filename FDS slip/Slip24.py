Q1. Create two lists, one representing subject names and the other representing 
marks obtained in those subjects. Display the data in bar chart.

import matplotlib.pyplot as plt
sub=['FDS','WT','TCS','CN']
marks=[77,89,80,92]
plt.bar(sub,marks,color="g",width=0.5,align="center",bottom=10,edgecolor="b",linewidth=2,tick_label=sub)
plt.show()