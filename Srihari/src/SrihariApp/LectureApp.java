package SrihariApp;

public class LectureApp 
{

	public static void main(String[] args) 
	{
		Lecture L1 = new Lecture("Hari",49,12345,"Female",89.7F);
		L1.teach();
		new Lecture("Sri",122,14785,"Male",89.1F).teach();

	}

}
