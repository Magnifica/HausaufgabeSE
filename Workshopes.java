public class Workshopes {
	private int nummer;
	private int datum;
	private String bezeichnung;
	
	public Workshopes (int nummer, int datum, String bezeichnung) {
		this.nummer = nummer;
		this.datum = datum;
		this.bezeichnung = bezeichnung;
	}
	
	public int getNummer() { 
        return nummer; 
    } 
  
    public void setNummer(int nummer) { 
        this.nummer = nummer; 
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
    
    public void addTeilnehmer(Teilnehmer teilnehmer){
		teilnehmer.add(teilnehmer);
	}
    
	public String toString() {
		return "Workshop: [Nummer=" + nummer + ", Datum=" + datum + ", Bezeichnung="
				+ bezeichnung + "]";
	}
	
}
