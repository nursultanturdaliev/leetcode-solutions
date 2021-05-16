class SplitaStringinBalancedStrings {
    public int balancedStringSplit(String s) {
        
        int balancedStrings = 0;
        
        int index = 0;
        int Lcount = 0, Rcount = 0;
        while(index< s.length()) {
            
            if(s.charAt(index) == 'R') {
                Rcount++;
            } else {
                Lcount++;
            }
            if(Rcount == Lcount) {
                balancedStrings++;
                Rcount = 0;
                Lcount = 0;
            }
            
            index++;
        }
        
        return balancedStrings;
    }
}
