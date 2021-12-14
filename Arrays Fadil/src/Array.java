public class Array {
	 private Object[] e;
	    private int noe;

	    public Array (int capacity ) {

	        this.e = new Object[capacity];
	        noe = 0;
	    }
	    public int capacity () {

	        return e.length;
	    }

	    public int size() {

	        return noe;
	    }

	    public void add (Object el) {

	        if(noe < e.length)
	            e[noe] = el;
	        else {
	            Object[] e1 = new Object[2 * e.length + 2];
	               for( int i = 0; i < e.length; i++)
	                   e1[i] = e[i];
	               e1[noe] = e1;
	               e = e1;
	        }
	        noe++;

	        }
	        public Object get (int index) {

	        if (index < 0 || index >= noe)
	            throw new IndexOutOfBoundsException("Wrong index " + index);

	        return e[index];

	        }

	        public String toString () {
	        String s = "[";
	        if (noe > 0) {
	            for (int i = 0; i < noe - 1; i++)
	                s+= e[i] + ", ";
	            s += e[noe - 1];
	        }
	        s += "]";
	        return s;

	        }

	    }


