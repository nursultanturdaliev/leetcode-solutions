class ReplaceAllDigitswithCharacters {
    public String replaceDigits(String s) {
        
        StringBuilder sb = new StringBuilder(s.length());
        
        for(int i = 0; i< s.length(); i++) {
            if(i%2 == 0) {
                sb.append(s.charAt(i));
            }else {
                int num = s.charAt(i) - 48;
                int ch = s.charAt(i-1) + num;
                sb.append((char)ch);
            }
        }
        
        return sb.toString();
        
    }
}
