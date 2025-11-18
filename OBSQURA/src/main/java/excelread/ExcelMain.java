package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args)
		throws IOException {
			String s= ExcelCode.readStringData(2,0);//row and column
			System.out.println(s);
			String s1=ExcelCode.readIntegerData(1,1); 
			System.out.println(s1);
		}

	}

