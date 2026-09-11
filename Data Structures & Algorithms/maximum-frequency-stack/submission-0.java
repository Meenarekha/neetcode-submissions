class FreqStack {
    HashMap<Integer, Integer> freq;
    HashMap<Integer, Stack<Integer>> group;
    int maxfreq;

    public FreqStack() {
        freq = new HashMap<>();
        group = new HashMap<>();
        maxfreq = 0;
    }
    
    public void push(int val) {
        int f = freq.getOrDefault(val,0)+1;
        freq.put(val,f);
        if(!group.containsKey(f)){
            group.put(f,new Stack<>());
        }
        group.get(f).push(val);
        maxfreq = Math.max(maxfreq,f);
    }
    
    public int pop() {
        Stack<Integer> stack = group.get(maxfreq);
        int val = stack.pop();
        freq.put(val,freq.get(val)-1);

        if(stack.isEmpty()){
            maxfreq--;
        }
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */