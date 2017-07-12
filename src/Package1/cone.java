package Package1;

public class cone {
double radius;
double height;
public double getconevolume()
{
	return(0.3*3.14*radius*radius*height);
}
cone(){
	radius=10;
	height=10;
}
cone(double r,double h){
	radius=r;
	height=h;
}

}
