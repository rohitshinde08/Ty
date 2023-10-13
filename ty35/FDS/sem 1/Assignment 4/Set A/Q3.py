import matplotlib.pyplot as plt
subject=["math","science","history","english","art"]
marks=[90,85,72,98,88]
plt.figure(figsize=(8,8))
plt.pie(marks,labels=subject,autopct='%1.1f%%',startangle=140)
plt.title("marks distribution by subject(pie chart)")
plt.axis("Equal")
plt.figure(figsize=(5,5))
plt.bar(subject,marks,color="skyblue")
plt.title("Marks distribution by subject(bar chart)")
plt.xlabel("Subjects")
plt.ylabel("marks")
plt.ylim(0,100)
plt.tight_layout()
plt.show()
