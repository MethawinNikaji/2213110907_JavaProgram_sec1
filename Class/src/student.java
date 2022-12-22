
public class student {
	private String Name;
	private int Score;
	public void setName(String name) {
		name = Name;
	}
	public String Getname() {
		return  Name;
	}
	public void Setscore(int score) {
		score = Score;
	}
	public int Getscore() {
		return Score;
	}
	public boolean Checkscore() {
		if(Score>=0 && Score<=100) {
			return true;
		}else {
				return false;
			}
				
		}	
	public boolean isPass() {
		if(Score>=100) {
			return true;
		}else {
				return false;
			}
		
		}
	public String findGrade() {
		// TODO Auto-generated method stub
		return null;
	}
	}
		
	


