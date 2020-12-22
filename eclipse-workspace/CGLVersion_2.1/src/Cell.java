
public class Cell {
	private boolean status;
	public Cell(boolean status) {
		this.status = status;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String toString() {
		return ""+this.status;
		
	}
	
}
