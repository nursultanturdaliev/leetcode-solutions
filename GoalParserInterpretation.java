class GoalParserInterpretation {
    public String interpret(String command) {
        
        StringBuilder sb = new StringBuilder();
        char ch;
        for(int i = 0; i< command.length();) {
            ch = command.charAt(i);
            
            if(ch == 'G') {
                sb.append('G');
                i+=1;
            }
            else if(ch == '(') {
                if(command.charAt(i+1) == ')') {
                    sb.append('o');
                    i+=2;
                }else {
                    sb.append('a');
                    sb.append('l');
                    i+=4;
                }
            }
        }
        
        return sb.toString();
    }
}
