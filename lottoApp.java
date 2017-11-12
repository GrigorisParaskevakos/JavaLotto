/*  Author: Paraskevakos G. | 2015
*   !COMMENTS ARE IN GREEK!
*/

/*Ο ΧΡΗΣΤΗΣ ΕΙΣΑΓΕΙ ΔΙΑΦΟΡΕΤΙΚΟΥΣ ΑΡΙΘΜΟΥΣ ΑΠΟ ΤΟ 1 ΕΩΣ ΤΟ 49 SE ΑΥΞΟΥΣΑ ΣΕΙΡΑ ΚΑΙ ΤΟ ΠΡΟΓΡΑΜΜΑ ΠΑΡΑΓΕΙ 6ΑΔΕΣ ΣΥΝΔΥΑΣΜΩΝ ΤΩΝ ΕΙΣΑΧΘΕΝΤΩΝ ΑΡΙΘΜΩΝ ΜΕ ΒΑΣΗ ΚΑΠΟΙΑ ΦΙΛΤΡΑ ΤΑ ΟΠΟΙΑ ΓΝΩΡΙΖΕΙ Ο ΧΡΗΣΤΗΣ
*ΤΟ ΠΡΟΓΡΑΜΜΑ ΣΤΑΜΑΤΑΕΙ ΝΑ ΔΕΧΕΤΑΙ ΑΡΙΘΜΟΥΣ ΑΠΟ ΤΟΝ ΧΡΗΣΤΗ ΟΤΑΝ ΑΥΤΟΣ ΔΩΣΕΙ ΟΛΟΥΣ ΤΟΥΣ ΑΡΙΘΜΟΥΣ ΑΠΟ ΤΟ 1 ΕΩΣ ΤΟ 49 ή ΟΤΑΝ ΓΡΑΨΕΙ -1
*/
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;




public class lottoApp 
{


	public static void main(String[] args) throws Exception
	{
		DateFormat dateFormat = new SimpleDateFormat("(dd-MM-yy)HH.mm.ss"); //ΣΤΙΓΜΙΟΤΥΠΟ ΤΩΝ ΕΚΑΣΤΟΤΕ ΔΟΚΙΜΑΣΤΙΚΩΝ ΣΥΝΔΥΑΣΜΩΝ ΠΟΥ ΠΑΡΑΓΟΥΝ ΔΕΔΟΜΕΝΑ ΜΕ ΩΡΑ ΚΑΙ ΗΜ/ΝΙΑ ΣΤΟ ΟΝΟΜΑ ΤΟΥ ΑΡΧΕΙΟΥ
		Date date = new Date();
		FileOutputStream f = new FileOutputStream("C:\\EclipseMars_EXports\\" + dateFormat.format(date) + "_Lotto.txt");// ΕΞΑΓΕΙ ΣΕ ΑΡΧΕΙΟ .txt ΌΠΟΥ ΈΧΟΥΜΕ System.out.print(); ΜΕΣΑ ΣΤΟ ΠΡΟΓΡΑΜΜΑ
		System.setOut(new PrintStream(f));
		
		Scanner in = new Scanner(System.in);
		int a[] = new int[49];//ΔΗΛΩΝΩ ΠΙΝΑΚΑ 49 ΘΕΣΕΩΝ
		int num;
		int p=0;
		
		do
		{
			num = in.nextInt();
			if(num>=1&&num<=49)
			{
					a[p]=num;// ΕΙΣΑΓΕΙ ΤΟ ΚΑΘΕ ΑΡΙΘΜΟ ΣΤΟΝ ΠΙΝΑΚΑ ΕΦΟΣΟΝ ΕΙΝΑΙ true Η ΣΥΝΘΗΚΗ ΤΟΥ if
					p++;	//ΑΝΕΒΑΖΕΙ ΤΙΣ ΘΕΣΕΙΣ ΤΟΥ ΠΙΝΑΚΑ
					
			}
			else if(num<-1) //ΕΑΝ Ο ΧΡΗΣΤΗΣ ΕΙΣΑΓΕΙ -1 ΤΟΤΕ ΣΤΑΜΑΤΑΕΙ ΤΟ ΠΡΟΓΡΑΜΜΑ
				{
				System.out.println("Εισάγετε θετικούς αριθμούς από το 1 έως το 49 αυτήν τη φορά...");//ΑΝ Ο ΧΡΉΣΤΗΣ ΔΩΣΕΙ ΑΡΝΗΤΙΚΟΥΣ ΑΡΙΘΜΟΥΣ ΤΟΝ ΕΙΔΟΠΟΙΕΙ  ΝΑ ΕΙΣΑΓΕΙ ΑΡΙΘΜΟΥΣ ΑΠΟ ΤΟ 1 ΕΩΣ ΤΟ 49 
				}
		}
																												
		while (p<50&&num!=-1);// ΔΙΑΒΑΖΕΙ ΤΟΥΣ ΑΡΙΘΜΟΥΣ ΠΟΥ ΕΙΣΑΓΕΙ Ο ΧΡΗΣΤΗΣ ΚΑΙ ΣΤΑΜΑΤΑΕΙ ΟΤΑΝ Ο ΧΡΗΣΤΗΣ ΕΙΣΑΓΕΙ ΤΟ -1 ή OTAN ΓΕΜΙΣΕΙ Ο ΠΙΝΑΚΑΣ
	
		in.close(); //ΚΛΕΙΝΕΙ Ο Scanner
		
		System.out.println("Tα δοκιμαστικά δεδομένα είναι : ");
		System.out.println();
		for (int s=0; s<=(p-1); s++)
		{
			System.out.print(a[s]+" ");//ΕΜΦΑΝΙΖΕΙ ΟΛΟΥΣ ΤΟΥΣ ΑΡΙΘΜΟΥΣ ΟΠΩΣ ΤΟΥΣ ΕΙΣΑΓΕΙ Ο ΧΡΗΣΤΗΣ
		}
		System.out.println();
		System.out.println();
		System.out.println("Οι τυχερές εξάδες είναι :"); 
		System.out.println();
		
		int i,j,l,k,q,z; //ΔΗΛΩΝΟΥΜΕ ΜΕΤΑΒΛΗΤΕΣ ΠΟΥ ΘΑ ΧΤΗΣΙΜΟΠΟΙΗΣΩ ΣΤΙΣ ΠΑΡΑΚΑΤΩ for
		int count=1;// ΔΗΛΩΝΩ & ΑΡΧΙΚΟΠΟΙΩ ΕΝΑΝ ΜΕΤΡΗΤΗ ΠΟΥ ΘΑ ΜΕΤΡΑΕΙ ΤΙΣ ΠΑΡΑΓΟΜΕΝΕΣ ΕΞΑΔΕΣ
		
		//ΟΙ for ΠΑΡΑΚΑΤΩ ΠΑΡΑΓΟΥΝ ΟΛΕΣ ΤΙΣ ΠΙΘΑΝΕΣ ΕΞΑΔΕΣ ΑΠΟ ΤΟΥΣ ΑΡΙΘΜΟΥΣ ΠΟΥ ΘΑ ΕΙΣΑΓΕΙ Ο ΧΡΗΣΤΗΣ 
		for (i=0; i<=p-6; i++)
		{
			for (j=i+1; j<=p-5; j++)
			{
				for (l=j+1; l<= p-4; l++)
				{
					for (k=l+1; k<= p-3; k++)
					{
						for(q=k+1; q<=p-2; q++)
						{
							for(z=q+1; z<=p-1; z++)
							{
								
								int exades[] = new int[6];	//ΔΗΛΩΝΩ ΠΙΝΑΚΑ 6 ΘΕΣΕΩΝ
								// ΚΑΘΕ ΠΙΘΑΝΗ ΕΞΑΔΑ ΑΠΟΘΗΚΕΥΕΤΑΙ ΣΤΟΝ ΕΞΑΘΕΣΙΟ ΠΙΝΑΚΑ exades[]
								   exades[0] = a[i];
								   exades[1] = a[j];
								   exades[2] = a[l];
								   exades[3] = a[k];
								   exades[4] = a[q];
								   exades[5] = a[z];	
								//ΟΛΕΣ ΤΙΣ ΠΙΘΑΝΕΣ ΕΞΑΔΕΣ ΤΙΣ ΠΕΡΝΑΩ ΑΠΟ 5 ΔΙΑΦΟΡΕΤΙΚΑ ΦΙΛΤΑ(ΔΟΜΕΣ ΕΛΕΓΧΟΥ) 
								    if (evenArtia(exades))
								    {//ΚΑΛΟΥΜΕ ΤΗ ΜΕΘΟΔΟ ΠΟΥ ΕΛΕΓΧΕΙ ΑΝ ΥΠΑΡΧΟΥΝ ΠΕΡΙΣΣΟΤΕΡΟΙ ΑΠΟ 4 ΑΡΤΙΟΙ ΣΕ ΚΑΘΕ ΕΞΑΔΑ
								    
								    	if (evenPeriti(exades))
								    	{// ΚΑΛΟΥΜΕ ΤΗ ΜΕΘΟΔΟ ΠΟΥ ΕΛΕΓΧΕΙ ΑΝ ΥΠΑΡΧΟΥΝ ΠΕΡΙΣΣΟΤΕΡΟΙ ΑΠΟ 4 ΠΕΡΙΤΤΟΙ ΣΕ ΚΑΘΕ ΕΞΑΔΑ
								    		
								    		if (evenSinexomenoi(exades))
								    		{//ΚΑΛΟΥΜΕ ΤΗ ΜΕΘΟΔΟ ΠΟΥ ΕΛΕΓΧΕΙ ΑΝ ΥΠΑΡΧΟΥΝ ΠΕΡΙΣΣΟΤΕΡΟΙ ΑΠΟ 2 ΣΥΝΕΧΟΜΕΝΟΙ ΑΡΙΘΜΟΙ ΣΕ ΚΑΘΕ ΕΞΑΔΑ
								    	
								    			if(evenDekada(exades))
								    			{//ΚΑΛΟΥΜΕ ΤΗ ΜΕΘΟΔΟ ΠΟΥ ΕΛΕΓΧΕΙ ΑΝ ΥΠΑΡΧΟΥΝ ΠΕΡΙΣΣΟΤΕΡΟΙ ΑΠΟ 2 ΑΡΙΘΜΟΙ ΣΤΗΝ ΙΔΙΑ ΔΕΚΑΔΑ ΣΕ ΚΑΘΕ ΕΞΑΔΑ
								    			
								    				if (evenLigontas(exades))
								    				{//ΚΑΛΟΥΜΕ ΤΗ ΜΕΘΟΔΟ ΠΟΥ ΕΛΕΓΧΕΙ ΑΝ ΥΠΑΡΧΟΥΝ ΠΕΡΙΣΣΟΤΕΡΟΙ ΑΠΟ 2 ΑΡΙΘΜΟΙ ME TON ΙΔΙΟ ΛΙΓΟΝΤΑ ΣΕ ΚΑΘΕ ΕΞΑΔΑ
								    					
								    					// ΕΦΟΣΟΝ ΙΣΧΥΟΥΝ ΚΑΙ ΤΑ 5 ΤΑ ΠΡΟΑΠΑΙΤΟΥΜΕΝΑ ΦΙΛΤΡΑ ΤΟ ΠΡΟΓΡΑΜΜΑ ΕΜΦΑΝΙΖΕΙ ΤΙΣ ΤΥΧΕΡΕΣ ΕΞΑΔΕΣ ΤΙΣ ΟΠΟΙΕΣ ΕΞΑΕΙ ΣΕ ΕΝΑ ΑΡΧΕΙΟ .txt
								    					System.out.println(count++ +"."+" " + exades[0]+ " " + exades[1]+ " " + exades[2] + " " + exades[3] + " " + exades[4] + " " + exades[5] );
								    					
								    					
								    				}
								    			}
								    		}	
								    	}
								    }  	    		
							}
						}
					}
				}	
			}
		}
	}
	public static boolean evenArtia (int exada[]) //ΜΕΘΟΔΟΣ ΠΟΥ ΕΛΕΓΧΕΙ ΑΝ ΥΠΑΡΧΟΥΝ ΠΕΡΙΣΣΟΤΕΡΟΙ ΑΠΟ 4 ΑΡΤΙΟΙ ΣΕ ΚΑΘΕ ΕΞΑΔΑ
	{	
		
		int artios=0, x;
		for( x=0; x<6; x++)
			if((exada[x])%2==0) 
			{
				artios++;
				
				if (artios>4)
				{
					return false;
				}
			}
		return true;
	}
	public static boolean evenPeriti (int exada[])//ΜΕΘΟΔΟΣ ΠΟΥ ΕΛΕΓΧΕΙ ΑΝ ΥΠΑΡΧΟΥΝ ΠΕΡΙΣΣΟΤΕΡΟΙ ΑΠΟ 4 ΠΕΡΙΤΤΟΙ ΣΕ ΚΑΘΕ ΕΞΑΔΑ
	{
		
		int peritos=0,y;
		for( y=0; y<6; y++)
			if (exada[y]%2!=0) 
			{
				peritos++;
				
				if(peritos>4)
				{
					return false;
				}
			}
		return true;
	}
	public static boolean evenSinexomenoi (int exada[])//ΜΕΘΟΔΟΣ ΠΟΥ ΕΛΕΓΧΕΙ ΑΝ ΥΠΑΡΧΟΥΝ ΠΕΡΙΣΣΟΤΕΡΟΙ ΑΠΟ 2 ΣΥΝΕΧΟΜΕΝΟΙ ΑΡΙΘΜΟΙ ΣΕ ΚΑΘΕ ΕΞΑΔΑ
	{
	
		
		for( int u=0; u<4; u++)
		{
			if ((exada[u]+1)==exada[u+1]&&(exada[u+1]+1)==exada[u+2])//ΕΛΕΓΧΕΙ ΑΝ ΤΡΕΙΣ ΑΚΕΡΑΙΟΙ ΕΙΝΑΙ ΣΥΝΕΧΟΜΕΝΟΙ  
			{
				return false;
			}
		}
		return true;
		
	}
	public static boolean evenDekada (int exada[])//ΜΕΘΟΔΟΣ ΠΟΥ ΕΛΕΓΧΕΙ ΑΝ ΥΠΑΡΧΟΥΝ ΠΕΡΙΣΣΟΤΕΡΟΙ ΑΠΟ 2 ΑΡΙΘΜΟΙ ΣΤΗΝ ΙΔΙΑ ΔΕΚΑΔΑ ΣΕ ΚΑΘΕ ΕΞΑΔΑ
	{

		int e,r;
		
			for (e=0; e<4; e++)
			{//ΕΛΕΓΧΟΥΜΕ ΤΟΥΣ 4 ΑΡΙΘΜΟΥΣ
				
				int dekada=0;         //ΑΡΧΕΙΚΟΠΟΙΟΥΜΕ ΕΣΩΤΕΡΙΚΑ ΤΗΣ ΠΡΩΤΗΣ for ΓΙΑ ΝΑ ΥΠΟΛΟΓΙΖΕΙ ΤΟ ΠΛΗΘΟΣ ΤΩΝ ΕΛΕΓΧΩΝ ΞΕΧΩΡΙΣΤΑ ΣΕ ΚΑΘΕ ΔΕΚΑΔΑ ΑΛΛΙΩΣ ΘΑ ΥΠΟΛΟΓΙΖΕ ΣΥΝΟΛΙΚΑ ΚΑΘΕ ΦΟΡΑ ΠΟΥ ΘΑ ΕΒΡΙΣΚΕ ΑΡΙΜΟΥΣ ΣΕ ΔΕΚΑΔΑ
				
				for (r=(e+1); r<6; r++)
				{
					
					if ((exada[e]/10)==(exada[r]/10)) //ΕΛΕΓΧΕΙ ΑΝ ΤΟ ΑΚΕΡΑΙΟ ΜΕΡΟΣ ΤΗΣ ΔΙΑΙΡΕΣΕΙΣ 2 ΑΚΕΡΑΙΩΝ ΜΕ ΤΟ 10 ΕΙΝΑΙ ΙΣΟ, ΤΟΤΕ ΑΝΗΚΟΥΝ ΣΤΗΝ ΙΔΙΑ ΔΕΚΑΔΑ
					{
							dekada ++;
							
							if (dekada>=2)// ΑΝΤΙΜΕΤΩΠΙΖΟΥΜΕ ΤΗΝ dekada  ΣΑΝ ΠΛΗΘΟΣ ΣΥΓΚΡΙΣΕΩΝ ΚΑΙ ΟΧΙ ΣΑΝ ΠΛΗΘΟΣ ΑΡΙΘΜΩΝ
							{	//ΚΑΘΕ ΦΟΡΑ ΠΟΥ ΞΕΠΕΡΝΑΕΙ ΤΟ 2 ΣΠΑΕΙ Η ΜΕΘΟΔΟΣ
								
								return false;
							}
					}
				}
			}
			return true;
	}
	public static boolean evenLigontas (int exada[])//ΜΕΘΟΔΟΣ ΠΟΥ ΕΛΕΓΧΕΙ ΑΝ ΥΠΑΡΧΟΥΝ ΠΕΡΙΣΣΟΤΕΡΟΙ ΑΠΟ 2 ΑΡΙΘΜΟΙ ME TON ΙΔΙΟ ΛΙΓΟΝΤΑ ΣΕ ΚΑΘΕ ΕΞΑΔΑ
	{

		int f,m;
		
		for (f=0; f<4; f++)
		{//ΕΛΕΓΧΟΥΜΕ ΤΟΥΣ 4 ΑΡΙΘΜΟΥΣ
			
			int ligontas=0;          
			
			for (m=(f+1); m<6; m++)
			{
				
				if ((exada[f]%10)==(exada[m]%10)) //ΕΛΕΓΧΕΙ ΑΝ ΤΟ ΑΚΕΡΑΙΟ ΥΠΟΛΟΙΠΟ ΤΗΣ ΔΙΑΙΡΕΣΕΙΣ 2 ΑΚΕΡΑΙΩΝ ΜΕ ΤΟ 10 ΕΙΝΑΙ ΙΣΟ, ΑΝ ΝΑΙ ΤΟΤΕ ΕΧΟΥΝ ΤΟΝ ΙΔΙΟ ΛΙΓΟΝΤΑ
				{
						ligontas ++;
						
						if (ligontas>=2)// ΑΝΤΙΜΕΤΩΠΙΖΟΥΜΕ ΤΗΝ dekada  ΣΑΝ ΠΛΗΘΟΣ ΣΥΓΚΡΙΣΕΩΝ ΚΑΙ ΟΧΙ ΣΑΝ ΠΛΗΘΟΣ ΑΡΙΘΜΩΝ
						{	//ΚΑΘΕ ΦΟΡΑ ΠΟΥ ΞΕΠΕΡΝΑΕΙ ΤΟ 2 ΣΠΑΕΙ Η ΜΕΘΟΔΟΣ
							
							return false;
						}
				}
			}
		}
		return true;

	}
}
