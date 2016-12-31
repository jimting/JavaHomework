package ntou.cs.java2016.jimmy;

import java.util.Scanner;
//�B�ΤG���x�}�Ӧs�Ʀr
//�M���enum�Ӧs��V
//��|�ӥi��ʤ��}�g(�ҥH�g�F�@�j��functionQQ)
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
        	System.out.println("�п�J���ɰw(1)�ΰf�ɰw(2)�H");
        	Direct = scanner.nextInt();
        }
        while(!(InOut == 1 || InOut == 2))
        {
        System.out.println("�п�J���j��(1)�Υ~�j��(2)�H");
        InOut = scanner.nextInt();
        }
        if(InOut == 1)
        {
        	System.out.println("�п�J���(<100)�H");
        	Length = scanner.nextInt();
        }
        else if(InOut == 2)
        {
        	System.out.println("�п�J���(�_�ƥB<100)�H");
        	Length = scanner.nextInt();
        	while(Length%2 == 0)
        	{
        		System.out.println("��������_�ơA�Э��s��J�I");
        		System.out.println("�п�J���(�_�ƥB<100)�H");
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
