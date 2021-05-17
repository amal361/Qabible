package utility;

import java.io.IOException;



public class ExcelFinal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelValue ex=new ExcelValue();
		
		for(int i=0;i<ex.rowsize();i++)
		{
			for(int j=0;j<2;j++)
			{
				String s=ex.readData(i,j);
				System.out.println("value of cell:"+s);
	}

}
}
}