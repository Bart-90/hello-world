public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		
	}

	public String solution(String s) {
        
		
        int length = s.length();
        int div = length % 2;
        int mod = length / 2;
        String answer = "";
        
        if(div == 0) 
        	answer = s.substring(mod, mod+1);
        else
        	answer = s.substring(mod+1);
        
        return answer;
    }
	
}
