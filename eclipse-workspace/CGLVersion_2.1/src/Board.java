import java.util.Arrays;

public class Board {
	private int size;
	Cell[][] cell;

	public Board(int size) {
		this.size = size;
		this.cell=new Cell[this.size][this.size];
	}

	public Board createBoard() {
		for (int i = 0; i < this.getSize(); i++) {
			for (int j = 0; j < this.getSize(); j++) {
				this.cell[i][j] = new Cell(false);
			}
		}
		return this;
	}
	public int mdivision(int x) {
		
		return ((x % this.size) + this.size) % this.size;
	}

	public Board Nextgen(Board board) {
		for (int i = 0; i < this.size; i++) {
			for (int j = 0; j < this.size; j++) {
				int check = 0;
				if (this.cell[mdivision(i + 1)][mdivision(j + 1)].isStatus()) {
					check++;
				}
				if (this.cell[mdivision(i - 1)][mdivision(j - 1)].isStatus()) {
					check++;
				}
				if (this.cell[mdivision(i)][mdivision(j + 1)].isStatus()) {
					check++;
				}
				if (this.cell[mdivision(i)][mdivision(j - 1)].isStatus()) {
					check++;
				}
				if (this.cell[mdivision(i + 1)][mdivision(j)].isStatus()) {
					check++;
				}
				if (this.cell[mdivision(i - 1)][mdivision(j)].isStatus()) {
					check++;
				}
				if (this.cell[mdivision(i + 1)][mdivision(j - 1)].isStatus()) {
					check++;
				}
				if (this.cell[mdivision(i - 1)][mdivision(j + 1)].isStatus()) {
					check++;
				}
				if (this.cell[i][j].isStatus()) {
					if (check == 2 || check == 3) {
						board.cell[i][j].setStatus(true);
					} else {
						board.cell[i][j].setStatus(false);
					}
				} else {
					if (check == 3) {
						board.cell[i][j].setStatus(true);
					}
				}

			}
		}
		return board;

	}

	@Override
	public String toString() {
		String res="";
		for(int i=0;i<this.size;i++) {
			for(int j=0;j<this.size;j++) {
				if(this.cell[i][j].isStatus()) {
					res+="*";
				}
				else {
					res+="_";
				}
			}
			res+="\n";
		}
		return res;
	}

	public int getSize() {
		return size;
	}

//	public void setSize(int size) {
//		this.size = size;
//	}

}
