interface document        
{
	public void open();
}

class WordDocument implements document
{
	public void open()
	{
		System.out.println("Opening Word Document");
	}
}


class PdfDocument implements document
{
	public void open()
	{
		System.out.println("Opening Pdf Document");
	}
}

class ExcelDocument implements document
{
	public void open()
	{
		System.out.println("Opening Excel Document");
	}
}

abstract class DocumentFactory 
{
	public abstract document createDocument(); // Factory method
}
 
//concrete factories to get each object of the document 
class WordDocumentFactory extends DocumentFactory
{
   public document createDocument()
   {
	   return new WordDocument();
   }
}

class PdfDocumentFactory extends DocumentFactory
{
   public document createDocument()
   {
	   return new PdfDocument();
   }
}

class ExcelDocumentFactory extends DocumentFactory
{
   public document createDocument()
   {
	   return new ExcelDocument();
   }
}
// the test class for testing the factory design pattern
public class test {
     //client knows only abstract factory i.e (DocumentFactory) and common interface (document) 
	public static void main(String[] args) {
		
		// creating WordDocument
		DocumentFactory factory=new WordDocumentFactory(); // client chooses desired factory
		document obj1=factory.createDocument(); //creates the document using desired factory
		obj1.open();
	    //creating PdfDocument
		DocumentFactory factory2=new PdfDocumentFactory(); // client chooses desired factory
		document obj2=factory2.createDocument(); //creates the document using desired factory
		obj2.open();
	  //creating ExcelDocument
		DocumentFactory factory3=new ExcelDocumentFactory(); // client chooses desired factory
		document obj3=factory3.createDocument(); //creates the document using desired factory
		obj3.open();

	}

}
