
public class Rahmenprogramm {
	private String bezeichnung;
	private int datum;
	private int zeit;
	private String ort;
	
	public Rahmenprogramm (String bezeichnung, int datum, int zeit, String ort) {
		this.bezeichnung = bezeichnung;
		this.datum = datum;
		this.zeit = zeit;
		this.ort = ort;
		
	}
	public String getBezeichnung() { 
        return bezeichnung; 
    } 
  
    public void setBezeichnung(String bezeichnung) { 
        this.bezeichnung = bezeichnung; 
    } 
  
    public int getDatum() { 
        return datum; 
    } 
  
    public void setDatum(int datum) { 
        this.datum = datum; 
    } 
  
    public String getOrt() { 
        return ort; 
    } 
  
    public void setOrt(String ort) { 
        this.ort = ort; 
    } 
  
    public int getZeit() { 
        return zeit; 
    } 
  
    public void setZeit(int zeit) { 
        this.zeit = zeit; 
    } 
    
    public void addTeilnehmer(Teilnehmer teilnehmer){
		teilnehmer.add(teilnehmer);
	}
    
	public String toString() {
		return "Workshop: [Bezeichnung=" + bezeichnung + ", Datum=" + datum + ", Zeit="
				+ zeit + ", Ort=" + ort + "]";
	}
	
}


