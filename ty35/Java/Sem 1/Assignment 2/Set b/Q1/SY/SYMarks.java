package SY;
public class SYMarks{
	int CompTotal;
	int MathsTotal;
	int ElecTotal;
public SYMarks(int CompTotal,int MathsTotal,int ElecTotal)
{
	this.CompTotal=CompTotal;
	this.MathsTotal=MathsTotal;
	this.ElecTotal=ElecTotal;
}
public int getCompTotal(){
	return CompTotal;
}
public int getMathsTotal(){
	return MathsTotal;
}
public int getElecTotal(){
	return ElecTotal;
}
}
