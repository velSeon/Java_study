public class Search {	
	private int [] arr;
	private int search;
	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getSearch() {
		return search;
	}

	public void setSearch(int search) {
		this.search = search;
	}

	public Search() {};
	
	public Search(int [] arr,int search) {
		
		this.arr = arr;
		this.search = search;	}
	
public String searchIndex() {

	
	String mesg = "검색값이 없습니다.";	
	for(int i=0; i<arr.length; i++) {	
		if(search == arr[i]) {
			mesg = search+"는 "+i+"번째 방에 있습니다.";			
		}			
		}return mesg;		 		
	}
}
