import seaborn as sns
import matplotlib.pyplot as p
iris_data=sns.load_dataset('iris')
species_counts=iris_data['species'].value_counts()
p.figure(figsize=(8,6))
p.pie(species_counts,labels=species_counts.index,autopct='%1.1F%%',colors=["skyblue","lightcoral","lightgreen"])
p.title("frequency of iris species")
p.axis('equal')
p.show()
