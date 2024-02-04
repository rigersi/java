

public class ProfilShendetesor {
	private String emri; 
	private String mbiemri;
	private String gjinia;
	private Data DTL;
	private double gjatesia;
	private double pesha;


public ProfilShendetesor() {
	this.emri = "";
	this.mbiemri="";
	this.gjinia="";
	this.gjatesia=0.0;
	this.pesha=0.0;
}
public ProfilShendetesor(String emri,String mbiemri,String gjinia,Data DTL, double gjatesia, double pesha) {
	this.emri = emri;
	this.mbiemri=mbiemri;
	this.gjinia=gjinia;
	this.gjatesia=gjatesia;
	this.pesha=pesha;
}
public String getEmri() {
	return emri;
}
public void setEmri(String emri) {
	this.emri = emri;
}
public String getMbiemri() {
	return mbiemri;
}
public void setMbiemri(String mbiemri) {
	this.mbiemri = mbiemri;
}
public String getGjinia() {
	return gjinia;
}
public void setGjinia(String gjinia) {
	this.gjinia = gjinia;
}
public Data getDTL() {
	return DTL;
}
public void setDTL(Data dTL) {
	DTL = dTL;
}
public double getGjatesia() {
	return gjatesia;
}
public void setGjatesia(double gjatesia) {
	this.gjatesia = gjatesia;
}
public double getPesha() {
	return pesha;
}
public void setPesha(double pesha) {
	this.pesha = pesha;
}

}