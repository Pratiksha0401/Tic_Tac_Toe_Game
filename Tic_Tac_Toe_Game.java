class Tic_Tac_Toe_Game implements Board
{

	public void UC1(){
	
		char [] board={' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
		for(int i=1;i<board.length;i++)
		{
			System.out.println(board[i]+"|"+board[(++i)]+"|"+board[(++i)]);
			System.out.println("-+"+"-+-");

		}
	}
	public static void main(String[] args) 
	{
		Tic_Tac_Toe_Game t1=new Tic_Tac_Toe_Game();
		t1.UC1();
	}
}

interface Board
{
	void UC1();
}

