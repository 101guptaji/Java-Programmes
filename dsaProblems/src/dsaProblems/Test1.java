package dsaProblems;

public class Test1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      
	      String str = "seaside the to sent be to ne2ds army ten of team a";
	      char lastChar = str.charAt(0);
	      StringBuilder sb = new StringBuilder();
	      for(char c : str.toCharArray()) {
	    	  if(Character.isDigit(c)) {
	    		  int x = Character.getNumericValue(c);
	    		  for(int j=0;j<x;j++) {
	    			  sb.append(lastChar);
	    		  }
	    	  }
	    	  else {
	    		  sb.append(c);
	    		  lastChar = c;
	    	  }  
	      }
	      System.out.println(sb.toString());
	      
	      String[] revStr = sb.toString().split(" ");
	      for(int i=revStr.length-1;i>=0;i--) {
	    	  System.out.print(revStr[i]+" ");
	      }
	      
	      
	}

}

