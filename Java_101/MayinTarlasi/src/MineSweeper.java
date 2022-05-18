import java.util.Scanner;

public class  MineSweeper {
    int row,column;
    String board[][];
    String boardEmp[][];


    public void Run(){
        

        Scanner in = new Scanner(System.in);
        System.out.print("Row: ");
        int row = in.nextInt();
        System.out.println();
        System.out.print("Column: ");
        int column=in.nextInt();

        createBoard(row,column);
        createMine(row,column);

        System.out.println("------Welcome to the Mine Sweeper Game !!------- ");
        int loop=(column*row)-((column*row)/4);
        int stop=0;

        displayBoardEmp(row, column);

        

        while(stop!=loop){

            int mineValue=0;

            System.out.print("Please enter the number of row: ");
            int row2=in.nextInt();
            System.out.println();
            System.out.print("Please enter the number of column: ");
            int column2=in.nextInt();


            if(board[row2][column2]=="*"){
                System.out.println(" -----Game Over-----");
                break;
            }else{

                if(row2-1>=0){
                    if(board[row2-1][column2]=="*"){  
                        mineValue+=1;
                    }
                }

                if(row2+1<row){
                    if(board[row2+1][column2]=="*"){
                        mineValue+=1;
    
                    }    
                }

                if(column2-1>=0){
                    if(board[row2][column2-1]=="*"){
                        mineValue+=1;
    
                    }
                }

                if(column>column2+1){
                    if(board[row2][column2+1]=="*"){
                        mineValue+=1;
    
                    }
                    
                }
                
                if (row>row2+1 && column>column2+1){

                    if(board[row2+1][column2+1]=="*"){
                        mineValue+=1;
    
                    }

                }

                if(row2-1>=0 && column>column2+1){
                    if(board[row2-1][column2+1]=="*"){
                        mineValue+=1;
    
                    }
                }

                if(row2-1>=0 && column2-1>=0){
                    if(board[row2-1][column2-1]=="*"){
                        mineValue+=1;
    
                    }
                }

                if(row>row2+1 && column2-1>=0){
                    if(board[row2+1][column2-1]=="*"){

                    }

                }

                

                stop++;


            }

            boardEmp[row2][column2]=String.valueOf(mineValue);

            displayBoardEmp(row, column);
            


        }

        if(stop==loop){
            System.out.println("---- Win ! ----");
        }

        in.close();
     

    }


    public void createBoard(int row, int column){
        board=new String[row][column];
        boardEmp=new String[row][column];


        for (int i=0;i<row;i++){

            for(int j=0;j<column;j++){

                board[i][j]="-";
                boardEmp[i][j]="-";

            }

        }
        

    }

    public void createMine(int row, int column){        

        int mineNumber=(row*column)/4;

        for (int i=0;i<mineNumber;i++){

            int randMineRow=(int)((Math.random())*(row));
            int randMinecolumn=(int)((Math.random())*(column));

            board[randMineRow][randMinecolumn]="*";


        }

        displayBoardWithMine(row, column);


    }

    public void displayBoardWithMine(int row,int column) {
		
		for(int s=0; s < row; s++) {
			for(int k=0; k <column; k++) {
				System.out.print("\t" + board[s][k]);
			}
			System.out.println();
		}
	}

    public void displayBoardEmp(int row,int column) {
		
		for(int s=0; s < row; s++) {
			for(int k=0; k <column; k++) {
				System.out.print("\t" + boardEmp[s][k]);
			}
			System.out.println();
		}
	}



    
}
