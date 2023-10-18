Q1. Create two lists, one representing subject names and the other representing 
marks obtained in those subjects. Display the data in a pie chart.

import matplotlib.pyplot as plt
sub=['FDS','WT','TCS','CN']
marks=[77,89,80,92]
plt.pie(marks,labels=sub,autopct="%1.1f%%",explode=[0.5,0.0,0.0,0.0])
plt.show()