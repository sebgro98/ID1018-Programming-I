public class Main {

	public static void main(String[] args) {
		Array a = new Array(4);
        System.out.println(a.capacity());
        System.out.println(a.size());
        
        a.add (new String ("aaaa"));
        a.add (new StringBuilder ("xxxxx"));
        //a.add (new Integer (25));
        
        System.out.println(a.capacity());
        System.out.println(a.size());
        
        a.add(new String ("bbbbb"));
        a.add (new StringBuilder ("yyyyy"));
        System.out.println(a.capacity());
        System.out.println(a.size());
        
        System.out.println(a.get(2));
        
        System.out.println(a);
	}

}
