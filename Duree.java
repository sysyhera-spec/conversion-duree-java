package exam_tp_2223;

public class Duree {
	private int heures;
    private int minutes;
    private int secondes;
    
    public Duree() {
        heures = 0;
        minutes = 0;
        secondes = 0;
    }
    
    public void incrementHeures() { 
    	heures = (heures + 1) % 24; 
    }
    
    public void decrementHeures() { 
    	heures = (heures - 1 + 24) % 24; 
    }

    public void incrementMinutes() { 
    	minutes = (minutes + 1) % 60; 
    }
    
    public void decrementMinutes() { 
    	minutes = (minutes - 1 + 60) % 60; 
    }

    public void incrementSecondes() { 
    	secondes = (secondes + 1) % 60; 
    }
    
    public void decrementSecondes() { 
    	secondes = (secondes - 1 + 60) % 60; 
    }
	
    public String toString() {
        return String.format("%02d:%02d:%02d", heures, minutes, secondes);
    }
}
