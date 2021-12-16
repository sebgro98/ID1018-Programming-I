package B;

class Polylinje1 
{ 
    private Punkt[]    horn; //Skapas en array av typen Punkt och horn är en referens inte ett objekt. 
    private String     farg = "svart"; 
    private int        bredd = 1; 
 
    public Polylinje1 () 
    { 
        this.horn = new Punkt[0];  
        //Skapar en array med objekter av typen Punkt, 
        //och låt referensen med index 0 referera till objekt som finns på index 0.
    } 
 
    public Polylinje1 (Punkt[] horn) 
    { 
        this.horn = new Punkt[horn.length]; 
        for (int i = 0; i < horn.length; i++) 
            this.horn[i] = new Punkt (horn[i]); 
    } 
 
    public String toString () {
        StringBuilder    sb = new StringBuilder("[{"); 
        for (int i= 0; i < this.horn.length; i++)
        {
            sb.append ( this.horn[i] ); 
        }
        sb.append("}" + ", " + farg + ", " + bredd + "]"); 
        return sb.toString(); 
    } 
 
    public Punkt[] getHorn () {
        return horn; 
    } 
 
    public String getFarg () {
        return this.farg;
    } 
 
    public int getBredd () {
        return this.bredd;  
    }

    public void setFarg (String farg) {
        this.farg = farg; 
    } 
 
    public void setBredd (int bredd) {
        this.bredd = bredd;
    } 
 
    public double langd () {
    	double langd = 0;

        for (int i = 1; i < this.horn.length; i++) {
            langd += this.horn[i-1].avstand(this.horn[i]);
        }
        return langd;
    }
    //Lägger till ett hörn i slutet av vektorn 
    // genom att skapa en vecktor som har ett mer plats än den aktuella vecktorn
    // och lägger till punkter samt den nya punkten i sista position. 
    public void laggTill (Punkt horn) 
    { 
        Punkt[]    h = new Punkt[this.horn.length + 1]; 
        int    i = 0; 
        for (i = 0; i < this.horn.length; i++) 
            h[i] = this.horn[i]; 
        h[i] = horn; 
 
        this.horn = h; 
    } 

    // Lägger till ett hörn framför det hörn som har samma namn.
    public void laggTillFramfor (Punkt horn, String hornNamn) {
        Punkt[]    h = new Punkt[this.horn.length + 1]; // längden+1 för den aktuella hörn.
        int pos = 0; 
        for (int i = 0; i < this.horn.length; i++) {
            h[pos] = this.horn[i];
                if (hornNamn.equals(this.horn[i].getNamn())){ //Kollar om de har samma namn
                     h[pos] = horn; //Lägger den nya hörn
                     h[++pos] = this.horn[i]; // lägger den aktuella hörn på nästa plats
                }  
            pos++; 
        }
        this.horn = h; // 
    }

    // tar bort horn med ett visst hörnNamn. 
    public void taBort (String hornNamn) {
        Punkt[]    h = new Punkt[this.horn.length - 1]; // längden -1 för den aktuella hörn.
        int    pos = 0;
        for (int i = 0; i < this.horn.length; i++) {
            if (this.horn[i].getNamn().equals(hornNamn)) {
                i++;   
            }
        h[pos] = this.horn[i];
        pos++; 
        }
        this.horn = h; 
    } 
    
    public class PolylinjeIterator {

    	private int aktuell = -1;
    	
    	public PolylinjeIterator () {
    	
    		if (Polylinje1.this.horn.length > 0)
    			aktuell = 0;
    	}
    	
    	public boolean finnsHorn () {
    		
    		return aktuell != -1;
    	}
    	
    	public Punkt horn () throws java.util.NoSuchElementException {
    	
    		if (!this.finnsHorn ()) throw new java.util.NoSuchElementException ("slut av iterationen");
    	
    		Punkt horn = Polylinje1.this.horn[aktuell];
    		return horn;
    	}
    	
    	public void gaFram () {
    		if (aktuell >= 0 &&
    				aktuell < Polylinje1.this.horn.length - 1)
    			aktuell++;
    		else
    			aktuell = -1;
    	}
    }
}