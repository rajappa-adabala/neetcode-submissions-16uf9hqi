class Solution {

    public String encode(List<String> strs) {
        StringBuilder res=new StringBuilder();
        for(String s:strs){
            res.append(s.length()).append('#').append(s);
        }return res.toString();

    }

    public List<String> decode(String s) {
        List<String> res=new ArrayList<>();
        int i=0;
        while(i<s.length()){
            int j=i;
            while(s.charAt(j)!='#') j++;
            int length=Integer.parseInt(s.substring(i,j));
            j++;
            String word=s.substring(j,j+length);
            res.add(word);
            i=j+length;
        }return res;

    }
}
