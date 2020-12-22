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

	public Board Nextgen(Board board) {
		for (int i = 1; i < this.size - 1; i++) {
			for (int j = 1; j < this.size - 1; j++) {
				int check = 0;
				if (this.cell[i + 1][j + 1].isStatus()) {
					check++;
				}
				if (this.cell[i - 1][j - 1].isStatus()) {
					check++;
				}
				if (this.cell[i][j + 1].isStatus()) {
					check++;
				}
				if (this.cell[i][j - 1].isStatus()) {
					check++;
				}
				if (this.cell[i + 1][j].isStatus()) {
					check++;
				}
				if (this.cell[i - 1][j].isStatus()) {
					check++;
				}
				if (this.cell[i + 1][j - 1].isStatus()) {
					check++;
				}
				if (this.cell[i - 1][j + 1].isStatus()) {
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
					} else {
						board.cell[i][j].setStatus(false);
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
