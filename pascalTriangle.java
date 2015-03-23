public ArrayList<ArrayList<Integer>> generate (int numRows) {
	ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();

	ArrayList<Integer> first = new ArrayList<Integer>();
	first.add(1);
	ret.add(first);

	int i;
	for(i = 2; i <= numRows; i++){
		ArrayList<Integer> cur = new ArrayList<Integer>();
		cur.add(1);
	
		int j;
		for(j = 0; j < first.length() - 1; j++){
			cur.add(first.get(j) + first.get(j+1));
		}
		cur.add(1);
		
		ret.add(cur);
		first = cur;
	}
	return ret;
}
