class intTuple implements Comparable<intTuple>{
	private int[] elements;
	
	public intTuple() {
	}
	public intTuple(int...elements) {
		this.elements=elements;
	}
	public int[] getElements() {
		return elements;
	}
	public void setElements(int[] elements) {
		this.elements = elements;
	}

	@Override
	public int compareTo(intTuple T) {
		int n = elements.length>T.getElements().length?T.getElements().length:elements.length; //길이가 짧은 배열을 기준으로한다.
		if(n==0) return elements.length-T.getElements().length; //길이가 없으면 비교할게 없으니깐 끝으로 이동
		for(int i=0;i<n;i++) {
			if(elements[i]!=T.getElements()[i]) return elements[i]-T.getElements()[i];//같은 위치에 있는 배열 비교
		}
		return 0; 
	}
	
}
class doubleTuple implements Comparable<doubleTuple>{
	private double[] elements;
	
	public doubleTuple() {
	}
	public doubleTuple(double...elements) {
		this.elements=elements;
	}
	public double[] getElements() {
		return elements;
	}
	public void setElements(double[] elements) {
		this.elements = elements;
	}

	@Override
	public int compareTo(doubleTuple T) {
		double n = elements.length>T.getElements().length?T.getElements().length:elements.length;
		int i=0; //길이가 짧은 배열을 기준으로한다.
		if(n==0) return elements.length-T.getElements().length; //길이가 없으면 비교할게 없으니깐 끝으로 이동
		for(;i<n;i++) {
			if(elements[i]!=T.getElements()[i]) return (elements[i]>T.getElements()[i]?1:-1);//같은 위치에 있는 배열 비교
		}
		return 0;
	}
}
public class gunTuple{
	
	
}
