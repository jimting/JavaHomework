package ntou.cs.java2016.jimmy;

import java.util.Scanner;
//運用二維矩陣來存數字
//然後用enum來存方向
//把四個可能性分開寫(所以寫了一大堆functionQQ)
public class SpriralMatrix 
{
	private int Length = 0;  
	private int Direct = 0;
	private int InOut = 0;
	private int value = 1;  
	private int[][] snake;  
	private Direction lastDirection;  
  
    static enum Direction {  
        Right, Down, Left, Up;  
    }  
    public SpriralMatrix() {  
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        while(!(Direct == 1 || Direct == 2))
        {
        	System.out.println("請輸入順時針(1)或逆時針(2)？");
        	Direct = scanner.nextInt();
        }
        while(!(InOut == 1 || InOut == 2))
        {
        System.out.println("請輸入內迴旋(1)或外迴旋(2)？");
        InOut = scanner.nextInt();
        }
        if(InOut == 1)
        {
        	System.out.println("請輸入邊長(<100)？");
        	Length = scanner.nextInt();
        }
        else if(InOut == 2)
        {
        	System.out.println("請輸入邊長(奇數且<100)？");
        	Length = scanner.nextInt();
        	while(Length%2 == 0)
        	{
        		System.out.println("邊長應為奇數，請重新輸入！");
        		System.out.println("請輸入邊長(奇數且<100)？");
            	Length = scanner.nextInt();
        	}
        		
        }
        snake = new int[Length][Length];
        if(Direct == 1)
        {
        	if(InOut == 1)
        		this.InClockwise();
        	else if(InOut == 2)
        		this.OutClockwise();
        }
        	
        else if(Direct == 2)
        {
        	if(InOut == 1)
        		this.InCounterclockwise();
        	else if(InOut == 2)
        		this.OutCounterclockwise();
        }
    }
    public void InCounterclockwise()
    {
    	lastDirection = Direction.Down;
    	int row = 0, line = 0;  
        for (int c = 0; c < Length * Length; c++) {  
            snake[row][line] = value;
            lastDirection = InCounterFindDirection(row, line);  
            switch (lastDirection) {  
                case Right:  
                    line++;  
                    break;  
                case Down:  
                    row++;  
                    break;  
                case Left:  
                    line--;  
                    break;  
                case Up:  
                    row--;  
                    break;  
                default:  
                    System.out.println("error");  
            }  
            value++;  
        }  
    }
    public void InClockwise()
    {
    	lastDirection = Direction.Right;
    	int row = 0, line = 0;  
        for (int c = 0; c < Length * Length; c++) {  
            snake[row][line] = value;
            lastDirection = InWiseFindDirection(row, line);  
            switch (lastDirection) {  
                case Right:  
                    line++;  
                    break;  
                case Down:  
                    row++;  
                    break;  
                case Left:  
                    line--;  
                    break;  
                case Up:  
                    row--;  
                    break;  
                default:  
                    System.out.println("error");  
            }  
            value++;  
        }  
    }
    Direction InWiseFindDirection(int row, int line) {  
        Direction direction = lastDirection;  
        switch (direction) {  
            case Right: {  
                if ((line == Length - 1) || (snake[row][line + 1] != 0))  
                    direction = direction.Down;  
                break;  
            }  
            case Down: {  
                if ((row == Length - 1) || (snake[row + 1][line] != 0))  
                    direction = direction.Left;  
                break;  
            }  
            case Left: {  
                if ((line == 0) || (snake[row][line - 1] != 0))  
                    direction = direction.Up;  
                break;  
            }  
            case Up: {  
                if (snake[row - 1][line] != 0)  
                    direction = direction.Right;  
                break;  
            }  
        }  
        return direction;  
    }  
    Direction InCounterFindDirection(int row, int line) {  
        Direction direction = lastDirection;  
        switch (direction) {  
            case Right: {  
                if ((line == Length - 1) || (snake[row][line + 1] != 0))  
                    direction = direction.Up;  
                break;  
            }  
            case Down: {  
                if ((row == Length - 1) || (snake[row + 1][line] != 0))  
                    direction = direction.Right;  
                break;  
            }  
            case Left: {  
                if ((line == 0) || (snake[row][line - 1] != 0))  
                    direction = direction.Down;  
                break;  
            }  
            case Up: {  
                if ((row == 0) || snake[row - 1][line] != 0)  
                    direction = direction.Left;  
                break;  
            }  
        }  
        return direction;  
    }
    public void OutCounterclockwise()
    {
    	lastDirection = Direction.Up;
    	int row = (Length)/2, line = (Length)/2;  
        for (int c = 0; c < Length * Length; c++) {  
            snake[row][line] = value;
            lastDirection = OutCounterFindDirection(row, line);  
            switch (lastDirection) {  
                case Right:  
                    line++;  
                    break;  
                case Down:  
                    row++;  
                    break;  
                case Left:  
                    line--;  
                    break;  
                case Up:  
                    row--;  
                    break;  
                default:  
                    System.out.println("error");  
            }  
            value++;  
        }  
    }
    public void OutClockwise()
    {
    	lastDirection = Direction.Up;
    	int row = (Length)/2, line = (Length)/2;   
        for (int c = 0; c < Length * Length; c++) {  
            snake[row][line] = value;
            lastDirection = OutWiseFindDirection(row, line);  
            switch (lastDirection) {  
                case Right:  
                    line++;  
                    break;  
                case Down:  
                    row++;  
                    break;  
                case Left:  
                    line--;  
                    break;  
                case Up:  
                    row--;  
                    break;  
                default:  
                    System.out.println("error");  
            }  
            value++;  
        }  
    }
    Direction OutWiseFindDirection(int row, int line) {  
        Direction direction = lastDirection;  
        switch (direction) 
        {  
        	case Left: 
        	{  
        		if ((snake[row - 1][line] == 0))  
        			direction = direction.Up;
        		break;  
        	}  
        	case Down: 
        	{  
        		if ((snake[row][line - 1] == 0))  
        			direction = direction.Left;  
        		break;  
        	}  
        	case Right: 
        	{  
        		if ((snake[row + 1][line] == 0))  
        			direction = direction.Down;  
        		break;  
        	}  
        	case Up: 
        	{  
        		if (snake[row][line + 1] == 0)  
        			direction = direction.Right;  
        		break;  
        	}  
        }  
        return direction;  
    }  
    Direction OutCounterFindDirection(int row, int line) {  
        Direction direction = lastDirection;  
        switch (direction) {  
            case Right: {  
                if ((snake[row - 1][line] == 0))  
                    direction = direction.Up;
                break;  
            }  
            case Down: {  
                if ((snake[row][line + 1] == 0))  
                    direction = direction.Right;  
                break;  
            }  
            case Left: {  
                if ((snake[row + 1][line] == 0))  
                    direction = direction.Down;  
                break;  
            }  
            case Up: {  
                if (snake[row][line - 1] == 0)  
                    direction = direction.Left;  
                break;  
            }  
        }  
        return direction;  
    }  
    public void Print() { 
        // display.....  
        for (int i = 0; i < Length; i++) {  
            for (int j = 0; j < Length; j++) {  
                System.out.print(snake[i][j] + "\t");  
            }  
            System.out.println();  
        }  
    }
}
