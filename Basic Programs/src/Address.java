
public class Address 
{
private int hno;
private String colony;
private String state;
private String country;


public Address(int hno, String colony, String state, String country) {
	super();
	this.hno = hno;
	this.colony = colony;
	this.state = state;
	this.country = country;}
public String toString() {
		
		return " House num :"+hno +"  colony :"+colony+"  state :"+state+"  Country :"+country;
	}
}
