package lab3;

public class box {
	int width;
	int height;
	int length;
	
        int volume() {
		return width*height*length;
		
	}
        
        void para(int w , int h, int l) {
        	width=w;
        	height=h;
        	length=l;
        	
        }
}

