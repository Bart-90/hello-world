public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		System.out.println(test.solution("12345"));
		
	
	}

	public String solution(String s) {
        
		String answer = "";
        int length = s.length();
        int div = length % 2;
        int mod = length / 2;
        
        
        if(div == 0) {
        	answer = s.substring(mod-1, mod-1);
        }else {
        	answer = s.substring(mod);
        }
        
        return answer;
    }
	
}
